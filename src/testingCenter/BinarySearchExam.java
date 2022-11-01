package testingCenter;

public class BinarySearchExam {

	public static void main(String[] args) {
		// test one, expected outcome: target is at position one.
		int[] test1 = {11, 21, 33, 40, 50};
		binarySearch(test1, 21);
	}
	
	public static void binarySearch(int[] n, int target) {
		
		// declare variables.
		int high = n.length-1;
		int low = 0;
		int middle = low + (high-low)/2;
		int targetAt = -1;
		
		// while target is not found, loop binary search algorithm.
		while (targetAt == -1) {
			//update middle initial each loop.
			middle = low + (high-low)/2;
			
			// if middle index holds target, update target var and break.
			if(n[middle] == target) {
				
				targetAt = middle;
				break;
				
			// if middle value is less than target, low bound is one more than middle.
			} else if (n[middle] < target) {
				
				low = middle+1;
			// if middle value is higher than target, high bound is one less than the middle.
			} else if (n[middle] > target) {
				
				high = middle-1;
				
			}
		
		}
		
		// print result.
		System.out.println("the target, " + target + " is at index: " + targetAt);
		
	}

}
