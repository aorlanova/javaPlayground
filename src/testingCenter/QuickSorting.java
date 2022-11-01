package testingCenter;

public class QuickSorting {

	public static void main(String[] args) {
		
		int[] test1 = {10,80,30,90,40,50,70};
		quickSort(test1);
	}
	
	static int high;
	static int low;
	static int pivot;
	static int i =-1;
	static int check = 100;
	static int holder = 0;
	
	public static int[] quickSort(int[] n) {
		
		check = i+1;
		high = n.length-1;
		low = 0;
		pivot = n[n.length-1];
		i=-1;
		
		for (int j = low; j <= high-1; j++) {
			
			if(n[j]<pivot) {
				
				i++;
				holder = n[i];
				n[i] = n[j];
				n[j] = holder;
				
				
			}
			
			
		} holder = n[i +1];
		n[i+1] = n[high];
		n[high] = holder;

		if (i+1 != check) {
			
			return quickSort(n);
			
		}
		for (int k = 0; k<n.length; k++) {
			
			System.out.println(n[k]);
			
		}
		
		return n;
		
	}

}
