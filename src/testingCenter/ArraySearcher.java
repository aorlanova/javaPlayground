package testingCenter;

public class ArraySearcher {

	public static void main(String[] args) {
		
		int[] arr; 
		arr = new int[7];
		arr[0]	= 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		arr[5] = 7;
		arr[6] = 1;
		
		simpItter(arr, 4);
		searchItter(arr, 4);
	}
	
	public static void simpItter(int[] p, int target) {
		
		
		for (int i = 0; i<p.length; i++) {
			
			if (p[i] == target) {
				
				System.out.println("your target is at index: " + i);
				break;
				
			}
			
		}
		
	}
	
	public static void searchItter(int[] p, int target) {
		
		int leftmost = 0;
		int rightmost = p.length - 1;
		int middleIndex = leftmost + ((rightmost - leftmost)/2);
		int indexAtNum = -2;
		
		while (indexAtNum == -2) {
			
			if (p[middleIndex] == target) {
				
				indexAtNum = middleIndex;
				break;
				
			} else if (p[middleIndex] > target) {
				
				rightmost = middleIndex -1;
				leftmost = 0;
				middleIndex = leftmost + ((rightmost - leftmost)/2);
				
				
			} else if(p[middleIndex] < target) {
				
				leftmost = middleIndex +1;
				rightmost = p.length - 1;
				middleIndex = leftmost + ((rightmost - leftmost)/2);
				
			}
		
			
		}
		
		System.out.println("the number is at index: " + indexAtNum);
		
	}
	
	
}
