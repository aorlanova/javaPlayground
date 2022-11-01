package testingCenter;

public class ToTheTop {

	public static void main(String[] args) {
		
		System.out.println(upTop(9));

	}
	
	
	
	public static int upTop(int stepNum) {
		
		if ( stepNum < 2 ) {
			
	        return 1;
	        
		} else {
			
	        return upTop(stepNum-1) + upTop(stepNum-2);
	        
	}
		
	}
	

	
}
