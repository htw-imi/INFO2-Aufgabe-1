import java.lang.*;

public class Fib {
	
	private static long time;

	public static void main(String[] args) {
		if(args.length > 0) {
			int n = Integer.parseInt(args[0]);

			start();
			int f = _fibo(n);
			long tmpTime = stop();

			System.out.println("Berechnung dauerte "+ tmpTime +"ms");
		}
		else
			System.out.println("Geben Sie eine Zahl als Parameter an.");
	}


	/**
		Fibonacci-Reihe.

		@param n
		@param position
		@param firstNumber
		@param secondNumber
	*/

	private static int _fibo(int n, int position, int firstNumber, int secondNumber) {
		int number;
		number = firstNumber + secondNumber;
		firstNumber = secondNumber;
		secondNumber = number;
		System.out.println(number);
		if (n-- > 1) _fibo(n--, position++, firstNumber, secondNumber);
		return number;
	}


	/**
		Fibonacci-Reihe.

		@param n
	*/

	private static int _fibo(int n) {
		return _fibo(n, 0, 0, 1);
	}


	/**
		Start der Zeitmessung
	*/

	private static void start() {
		time = System.currentTimeMillis();
	}

	/**
		Zurückgeben der errechneten Zeit
	*/

	private static long stop() {
		return System.currentTimeMillis() - time;
	}

}