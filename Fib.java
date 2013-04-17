public class Fib {
	
	public static void main(String[] args) {


	}

	/**
		Berechnet die Fakultaet des uebergebenen Parameters n.

		@param n = Zahl von der die Fakultaet berechnet werden soll.
	*/
	private int fakultät(int n) {
		if(n > 0)
			return n * fakultät(n - 1);
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
	private int fibo(int n, int i, int fibi_i_1, int fibi_i_2) {
		if(n <= 1) return n;
		else if(i == n) return fibi_i_1 + fibi_i_2;
		else return fibi(n, i + 1, fibi_i_1 + fibi_i_2; fibi_i_1);
	}

	/**
		Fibonacci-Reihe.

		@param n
	*/
	private int fibo(int n) {
		return fibi(n, 2, 1, 0);
	}

}