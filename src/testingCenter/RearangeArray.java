package testingCenter;

/* Antonina Orlanova - Fall 2022 Data Structures - Wednesday 3pm
 * This program will re-arrange an array of integers in ascending order.
 * 
 * */

public class RearangeArray {

	public static void main(String[] args) {
		
		int[] b = new int[] {1,2,3,7,0,0,0};
		int[] c = new int[] {1,2,3,7,0,0,0,9,10000};
		int[] empty = new int[] {};
		int[] single = new int[] {1};
		rearange(b);
		rearange(c);
		rearange(empty);
		rearange(single);

	}
	
	public static int[] rearange(int[] n) {
		// does not enter sorting for loops if array is empty or has a length of one.
		if (n.length == 0 || n.length == 1) {
			
			return n;
			
		}
		
		// Array is sorted in this block of code. 
		//outer for loop
		for (int i = 0; i<n.length-1; i++) {
			//inner for loop.
			for (int l = i+1; l< n.length; l++) {
				
				//if left element in array is more than the right, two are swapped.
				if (n[i] > n[l]) {
					
					int hold = n[i];
					n[i] = n[l];
					n[l] = hold;
			
				}
				
			}
			//sorting is over
			
			
		}
		
		//array printed for testing purposes.
		for(int k = 0; k<n.length; k++) {
			
			System.out.println(n[k]);
			
		}
		System.out.println("end of array sort");
		
		//sorted array returned.
		return n;
		
	}

}
