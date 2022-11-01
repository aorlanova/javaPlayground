package testingCenter;

/* Antonina Orlanova -Fall 2022 - Data Structures Wed. 3pm
 * this program rotates an n*n matrix 90 degrees clockwise.
 *  This program uses an empty array to fill in the new rotated array.
 *  */

public class ClockwiseOne {

	// main method.
	public static void main(String[] args) {
		int[][] two = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateClockwise(two);
	}
	
	//rotate clockwise method, parameter is a 2D array.
	public static void rotateClockwise(int[][] n) {
		int[][] fill = new int[n.length][n.length];
		
		// nested for loop fills in the columns of the array to make a clockwise rotation.
		for (int i = 0; i < n.length; i ++) {
			
			for (int j = 0; j < n.length; j++) {
				
				
				fill[j][i] = n[n.length - i -1][j]; 
				
				
			}
		
			
		}
		//count variable to depict the current row.
		int count = 1;
		//nested for loop prints the array.
		for (int i = 0; i < n.length; i ++) {
			System.out.println("row " + count);
			for (int j = 0; j < n.length; j++) {
				
				
				System.out.println(fill[i][j]);
				
				
			}
			count++;
			
		}
		
	}

}
