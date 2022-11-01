package testingCenter;

import java.util.Scanner;

/* ANTONINA ORLANOVA - Data Structures Fall 2022
 * This program asks for user input of a number greater than 0. Then, using binary search method, guesses the user's number.
 * 
 * */

public class GuessMyNumber {

	// main method
	public static void main(String[] args) {
		
		// calls guessNumber method
		guessNumber();
		
	}
	
	// guessNumber method. Asks for user input for mystery number and guesses number.
	public static void guessNumber() {
		
		int magicNum = 0;
		Scanner in = new Scanner(System.in);
		// while loop ensures user number is greater than 0.
		while (magicNum <= 0) {
		System.out.println("Please, enter a number for me to guess! Must be greater than 0");
		magicNum = in.nextInt();
		
		}
		
		// once valid magic number is received, user is welcomed to the game.
		System.out.println("Welcome to Guess My Number!");
		
		// variables for binary search method initialized.
		int guessWork;
		int guessedNum = -2;
		int leftmost = 0;
		int rightmost = magicNum;
		int numberOfGuesses = -1;
		
		// binary search happens in this while loop until guessed number does not change.
		while (guessedNum == -2) {
			
			// guessWork computes the middle number. 
			guessWork = leftmost + ((rightmost - leftmost)/2);
			System.out.println("Is the magic number higher or lower than: " + guessWork);
			System.out.println("Please, enter H,C,L for higher, correct, or lower, respectively.");
			String userAnswer = in.next();
			
			//keeps track of guesses it takes to get to magic num.
			numberOfGuesses++;
			
			//user enters that guessed number is correct.
			if (userAnswer.equals("C")) {
				
				System.out.println("Your magic number is: " + guessWork + "And it took this many guesses: " + numberOfGuesses);
				break;
				
			//user number is higher than guessed number.
			} else if (userAnswer.equals("H")) {
				
				rightmost = guessWork -1;
				leftmost = 0;
				guessWork = leftmost + ((rightmost - leftmost)/2);
				
			// user number is lower than guessed number.
			} else if(userAnswer.equals("L")) {
				
				leftmost = guessWork +1;
				rightmost = magicNum;
				guessWork = leftmost + ((rightmost - leftmost)/2);
				
			}
			
		}
	
		
		}
		
		

	}	


