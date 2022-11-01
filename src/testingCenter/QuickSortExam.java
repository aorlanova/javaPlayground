package testingCenter;

public class QuickSortExam {

	public static void main(String[] args) {
		
		int[] test1 = {50, 11, 33, 21, 40, 50, 40, 40, 21};
		quickSearch(test1);
		
		
	}

	// static int to update check when using recursion
	static int i = -1;
	 
	// quicksort begins
	public static void quickSearch(int[] n) {
		
		// variables declared.
		int check = i+1;
		// i will originally be less than j by one.
		i=-1;
		int high = n.length-1;
		int pivot = n[high];
		int holder = 0;
		
		
		for (int j = 0; j<high; j++) {
			
			// while iterating over the array, check if n[j] less than pivot, otherwise do nothing.
			if(n[j] < pivot) {
				
				// increment i and switch positions with j and i
				i++;
				holder = n[j];
				n[j] = n[i];
				n[i] = holder;
				
				
			}
			
		//exit for loop, change positions with i+1 and the pivot, which is at high in this case.	
		} holder = n[i+1];
		n[i+1] = n[high];
		n[high] = holder;
		
		// if the pivot moves, the program should be run again, otherwise print the sorted array.
		if(i+1 != check) {
			
			quickSearch(n);
			
		} else {
			
			System.out.println("This is the sorted array: ");
			for(int k = 0; k<n.length;k++)
			System.out.println(n[k]);
			
			
		}
		
		
		
		
	}

}
