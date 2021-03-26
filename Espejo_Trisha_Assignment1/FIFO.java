import java.util.Queue;

public class FIFO {

	public void ATTi(Queue<Integer> x) {
		
		double counter = 0;
		double ATTi = 0;
		double TTi = 0;
		for (int i : x )
		{
			TTi = i++;
			counter++;	
		}
		
		ATTi = TTi / counter;
		
		print(ATTi);
		
	}

	private void print(double aTTi) {
		System.out.println( "The average turnaroundtime is: " + aTTi);
		
		
	}
	
}
