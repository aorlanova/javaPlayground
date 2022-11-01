package testingCenter;

public class MidtermPractice {

	public static void main(String[] args) {
		int[] test1 = {9,8,7,1,3,5,9};
		//binaryRearchRot(test1,1);
		quickSort(test1);
		//mergeSort(test1);
		//findPivot(test1);
	}
	
	// binary search!
	public static void binaryRearchRot(int[] n, int target) {
		
		int low = 0;
		int high = n.length;
		int mid = low + (high-low)/2;
		int targetAt = -1;
		
		while(targetAt == -1)  {
		mid = low + (high-low)/2;
		if (n[mid] == target) {
			
			targetAt = mid;
			
		} else if (n[mid] > n[low] && target < n[mid] && target > n[low]) {
				// target on the left, pivot on the right
				high = mid-1;
				
				
			} else if (n[mid] < n[high] && target > n[mid] && target < n[high]) {
				// target on the left, pivot on the right
				low = mid +1;
			
			} else if (n[mid] < n[high]) {
				
				high = mid-1;
				
			} else {
				
				low = mid+1;
				
				
			}
			
			
			
		}
		
		System.out.println(targetAt);
		
		
	}
	// binary search over!
	
	public static void findPivot(int[] n) {
		
		int lowBoun = 0;
		int highBoun = n.length -1;
		int pivot = -1;
		int targetFoundAt = -1;
		int midBoun = 0;
		
		// calculates location of smallest element in array.
		while(lowBoun < highBoun) {
			
			System.out.println("Lowboun: " + lowBoun + " highBoun: " + highBoun);
			midBoun = lowBoun + (highBoun - lowBoun)/2;
		
			//midbound is pivot
			if (n[midBoun] < n[midBoun-1]) {
				targetFoundAt = midBoun;
				break;
				
			}
			
			 if ((n[midBoun] < n[lowBoun])) {
				//pivot on left.
				highBoun = midBoun -1;				
				
			} else if (n[midBoun] > n[lowBoun]) {
				//pivot on right
				lowBoun = midBoun +1;
				
			
			}
			 
			
		}
		
		System.out.println(targetFoundAt);
		
	}
	
	static int i = -1;
	public static void quickSort(int[] n) {
		int check = i+1;
		int high = n.length-1;
		int low = 0;
		int pivot = n[high];
		i = -1;
		int holder = 0;
		
		for(int j = 0; j<high; j++) {
			
			if(n[j]< pivot) {
				
				i++;
				holder = n[j];
				n[j] = n[i];
				n[i] = holder;
					
			}
			
			
			
		} holder = n[i+1];
		n[i+1] = n[high];
		n[high] = holder;
		
		if (check != i+1) {
			
			quickSort(n);	
			
		}
		
		for(int k = 0; k<n.length;k++)
		System.out.println(n[k]);
		
		
	}
	
	
	
	// merge sort
	public static void mergeSort(int[] n) {
		
		if(n.length < 2) {
			
			return;
			
		}
		
		int mid = n.length/2;
		int high = n.length;
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[high-mid];
		
		for (int i = 0; i<mid; i++) {
			
			leftHalf[i] = n[i];
			
		}
		
		for (int i = mid; i<high; i++) {
			
			rightHalf[i - mid] = n[i];
			
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		mergeForSort(n,leftHalf,rightHalf);
		
		
	}
	
	public static void mergeForSort(int[] n, int[] leftHalf, int[] rightHalf) {
		
		int i =0;
		int j=0;
		int k=0;
		
		while(j < leftHalf.length && k < rightHalf.length) {
			
			if (leftHalf[j] <= rightHalf[k]) {
				
				n[i] = leftHalf[j];
				j++;
				i++;
				
			} else {
				
				n[i] = leftHalf[k];
				k++;
				i++;
				
			} 
			
			
		}
		
		if(j < leftHalf.length) {
			
			for (int p = j; p<leftHalf.length; p++) {
				n[i] = leftHalf[p];
			i++;
			
			}
		} else if (k < rightHalf.length){
			
			for (int p = k; p<rightHalf.length; p++) {
				n[i] = rightHalf[p];
				i++;
				
			}
			
		}
		
		for(int c = 0; c<n.length; c++)
		System.out.println(n[i]);
		
	}
	
	//merge sort over
	

}
