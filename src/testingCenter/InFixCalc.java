package testingCenter;

import java.util.Stack;

/*Antonina Orlanova - Fall 2022 - infix calculator
 * In-fix calculator using two stack data structures. One stack for operands, one for operators.
 * Finds result in o(n) time, each character in the input string is visited once.
 */

public class InFixCalc {

	public static void main(String[] args) {
		
		//test one, answer should be 72
		String test1 = "12 + 3 * 20";
		postFix(test1);
		// test two, answer should be 12
		String test2 = "2 * 2 * 3";
		postFix(test2);
		//test three, error handling
		String test3 = "";
		postFix(test3);
		//test four, error handling
		String test4 = "1";
		postFix(test4);
		

	}
	
	
	public static void postFix(String input) {
		
		// when only one or zero numbers entered, case handling
		if(input.length() == 0) {
			
			System.out.print("\nnothing entered");
			return;
		//when only one number is entered.
		} else if(input.length() ==1) {
			
			System.out.print("\nonly one number entered, " + input.charAt(0));
			return;
			
		} 
		
		//initialize holders for variables when popped out of stack
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		// result holder
		int result = 0;
		//holds incomplete numbers
		String numHold = "";
		// hold operators
		char opHold = ' ';
		
		//Initialize stacks
		Stack<Integer> opperands = new Stack<Integer>();
		Stack<Character> opperators = new Stack<Character>();
		
		// Iterate once over whole string
		for (int i = 0; i < input.length(); i++) {
			
			// numeric value reached, add to numholder until full number stored
			if (!(input.charAt(i) == '%' || input.charAt(i) == '/' || input.charAt(i) == '*' || input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == ' ')) {
				
				numHold += input.charAt(i);
				
		    } 
			// add operators to operator stack here. Should not be more than 2 at a time, second goes into storage variable for comparison to uphold laws of order of operations.
			if((input.charAt(i) == '%' || input.charAt(i) == '/' || input.charAt(i) == '*' || input.charAt(i) == '+' || input.charAt(i) == '-')) {
				
				if(opperators.size() == 0) {
					
				opperators.push(input.charAt(i));
				
				} else {
					
					opHold = input.charAt(i);
				
				}
				
			// space reached and previous char war not an operator
			} else if(i == input.length()-1 || (input.charAt(i) == ' ' && !(input.charAt(i-1) == '%' || input.charAt(i-1) == '/' || input.charAt(i-1) == '*' || input.charAt(i-1) == '+' || input.charAt(i-1) == '-'))) {
				
				// finished input of an integer value or operand.
				// input should be trimmed in case to receive integer value of the string.
				numHold = numHold.trim();
				// push integer to stack.
				opperands.push(Integer.valueOf(numHold));
				// clear input string.
				numHold = "";
				
				//check here if operand count is two or end of string is reached. Want to calculate in twos
				if(opHold != ' ') {
					
					// Case: top of stack is of higher precedence than holder
					if((opperators.peek() == '/' || opperators.peek() == '*') && (opHold == '+' || opHold == '-')) {
						var3 = opperands.pop();
						var2 = opperands.pop();
						var1 = opperands.pop();
						
						if (opperators.peek() == '/' && opHold == '+') {
							
							result = var1/var2;
							result += var3;
							opperands.push(result);
							
						} else if(opperators.peek() == '/' && opHold == '-') {
					
							result = var1/var2;
							result -= var3;
							opperands.push(result);
							
							
						} else if(opperators.peek() == '*' && opHold == '+') {
					
							result = var1*var2;
							result += var3;
							opperands.push(result);
							
						} else if(opperators.peek() == '*' && opHold == '-') {
							
							result = var1/var2;
							result -= var3;
							opperands.push(result);
							
						}
						
					// Case: top of stack is of lower precedence than holder
					} else if((opperators.peek() == '+' || opperators.peek() == '-') && (opHold == '*' || opHold == '/')) {
						var3 = opperands.pop();
						var2 = opperands.pop();
						var1 = opperands.pop();
						if (opperators.peek() == '+' && opHold == '*') {
							
							result = var2*var3;
							result += var1;
							opperands.push(result);
							
						} else if(opperators.peek() == '+' && opHold == '/') {
							
							
							result = var2/var3;
							result += var1;
							opperands.push(result);
							
						} else if(opperators.peek() == '-' && opHold == '*') {
						
							result = var2*var3;
							result -= var1;
							opperands.push(result);
							
							
						} else if(opperators.peek() == '-' && opHold == '/') {
							
							result = var2/var3;
							result -= var1;
							opperands.push(result);
							
						}
						
					// Case: top of stack and operator in holder are of equal precedence.
					} else {
						
						var3 = opperands.pop();
						var2 = opperands.pop();
						var1 = opperands.pop();
						
						if(opperators.peek() == '-' && opHold == '-') {
						
							result = var2-var3;
							result -= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '+' && opHold == '+') {
						
							
							result = var2+var3;
							result += var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '/' && opHold == '/') {
						
							
							result = var2/var3;
							result /= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '*' && opHold == '*') {
						
							result = var2*var3;
							result *= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '*' && opHold == '/') {
						
							result = var2*var3;
							result /= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '/' && opHold == '*') {
						
							result = var2/var3;
							result *= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '+' && opHold == '-') {
						
							result = var2+var3;
							result -= var1;
							opperands.push(result);
						
						} else if(opperators.peek() == '-' && opHold == '+') {
						
							result = var2-var3;
							result += var1;
							opperands.push(result);
						
						}
						
						
					}
					
				//Reach end of input string, have to complete final operation and push result onto top of stack	
				} else if (i == input.length()-1) {
					
					var3 = opperands.pop();
					var2 = opperands.pop();
					
					if(opperators.peek() == '/') {
						
						result = var2/var3;
						opperands.push(result);
					
					} else if(opperators.peek() == '*') {
					
						result = var2*var3;
						opperands.push(result);
					
					} else if(opperators.peek() == '+') {
						
						
						result = var2-var3;
						opperands.push(result);
					
					} else if(opperators.peek() == '-') {
					
						result = var2-var3;
						opperands.push(result);
					
					}
					
				}
				
			} 
		
	}
		
	result = opperands.pop();
	System.out.print("\n"+result);

}
}
