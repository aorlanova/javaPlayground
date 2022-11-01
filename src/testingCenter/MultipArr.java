package testingCenter;

public class MultipArr {

	public static void main(String[] args) {
		int[] sample = new int[] {1,2,3};
		extraArrayMult(sample);

	}
	
	public static void extraArrayMult(int[] n) {
		int[] prefix = new int[n.length];
		int[] suffix = new int[n.length];
		int[] answer = new int[n.length];
		int holder = 1;
		//System.out.println(prefix[1]);
		
		for (int i = 0; i < n.length; i++) {
			
			
			prefix[i] = holder;
			holder *= n[i];
			
			
		}
		
		holder = 1;
		
		for (int i = n.length-1; i > -1; i--) {
			
			suffix[i] = holder;
			holder *= n[i];
			
		}
		
		for(int j = 0; j<n.length; j++) {
			
			answer[j] = suffix[j]*prefix[j];
			
			
		}
 		
		for(int k = 0; k<n.length; k++) {
			
			
			System.out.println(answer[k]);
			
		}
		
	}

}
