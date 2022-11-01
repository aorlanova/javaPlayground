package testingCenter;

public class RecursionSearch {

	public static void main(String[] args) {

		int classProblem[]  = new int[] {1,3,7,9,11,15,17};
		recursBin(classProblem, 15, classProblem.length); 
		
	}
	
	static int lowBoun = 0;
	static int targetFoundAt = -1;
	static int midBoun = 0;
	
	public static void recursBin(int[] n, int target, int highBoun) {
		
		midBoun = lowBoun + (highBoun - lowBoun)/2;
		
		if(target == n[midBoun]) {
			
			targetFoundAt = midBoun;
			System.out.println(targetFoundAt);
			return;
			
		} else if (target < n[midBoun]) {
			
			highBoun = midBoun-1;
			
		} else if (target > n[midBoun]){
			
			lowBoun = midBoun+1;
			
		} else {
			
			//target non existent.
			return;
			
		}
		System.out.println(targetFoundAt);
		recursBin(n,target,n.length -1); 
		
	}

}
