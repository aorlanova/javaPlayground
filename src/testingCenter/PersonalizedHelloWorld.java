package testingCenter;

/* ANTONINA ORLANOVA - Data Structures Fall 2022
 * This program asks for user input of first and last name, then prints a personalized greeting.
 * */

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class PersonalizedHelloWorld {

	// main method
	public static void main(String[] args) {
		//calls helloName method.
		helloName();

	}
	
	public static void helloName() {
			
		String first = "";
		String last = "";
		// scanner initialization
		Scanner in = new Scanner(System.in);
		
		// while loop ensures that user only enters alphabetical input.
		while ((!first.matches("[a-zA-Z]+")) && (!last.matches("[a-zA-Z]+"))) {
			
		System.out.println("Please, enter your first name!");
		first = in.next();
		System.out.println("Please, enter your last name!");
		last = in.next();
		
		
		}
		
		in.close();
		// print out personalized message.
		System.out.println("Hello, " + first + " " + last);
		
	}

}
