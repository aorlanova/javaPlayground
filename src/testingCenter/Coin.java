package testingCenter;

/* Name: Antonina Orlanova, Summer 2022 CSC1302
 * Program: Coin superclass with traits value and name */

import java.util.Arrays;
import java.util.*;

public class Coin extends SelectionSort {
	
	double value;
	String name;
	
	//constructor of class Coin
	public Coin(double passedValue, String passedName) {
		
		value = passedValue;
		name = passedName;
		
	}
	
	//returns money value of coin
	public double returnVal() {
		
		return value;
		
	}
	
	//returns coin name
	public String returnCoin() {
		
		return name;
		
	}
	
	
}
