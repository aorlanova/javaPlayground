package testingCenter;

/* Antonina Orlanova - Fall 2022 - MW 3:30pm
 * Program takes two arguments: an entered search of integers and what was found.
 * The program returns a non-duplicated array of what was found of the searched integers.
 * The solution has a time complexity of O(log(n)) because it uses binary-search.
 * 
 * PART 3:
 * By de-duplicating both arrays, O(n+m) before checking for matches, we can reduce time complexity. 
 * This is because an element that is searched for should be in the appropriate position, 
 * Something not guaranteed with an array with duplicates.
 * */

public class AssignmentOneOlogn {

	public static void main(String[] args) {
		
		int[] ARRAYFOUND = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
		int[] ARRAYSEARCH = {1,7, 5, 6, 9, 11, 11};
		binaryMatch(ARRAYSEARCH, ARRAYFOUND);
		int[] test1 = {};
		int[] test1search = {};
		binaryMatch(test1, test1search);
		
		int[] test2 = {1,1,1,1,1,2};
		int[] test2search = {1,1,2};
		binaryMatch(test2, test2search);
		
	}
	
	public static void binaryMatch(int[] searched, int[] found) {
		int holder = 0;
		int target = -2;
		int count = 0;
		
		
		int holdIndex = 0;
		int leftmost = 0;
		int rightmost = found.length - 1;
		int middleIndex = leftmost + ((rightmost - leftmost)/2);
		int indexAtNum = -2;
		int count2 = 0;
		
		int pointer = 0;
		holder = 0;
		int length = 0;
		// determine length of array to best of ability by counting non-duplicated searched elements.
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
		
		holder = 0;
		int[] holdAnswer = new int[length];
		
		// whole loop continues until count pointer reaches the end of search array
		while (count < searched.length) {
		// find target for search, cannot be duplicated. 
		while (target == -2 && count < searched.length) {
			
			// first element will become target.
			if (count < 1) {
				
				target = searched[count];
				holder = searched[count];
				
			// target found that is a non-dup
			} else if (searched[count] != holder){
				
				target = searched[count];
				holder = searched[count];
				
			} else {
				// dup, update holder only.
				holder = searched[count];
				
			}
			
			count++;
			
		}
		// end of target find.
	
		// binary search. won't run more than (searched.length/2) + 1, otherwise infinite for targets not found.
		while (indexAtNum == -2 && count2 < (searched.length/2) + 1) {
			
			// target found
			if (found[middleIndex] == target) {
				
				indexAtNum = middleIndex;
				holdAnswer[holdIndex] = target;
				holdIndex++;
				break;
			
			// target less than middle index element. highBound becomes middle -1.
			} else if (found[middleIndex] > target) {
				
				rightmost = middleIndex -1;
				leftmost = 0;
				middleIndex = leftmost + ((rightmost - leftmost)/2);
				
			// target more than middle index element. lowbound becomes middle +1.	
			} else if(found[middleIndex] < target) {
				
				leftmost = middleIndex +1;
				rightmost = found.length - 1;
				middleIndex = leftmost + ((rightmost - leftmost)/2);
				
			}
			
			count2++;
			
		}
		// reset pointers.
		target = -2;
		count2 = 0;
		leftmost = 0;
		rightmost = found.length - 1;
		indexAtNum = -2;
		
	}
		//print non-dup match array.
		System.out.println("Your sorted array where out of order zero represents non-duplicate integers not found: ");
		for (int i = 0; i < holdAnswer.length; i++) {
			
			System.out.println(holdAnswer[i]);
			
		}
	
	}

}
