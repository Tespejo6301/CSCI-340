import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Converter {
	public void convert(ArrayList<Integer> a, ArrayList<Integer> c) {
		
		
		 Queue<Integer> Ai = new LinkedList<Integer>(); 
		 Queue<Integer> Ti = new LinkedList<Integer>(); 
		 for (int x: a) Ai.add(x);	 
		 for( int y : c)Ti.add(y);
		 
		Scheduler x = new Scheduler();
		
		x.simulator(Ai, Ti);
		 
		
	}
}
