package testingCenter;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] test1 = {1,2,9,3,0,4};
		mergeSort(test1);
		printArray(test1);
		

	}
	
	static int midBoun;
	static int[] leftSubArr;
	static int[] RightSubArr;
	static int[] answerArray;
	
	public static void mergeSort(int[] n) {
		
		if(n.length < 2) {
			
			return;
			
		}
		
		midBoun = n.length/2;
		leftSubArr = new int[midBoun];
		RightSubArr = new int[n.length - midBoun];
		
		for (int i = 0; i < midBoun; i++) {
			
			leftSubArr[i] = n[i];
			
		}
		for (int i = midBoun; i < n.length; i++) {
			
			RightSubArr[i - midBoun] = n[i];
			
		}
		
	  mergeSort(leftSubArr);
	  mergeSort(RightSubArr);
	  
	  merge(n, leftSubArr, RightSubArr);
	  
	  
		
	}
	
	public static void merge(int [] n, int[] leftArr, int[] rightArr) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (j<leftArr.length && k < rightArr.length) {
			
			if (leftArr[j] <= rightArr[k]) {
				
				n[i] = leftArr[j];
				j++;
			
				
			} else {
				
				n[i] = rightArr[k];
				k++;
				
				
			}
			i++;
		}
			
			while (j < leftArr.length) {
								
					n[i] = leftArr[j];
					j++;
					i++;
				
				
			} 
			
			while (k < rightArr.length) {
				
				n[i] = rightArr[k];
				k++;
				i++;
				
		    } 
		
	}

	private static void printArray(int[] numbers) {
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.println(numbers[i]);
	    }
	  }
}
