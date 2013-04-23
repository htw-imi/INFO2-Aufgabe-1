package com.u1.fib;

import java.math.BigInteger;

/**
 * Created by: Stefan Kaufhold
 * Date: 22.04.13
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (long  i = 0; i < 1000; i++) {
            System.out.println(i + " - " + fibLoop(BigInteger.valueOf(i)));
        }
    }

    /**
     * Naive Fibonacci implementation
     */
    public static long fib(long n) {
        if (n > 1) {
            return fib(n-1) + fib(n-2);
        }
        else {
            return n;
        }
    }

    public static BigInteger fibo(BigInteger n) {
        return fibi(n, BigInteger.valueOf(2), BigInteger.ONE, BigInteger.ZERO);
    }

    public static BigInteger fibi(BigInteger n, BigInteger i, BigInteger fibi_i_1, BigInteger fibi_i_2) {
        if (n.compareTo(BigInteger.ONE) <= 0)
            return n;
        else if (i.equals(n))
            return fibi_i_1.add(fibi_i_2);
        else
            return fibi(n, i.add(BigInteger.ONE), fibi_i_1.add(fibi_i_2), fibi_i_1);
    }

    /**
     * fibi method implemented with loops
     */
    public static BigInteger fibLoop(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0)
            return  n;

        BigInteger fibi_i_1 = BigInteger.valueOf(1);
        BigInteger fibi_i_2 = BigInteger.valueOf(0);
        BigInteger fibi_i_1_new;

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            fibi_i_1_new = fibi_i_1.add(fibi_i_2);
            fibi_i_2 = fibi_i_1;
            fibi_i_1 = fibi_i_1_new;
        }
        return fibi_i_1.add(fibi_i_2);
    }
}
