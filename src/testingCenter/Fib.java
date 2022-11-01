package testingCenter;

public class Fib {

	public static void main(String[] args) {
		
		fibo(6);

	}
	static int count = 0;
	static int fibAt = 0;
	public static void fibo(int limit) {
		
		while (count < limit+1) {
			
			fibAt += count;
			count++;
			fibo(limit);
			
		}
		
		System.out.println(fibAt);
		
	}

}
