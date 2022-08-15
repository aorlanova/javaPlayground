package testingCenter;

/* Name: Antonina Orlanova, Summer 2022, CSC 1302 
 * Superclass Person with traits birth year and person's name. */


public class Person {

	String persName;
	int birthYear;
	
//constructor method sets person name to an empty string, their birth year to 0.
public Person(String name) {
		
		persName = name;
		
	}

//return name.
public String getName() {
	
	return persName;
	
}

}


