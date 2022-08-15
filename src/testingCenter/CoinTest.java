package testingCenter;

/* Name: Antonina Orlanova, Summer 2022 CSC1302
 * Program: Testing a modified version of SelectionSort to sort coins instead of ints.*/

public class CoinTest {

	public static void main(String[] args) {
		
		// Coin array is created
		Coin[] a = { new Coin(0.05, "nickle"),
				new Coin(0.05, "nickle"),
				new Coin(0.10, "Dime"),
				new Coin(0.01, "Penny"),
			    new Coin(0.25, "Quarter"),
				new Coin(0.01, "Penny"),
				new Coin(0.44, "Peso"),
				new Coin(0.10, "Dime")
				 };
		
		//call Selection sort
		SelectionSort.sort(a);
		
		//Print list of sorted coins
		 for (int i = 0; i < a.length; i++){
			 
			 System.out.print(a[i].returnCoin() + " / ");
			 
			 }

	}

}
