package testingCenter;

public class LabFive {

	public static void main(String[] args) {
		
		int [] test1 = {50, 11, 33, 21, 40, 50, 40, 40, 21};
		deDuplicate(test1);
		int [] test2 = {0};
		deDuplicate(test2);
		int [] test3 = {};
		deDuplicate(test3);
	}
	
	public static void deDuplicate(int [] n) {
		
		// for the case that length of the array is 0 or 1, no sort is needed.
		if (n.length <= 1) {
			
			System.out.println("array contains 0 or 1 value. No de-duplication needed");
			return;
			
		}
			
		// calls quicksort function (n*log(n))
		n = quickSort(n);

		// initialize ints to allocate space for answer array.
		int holder = 0;
		int length = 0;
		
		// calculate length of the array that should be allocated to hold answer.
		for (int k = 0; k < n.length; k++) {
			
			if (k == 0) {
				
				length++;
				holder = n[k];
				
			} else if (n[k] != holder) {
				
				length++;
				holder = n[k];
				
			} else {
				
				holder = n[k];
				
			}
			
		}
		
		int[] holdAnswer = new int[length];
		
		// de-duplicate array:
		holder = 0;
		int count = 0;
		// deduplicate array by adding non-repeating integers to answer array.
		for (int k = 0; count < holdAnswer.length; k++) {
			
			if (k == 0) {
				
				holder = n[k];
				holdAnswer[count] = n[k];
				count++;
			} else if (n[k] != holder) {
				
				holder = n[k];
				holdAnswer[count] = n[k];
				count++;
			} else {
				
				holder = n[k];
				
			}
			
		}
		
		// print answer array.
		System.out.println("sorted and de-duplicated array: ");
		
		for (int k = 0; k<holdAnswer.length; k++) {
			
			System.out.println(holdAnswer[k]);
			
		}
		
	}

	
		// initializing variables for quick sort function outside because of recursion.
		static int high;
		static int low;
		static int pivot;
		static int i =-1;
		static int check = 100;
		static int holder = 0;
		
		// quick sort function begins here.
		public static int[] quickSort(int[] n) {
			
			
			// update variables.
			check = i+1;
			high = n.length-1;
			low = 0;
			// pivot is the last integer in the array.
			pivot = n[n.length-1];
			i=-1;
			
			// j is set to lowest bound, will iterate to last element.
			for (int j = low; j <= high-1; j++) {
				
				// swaps values at i and j if element at j is less than the pivot.
				if(n[j]<pivot) {
					
					i++;
					holder = n[i];
					n[i] = n[j];
					n[j] = holder;
					
					
				}
				
				
			} 
			// when loop exits, element at i+1 and the element at highbound(pivot point) will switch.
			holder = n[i +1];
			n[i+1] = n[high];
			n[high] = holder;

			// if i+1 changes from previous i+1 value, the array is not yet sorted.
			if (i+1 != check) {
				
				return quickSort(n);
				
			}
			
			// return sorted array.
			return n;
			
		}
		
		
	
	
		
}
