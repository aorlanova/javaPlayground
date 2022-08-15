package testingCenter;

import java.util.*;

/* Name: Antonina Orlanova, Summer 2022 CSC1302
 * Program: Testing compareTo method on Superclass Person's name*/

public class PersonTesting {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner console = new Scanner(System.in);
		
		// asks user to enter 10 names.
		System.out.println("enter the name for person 1: ");
		String b = console.next();
		System.out.println("enter the name for person 2: ");
		String c = console.next();
		System.out.println("enter the name for person 3: ");
		String d = console.next();
		System.out.println("enter the name for person 4: ");
		String e = console.next();
		System.out.println("enter the name for person 5: ");
		String f = console.next();
		System.out.println("enter the name for person 6: ");
		String g = console.next();
		System.out.println("enter the name for person 7: ");
		String h = console.next();
		System.out.println("enter the name for person 8: ");
		String i = console.next();
		System.out.println("enter the name for person 9: ");
		String j = console.next();
		System.out.println("enter the name for person 10: ");
		String k = console.next();
		
		// creates an array of 10 Persons and sets their name to user's entered name.
		Person[] a =  { new Person(b),
				new Person(c),
				new Person(d),
				new Person(e),
				new Person(f),
				new Person(g),
				new Person(h),
				new Person(i),
				new Person(j),
				new Person(k)
				
				 };
		
		// Compare first and last entry in array a, and print whether the names are the same.
		if (a[0].getName().compareTo(a[a.length-1].getName()) == 0) {
			
			System.out.println("These names are the same and are: " + a[0].getName() + " " + a[a.length-1].getName());
			
		} else {
			
			System.out.println("These names are not the same and are: " + a[0].getName() + " " + a[a.length-1].getName());
			
		}
		
		}
	

}
