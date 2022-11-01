package testingCenter;

/* Antonina Orlanova - Fall 2022 - MW 3:30pm
 * Program takes two arguments: an entered search of integers and what was found.
 * The program returns a non-duplicated array of what was found of the searched integers.
 * The solution has a time complexity of O(m*n) because it uses a nested for-loop.
 * */


public class AssignmentOneOmn {

	public static void main(String[] args) {
		
		// test 1, given array.
		int[] ARRAY1FOUND = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
		int[] ARRAYSEARCH = {1,7, 5, 6, 9, 11, 11};
		searchmatchOne(ARRAY1FOUND, ARRAYSEARCH);
		// test 2, no values in array.
		int[] test1Found = {};
		int[] test1search = {};
		searchmatchOne(test1Found, test1search);
		
		// test 3, many duplicates, one non-dup at end
		int[] test2 = {1,1,1,1,1,2};
		int[] test2search = {1,1,2};
		searchmatchOne(test2, test2search);

	}
	
	public static void searchmatchOne(int[] found, int[] searched) {
		// test case if length of either search or found is 0.
		if (found.length == 0 || searched.length == 0) {
			
			return;
		}

		// holder and length initialized for length determination.
		int holder = 0;
		int length = 0;
		// determine length of answer array by counting non-duplicated searched elements.
		for (int k = 0; k < searched.length; k++) {
			
			// at 0 index there are no duplicates, increase length, update holder.
			if (k == 0) {
				
				length++;
				holder = searched[k];
				
			// check if duplicate by comparing to holder.
			} else if (searched[k] != holder) {
				
				length++;
				holder = searched[k];
				
			// dup - update holder only.
			} else {
				
				holder = searched[k];
				
			}
			
		}
	
		// length found, holder cleared.
		int[] matchResult = new int[length];
		holder = 0;
		int pointer = 0;
		// sorting by o of n*m.
		for (int i = 0; i < searched.length;i++) {
			
			for (int j = 0; j < found.length; j++) {
				
				  // match found
				  if (found[j] == searched[i]) {
					  
					  // first elem, no need to check against holder. 
					  if (pointer == 0) {
						  
						  matchResult[pointer] = found[j];
						  holder = matchResult[pointer];
						  pointer++;
						  
						// match is not a duplicate.
					  } else if (found[j] != holder) {
						  
						  matchResult[pointer] = found[j];
						  holder = matchResult[pointer];
						  pointer++;
						  
					  }
					  
						   
				  }
					
				}
				
			}
			
		// clear holder
		holder = 0;
	
		// print array.
		System.out.println("Your sorted array. Out of order zeroes represent integers searched for, but not found: ");
		for (int k = 0; k< matchResult.length; k++) {
			
			System.out.println(matchResult[k]);
			
		}
			
}	
	}


