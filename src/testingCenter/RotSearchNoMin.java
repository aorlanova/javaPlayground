package testingCenter;

public class RotSearchNoMin {

	public static void main(String[] args) {
		int classProblem[]  = new int[] {7,9,11,15,17,1,3};
		findElem(classProblem, 1);
		
	}
	
	public static int findElem(int[] n, int target) {
		
		int lowBoun = 0;
		int highBoun = n.length -1;
		int midBoun = lowBoun + (highBoun - lowBoun)/2;
		int targetPoint = -1;
		System.out.println("Lowboun: " + lowBoun + " highBoun: " + highBoun);
		
		if (n[midBoun] == target) {
			
			return midBoun;
			
		}
		
		while (targetPoint == -1) {
			
		 midBoun = lowBoun + (highBoun - lowBoun)/2;
		
		if (n[midBoun] == target) {
			
			targetPoint = midBoun;
			break;
		}
		
		if ((target < n[midBoun] && target > n[lowBoun])) {
			// pivot is on the right side & target is in lower half.
			highBoun = midBoun-1;
			//System.out.println("Lowboun: " + lowBoun + " highBoun: " + highBoun);
			
		} else if ((target > n[midBoun] && target < n[highBoun])) {
			//pivot is on the left side or target is in higher half.
			lowBoun = midBoun +1;
			
			
		}  else if (n[midBoun] > n[lowBoun]) {
			// target in an unsorted right array.
			lowBoun = midBoun + 1;
			
		} else if(n[midBoun] < n[lowBoun]) {
			// target in unsorted on left.
			highBoun = midBoun -1;
			
		}
		System.out.println("Lowboun: " + lowBoun + " highBoun: " + highBoun);
		
		}
		System.out.println(targetPoint);
		return targetPoint;
	}

}
