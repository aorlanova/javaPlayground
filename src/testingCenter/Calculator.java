package testingCenter;
import java.io.IOError;
import java.util.*;

/*Antonina Orlanova Fall 2022
 * This program is a simple calculator  with basic functions of addition, subtraction, division, multiplication*/

public class Calculator {

	public static void main(String[] args) {
		
		// calls calculator method.
		calcMe();
		

	}
	
	// calculator method with basic functions of addition, subtraction, division, multiplication
	public static void calcMe() {
			
		// this block of code asks for user input of operand, and both numbers.
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an opperator: +,-,*, or /");
		String operand = in.next();
		System.out.println("Enter first number");
		double num1 = in.nextDouble();
		System.out.println("Enter second number");
		double num2 = in.nextDouble();
		
		// calculates and prints result of operations. 
		// Entering anything divided by 0 will result in infinity, which is correct.
			switch(operand) {
			
			case "+":
				System.out.println("the numbers you entered added equal to: " + (num1 + num2));
				break;
			case "-":
				System.out.println("the numbers you entered added equal to: " + (num1 - num2));
				break;
			case "*":
				System.out.println("the numbers you entered added equal to: " + (num1 * num2));
				break;
			case "/":
				System.out.println("the numbers you entered added equal to: " + (num1 / num2));
				break;
			default:
				System.out.println("There is an error with your entered operand. It must be +,-,/ or *");
			
			
			}	
		
	}
	

}
