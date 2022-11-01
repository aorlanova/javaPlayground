package testingCenter;

/* Antonina Orlanova -Fall 2022 - Data Structures Wed. 3pm
 * this program rotates an n*n matrix 90 degrees clockwise.
 *  This program uses an old array to switch values to creates the updates rotated array.
 *  
 *  The program's time complexity does not change, because the array length could be countably infinite.
 *  However, we are removing a data structure that is O(n). This takes up less memory and is therefore the better solution.
 *  */

public class ClockwiseTwo {
	// main method.
	public static void main(String[] args) {
		
		int[][] two = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateClockwise(two);
	}
	
	//rotate clockwise method, parameter is a 2D array.
	public static void rotateClockwise(int[][] n) {
		// holders for values to be switched.
		int holder1 = 0;
		int holder2 = 0;
		
		// outer for loop for depicting sections.
		// sections are individual hollow squares, starting with the outside.
		for (int i = 0; i<(n.length/2); i++) {
			// inner for loop will loop over rotating "sections"
			for(int j = i; j<n.length-i-1; j++) {
				
				// array elements are switched in their sections.
				holder1 = n[j+i][n.length-1-i];
				n[j+i][n.length-1-i] = n[i][j+i];
				holder2 = n[n.length -1 -i][n.length-j-1-i];
				n[n.length -1 -i][n.length-j-1-i] = holder1;
				n[i][j+i] = n[n.length-1 -j-i][i];
				n[n.length-1 -j-i][i] = holder2;
				
				
				
			}
			
		}
		
			
		// here, array is printed	
		//count variable to depict the current row.
		int count = 1;
		
		for (int i = 0; i < n.length; i ++) {
			System.out.println("row " + count);
			for (int j = 0; j < n.length; j++) {
				
				
				System.out.println(n[i][j]);
				
				
			}
			count++;
			
		}
		
		
	}

}
