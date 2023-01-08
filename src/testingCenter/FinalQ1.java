package testingCenter;

import java.util.ArrayList;

public class FinalQ1 {

	public static void main(String[] args) {
		
		int[] arrayOne = {1,2,3,4,4,6,6,6};
		deDup(arrayOne);
	}
	

	public static void deDup(int[] n) {
		
		//initialize array
		ArrayList<Integer> hashHolder = new ArrayList<Integer>();
		
		//itterate over each element in the input array
		for(int i = 0; i<n.length; i++) {
			
			//add to answer array iff it doesn't already contain element at i in input array
			if(!hashHolder.contains(n[i])) {
				
				hashHolder.add(n[i]);
				
			}
			
		}
		
		//print to check
		printHash(hashHolder);
		
		
	}
	
	public static void printHash(ArrayList<Integer> n) {
		
		for(int i = 0; i<n.size(); i++) {
			
			
			System.out.println(n.get(i));
			
		}
		
		
	}

}
