package testingCenter;

public class SingleArr {

	public static void main(String[] args) {
		
		int[] sample = new int[] {1,2,3};
		singleArr(sample);
	}
	
	
	public static void singleArr(int[] n) {
		
		int[] answer = new int[n.length];
		int prefix = 1;
		int suffix = 1;
		
		for (int i = 0; i < n.length; i++) {
			
			answer[i] += prefix;
			prefix *= n[i];
			
		}
		
		for (int i = n.length-1; i > -1; i--) {
			
			answer[i] += suffix;
			suffix *= n[i];
			
		}
	
		for(int k = 0; k<n.length; k++) {
			
			
			System.out.println(answer[k]-1);
			
		}
		
	}

}
