package testingCenter;

/* Name: Antonina Orlanova, Summer 2022, CSC 1302 
 * Testing subclass BasicAccount */

public class TestAccounts {

	public static void main(String[] args) {
		

		BasicAccount tonyaAcc = new BasicAccount();
		
		// after adding new account, testing deposit, getBalance, and withdraw method.
		tonyaAcc.deposit(5);
		tonyaAcc.getBalance();
		tonyaAcc.withdraw(100);
		// expected: -125.0 balance.

	}

}
