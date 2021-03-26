import java.util.LinkedList;
import java.util.Queue; 

public class Scheduler {
	
	
	public void simulator(Queue<Integer> ai, Queue<Integer> ti) 
	{
		int t = 0; 
		int Ai = 0;
		int Ri = 0;
		int Active = 0;
		Queue<Integer> TTi = new LinkedList<Integer>();	
		FIFO AVG = new FIFO();
		Active = 1;
		
		Ai = ai.remove();
		t = Ai;
		
		
			while(true)
			{
				t++;
				
				if (Active == 0  &&ai.size() > 0  )
				{
					Ai = ai.remove();
					Ri = ti.remove();
					Active = 1;
					
				}
				if (Active == 1)
				{
						
					Ri--; 		
					if (Ri == 0){
						
						Active = 0;
						
						TTi.add(t - Ai); 
						TTi.size();
					}
					
				}	
				if(ai.isEmpty() && Active == 0) break;
				
			}
			
			AVG.ATTi(TTi);
		}

	}



