import java.lang.*;

public class Fib {
	
	private static long time;

	public static void main(String[] args) {
		if(args.length > 0) {
			int n = Integer.parseInt(args[0]);

			start();
			int f = fibo(n);
			long tmpTime = stop();

			System.out.println("Fibonacci von " + n + " beträgt " + f + " ("+ tmpTime +"ms)");
		}
		else
			System.out.println("Geben Sie eine Zahl als Parameter an.");
	}

	private static int fibonacci(int n) {
		int tmp = n;

		if(n > 0)
			tmp += fibonacci(n - 1);

		System.out.println(tmp);
		return tmp;

	}

	/**
		Berechnet die Fakultaet des uebergebenen Parameters n.

		@param n = Zahl von der die Fakultaet berechnet werden soll.
	*/
	private int fakultaet(int n) {
		if(n > 0)
			return n * fakultaet(n - 1);
		else
			return 1;
	}


	/**
		Fibonacci-Reihe.

		@param n
		@param i
		@param fibi_i_1
		@param fibi_i_2
	*/
	private static int fibo(int n, int i, int fibi_i_1, int fibi_i_2) {
		int z;
		if(n <= 1)
			z = n;
		else if(i == n)
			z = fibi_i_1 + fibi_i_2;
		else 
			z = fibo(n, i + 1, fibi_i_1 + fibi_i_2, fibi_i_1);

		//	Ausgabe der aktuellen Fibonacci-Zahl
		System.out.println(z);

		return z;
	}

	/**
		Fibonacci-Reihe.

		@param n
	*/
	private static int fibo(int n) {
		return fibo(n, 2, 1, 0);
	}

	private static void start() {
		time = System.currentTimeMillis();
	}

	private static long stop() {
		return System.currentTimeMillis() - time;
	}

}