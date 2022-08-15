package testingCenter;

/* Name: Antonina Orlanova, CSC1302, Summer 2022
 * Program takes argument int x and returns all palindrome numbers that are equal or less than x
 * and squares them.*/

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;


public class PalindromeSim {

	//main method
	public static void main(String[] args) {
		
		// testing x = 100
		printSquaredPalindrome(100);

	}
	
	// method for returning the reverse of a number
	public static int reverseInt(int b) {
		
		int remainder = 0;
		int reverse = 0;
		
		while (b != 0) {
		    remainder = b % 10;
		    reverse = reverse * 10 + remainder;
		    b /= 10;
		  }
		
		return reverse;
		
		
	}
	
	//method to print the squared palindromes up to x.
	public static void printSquaredPalindrome(int x) {
		
		ArrayList<Integer> upToX = new ArrayList<Integer>();
		
		// add all numbers up to b to upToX
		for (int i = 0; i <= x; i++) {
			
			upToX.add(i);
			
		}
		
		//collect all palindromes in a stream, square them, and collect them. 
		List<Integer> squaredNumbers = 
				upToX.stream()
				.filter(w -> w == reverseInt(w))
				.map(w -> (w*w))
				.collect(Collectors.toList());
	
				
				System.out.println(squaredNumbers);

	}	
	
}
