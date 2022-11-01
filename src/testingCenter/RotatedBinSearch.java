package testingCenter;

public class RotatedBinSearch {

	public static void main(String[] args) {
		
		int variable[]  = new int[] {3,4,5,6,1,2};
		int oneElem[]  = new int[] {3};
		int middleIsPiv[]  = new int[] {4,5,1,2,3};
		//modifBin(variable, 1);
		//modifBin(oneElem, 3);
		modifBin(middleIsPiv, 2);
		
	}
	
	public static void modifBin(int[] n, int target) {
		
		int lowBoun = 0;
		int highBoun = n.length -1;
		int pivot = -1;
		int targetFoundAt = -1;
		int currentLowest = 100;
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
			 
			
		} // location of pivot found
		
		System.out.println("Pivot at: " + targetFoundAt);
		int start = midBoun;
		lowBoun = 0;
		highBoun = n.length-1;
		
		// checks which "sub array" to look for target in. Start is the pivot
		if (target >= n[start] && target <= n[highBoun]) {
			
			highBoun = n.length-1;
			lowBoun = start;
			
		} else if (target >= n[lowBoun] && target <= n[start]) {
			
			highBoun = start;
			lowBoun = 0;
			
		}
		
		System.out.println("The range of target is between: " + lowBoun + " " + highBoun);
		
		// regular binary search in sub-array.
		while (targetFoundAt == -1) {
			
			midBoun = lowBoun + (highBoun - lowBoun)/2;
			
			if (n[midBoun] == target) {
				
				targetFoundAt = midBoun;
				
			} else if (target < n[midBoun]) {
				
				highBoun = midBoun -1;
				
			} else if (target > n[midBoun]) {
				
				lowBoun = midBoun+1;
				
				
			}
			
		}
		
		
		System.out.println("Target is at: " + targetFoundAt);
		
	}

}
