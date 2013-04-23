package com.u1.fib;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by: Stefan Kaufhold
 * Date: 23.04.13
 */
public class FibonacciTest {
    long startTime;
    long endTime;

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void tearDown() {
        endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Finished. Time: " + testTime + "ms");
    }

    @Test
    public void testFib() throws Exception {
        System.out.println("Naive fib started");
        Fibonacci.fib(30);
    }

    @Test
    public void testFibo() throws Exception {
        System.out.println("Fibo started");
        System.out.println(Fibonacci.fibo(BigInteger.valueOf(8000)));
    }

    @Test
    public void testFibLoop() throws Exception {
        System.out.println("FibLoop started");
        System.out.println(Fibonacci.fibLoop(BigInteger.valueOf(8000)));
    }
}