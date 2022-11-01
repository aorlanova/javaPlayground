package testingCenter;

/* Antonina Orlanova - Fall 2022 - Tues 3pm
 * Array is sorted, and duplicates are removed.*/

public class SortNPop {

	
	public static void main(String[] args) {
		int test1[]  = new int[] {7,9,9,9,11,15,17,1,3,8};
		// 0 test
		int test2[] = new int[] {};
		// 1 case
		int test3[] = new int[] {1};

		sortNRemove(test1);
		sortNRemove(test2);
		sortNRemove(test3);

	}
	
	public static void sortNRemove(int [] n) {
		
		int holder = 0;
		int arrLength = 0;
		
		// for the case that the length is one or zero. Program will not proceed past.
		if (n.length == 1 || n.length == 0) {
			
			System.out.println("Array length is 0 or 1, no sort needed");
			System.out.println("Program complete");
			return;
			
		}
		
		// bubble sort, array elements are switched until they're sorted.
		for (int i = 1; i<n.length; i++) {
			
			// if n[i] is less than it's previous elem, they are switched.
			if (n[i] < n[i-1]) {
				
				holder = n[i];
				n[i] = n[i-1];
				n[i-1] = holder;
				
				i = 0;
				
			} 
			
		}
		
		// holder cleared.
		holder = 0;
		
		// sets length for the non-repeated answer array.
		for (int i = 0; i<n.length; i++) {
			
			if(holder != n[i]) {
				
				arrLength++;
				holder = n[i];
				
			}
		
		}
		
		int answer[] = new int[arrLength];
		int j = 0;
		// inserts non-repetitive elements into the answer array.
		for (int i = 0; i<n.length; i++) {
			
			if(holder != n[i]) {
				
				answer[j] = n[i];
				j++;
				holder = n[i];
				
			}
		
		}
		
		
		// print array.
		for (int i = 0; i<answer.length; i++) {
			
			System.out.println(answer[i]);
		
		}
		System.out.println("Program complete");
}

}