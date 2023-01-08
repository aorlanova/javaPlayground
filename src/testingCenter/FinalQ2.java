package testingCenter;

import java.util.Stack;

public class FinalQ2 {

	public static void main(String[] args) {
		
		//assumption: input given as a string
		String testOne = "2 1 + 4 * ";
		calculate(testOne);

	}

	public static void calculate(String n) {
		
		// initialize operand storage
		int var1 = 0;
		int var2 = 0;
		// what program will return
		int result = 0;
		String input = "";
		Stack<Integer> opperands = new Stack<Integer>();
		
		for (int i = 0; i < n.length(); i++) {
			
			// check for operators.
			if(n.charAt(i) == '+') {
				
				// var 2 holds right operand, pop out of stack.
				var2 = opperands.pop();
				//var 1 holds left operand, pop out of stack.
				var1 = opperands.pop();
				// add both variables.
				result = var1+var2;
				// push result back to stack.
				opperands.push(result);
				
			} else if(n.charAt(i) == '-') {
				
				var2 = opperands.pop();
				var1 = opperands.pop();
				result = var1-var2;
				opperands.push(result);
				
			} else if(n.charAt(i) == '/') {
				
				var2 = opperands.pop();
				var1 = opperands.pop();
				result = var1/var2;
				opperands.push(result);
				
			} else if(n.charAt(i) == '*') {
				
				var2 = opperands.pop();
				var1 = opperands.pop();
				result = var1*var2;
				opperands.push(result);
				
			} else if (n.charAt(i) == ' ' && !(n.charAt(i-1) == '%' || n.charAt(i-1) == '/' || n.charAt(i-1) == '*' || n.charAt(i-1) == '+' || n.charAt(i-1) == '-')) {
				
				// finished input of an integer value or operand.
				// input should be trimmed in case to receive integer value of the string.
				input = input.trim();
				// push integer to stack.
				opperands.push(Integer.valueOf(input));
				// clear input string.
				input = "";
			
			} else {
				
				// part of string integer input is at index i, add to input storage.
				input += n.charAt(i);
		
			}
			
		}
		
		System.out.println(result);
		
		
	}
	
}
