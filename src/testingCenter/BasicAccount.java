package testingCenter;

/* Name: Antonina Orlanova, Summer 2022, CSC 1302 
 * subclass BasicAccount adds overdraft fee and notifies user of overdraft.
 */

public class BasicAccount extends BankAccount {
	
	private double balance;
	
	// constructor, sets default balance to 0.
	public BasicAccount() {
		
	   balance = 0;
	   
	}
	
	// override of superclass withdraw method. overdraft fee and message added.
	public void withdraw(double amount) {
		
		if (balance < amount) {
			
			balance = balance - (amount + 30);
			System.out.println("OVERDRAFT! Amount and 30 dollar overdraft fee applied. Current balance: " + balance);
			
			
		} else {
			
			balance = balance - amount;
			System.out.println("Current balance: " + balance);
			
		}
	   
	}
	
	// override of superclass deposit method. Message added.
	public void deposit(double amount) {
		
	   balance = balance + amount;
	   System.out.println("Current balance: " + balance);
	   
	}
	

}
