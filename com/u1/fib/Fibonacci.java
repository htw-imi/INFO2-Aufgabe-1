package com.u1.fib;

/**
 * Created by: Stefan Kaufhold
 * Date: 22.04.13
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int  i = 0; i < 100; i++) {
            System.out.println(i + " - " + fibLoop(i));
        }
    }

    /**
     * Naive Fibonacci implementation
     */
    public static int fib(int n) {
        if (n > 1) {
            return fib(n-1) + fib(n-2);
        }
        else {
            return n;
        }
    }

    public static int fibo(int n) {
        return fibi(n, 2, 1, 0);
    }

    public static int fibi(int n, int i, int fibi_i_1, int fibi_i_2) {
        if (n <= 1)
            return n;
        else if (i == n)
            return fibi_i_1 + fibi_i_2;
        else
            return fibi(n, i+1, fibi_i_1 + fibi_i_2, fibi_i_1);
    }

    /**
     * fibi method implemented with loops
     */
    public static int fibLoop(int n) {
        if (n <= 1)
            return  n;

        int fibi_i_1 = 1;
        int fibi_i_2 = 0;
        int fibi_i_1_new;

        for (int i = 2; i < n; i++) {
            fibi_i_1_new = fibi_i_1 + fibi_i_2;
            fibi_i_2 = fibi_i_1;
            fibi_i_1 = fibi_i_1_new;
        }
        return fibi_i_1 + fibi_i_2;
    }
}
