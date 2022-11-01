package testingCenter;

public class TryingStepProblem {

	public static void main(String[] args) {
		
		System.out.println(numOfWays(3));
		System.out.println(numOfWays(5));

	}
	
	public static int numOfWays(int steps) {
		
		if (steps < 3) {
			
			
			return 1;
			
		}
		
		else {
			
			return numOfWays(steps -1) + numOfWays(steps -2);
			
		}
		
		
	}

}
