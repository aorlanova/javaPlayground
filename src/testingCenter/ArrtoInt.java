package testingCenter;

/* Antonina Orlanova - Fall 2022 Data Structures - Wednesday 3pm
 * This program will turn an array of integer into it's integer equivalent + 1.
 * 
 * */

public class ArrtoInt {

	public static void main(String[] args) {
		
		// normal test cases. One with 9 in one's place.
		int[] b = new int[] {1,2,3,7,0,0,9};
		int[] c = new int[] {1,2,3,7,0,0,0,9,1};
		// testing cases in which the array has one or no elements.
		int[] empty = new int[] {};
		int[] single = new int[] {1};
		
		arrToIt(b);
		arrToIt(c);
		arrToIt(empty);
		arrToIt(single);
		
	}
	
	public static int arrToIt(int[] n) {
		
		// returns -1 if array length is 0.
		if (n.length == 0) {
			
			return -1;
			
		}
		
		int arrInt = 0;
		int power = 0;
		
		// array is turned to an integer equivalent.
		for (int i = n.length-1; i>-1; i--) {
			
			// element at i is added to arrInt with it's proper place.
			arrInt += (n[i] * Math.pow(10, power));
			
			//power that 10 is raised to increases as array iterated over backwards.
			power ++;
			
		}
		
		// one is added to the converted integer.
		arrInt++;
		System.out.println(arrInt);
		return arrInt;
		
	}

}
