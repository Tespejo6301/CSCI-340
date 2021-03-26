import java.util.ArrayList;
import java.util.Random;
public class Sorter {

	
	private static int n;
	private static int k;
	private static int d;
	private static int v;
	
   
	public Sorter(int a, int x, int y, int z){
	n = a;
    k = x;
	d = y;
	v = z;
	}
	
	public void Data() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		Converter x = new Converter();
		 A = Arrival();
		 C = CPUTime();
	    // sort(A, C);
	     
		 
		// x.convert(A,C);
		 
		 
	}
	
	private ArrayList<Integer> Arrival() {
		Random r = new Random();
		int A;
		ArrayList<Integer> x =new ArrayList<Integer>();
		for (int i = 0; i < n;  i++)
        {
		 	
			 A = (int) (r.nextDouble() * k);
        	 x.add(A);
        	
        }
		return x;
		
	}
	private ArrayList<Integer> CPUTime() {
		Random r = new Random();
		int T;
		ArrayList<Integer> y =new ArrayList<Integer>();
		for (int i = 0; i < n;  i++)
        {
			 T = (int) ((r.nextGaussian() * v)+ d); 
        	 y.add(T);
        	 System.out.print(y);
        	
        }
		
		return y;
		
	}

	private void sort(ArrayList<Integer> a, ArrayList<Integer> t ) {
		int temp1, temp2;
		
		
		for(int i = 0; i < a.size(); i++)
		{
			
			
			for (int j = a.size() - 1; j > i; j--)
			{
				if(a.get(i) > a.get(j))
				{
					temp1 = a.get(i);
					temp2 = t.get(i);
					a.set(i, a.get(j));
					t.set(i, a.get(j));
					a.set(j,temp1);
					t.set(j,temp2);
				}
			}
		}	
	}

	


}