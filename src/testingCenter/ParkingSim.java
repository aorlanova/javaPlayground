package testingCenter;

/* Name: Antonina Orlanova, CSC1302, Summer 2022
 * Parking sim is created
 * when a car is removed, it is removed, and every car behind it must move to the street
 *  Cars move into the parking deck in back of the line*/

import java.util.*;

public class ParkingSim {
	// Main method begins
	public static void main(String[] args) {
		//create 4 Car objects
		Car a = new Car(1);
		Car b = new Car(2);
		Car c = new Car(3);
		Car d = new Car(4);
		
		parkCar(a);
		parkCar(b);
		parkCar(c);
		parkCar(d);
		removeCar(c);
		getCar();
		// expected outcome: car 1 and 2 still parked, 4 is on the street.
		

	}
	
	static Stack<Car> parkingDeck = new Stack<Car>();
	static Stack <Car> street = new Stack<Car>();
	
	// returns status of street and parking
	public static void getCar() {
		
		Iterator<Car> bitr = parkingDeck.iterator();
		Iterator<Car> citr = street.iterator();
		
		while (bitr.hasNext()) {
			
			System.out.println("the parked cars are: " + (bitr.next().getPlate()));
			
		}
		while (citr.hasNext()) {
			
			System.out.println("the street cars are: " + citr.next().getPlate());
			
		}
		
	}
	
	// adds car to stack parkingDeck
	public static void parkCar(Car x) {
		
		parkingDeck.push(x);
		
	}
	
	//removes car from parkingDeck, and cars behind it to the street.
	public static void removeCar(Car x) {
		
		Iterator<Car> itr = parkingDeck.iterator();
		
		while (itr.hasNext()) {
			
			if (itr.next().equals(x)) {
				
				itr.remove();
				
				while(itr.hasNext()) {
					
					Car b = itr.next();
					itr.remove();
					street.push(b);
					
					
				}
				
			} else {
				
				itr.next();
				
			}
			
		}
		
	}

}
