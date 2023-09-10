package com.codility.lessons.FibonacciNumbers;

public class Ladder {

	private static final int LIMIT = 30000;
	private static final int MODULO = 1 << 30;

    public int[] solution1(int[] A, int[] B) {
        // for a given N rungs, the number of different ways of climbing is the (N+1)th element in the Fibonacci numbers.
        // we know that the result of a number modulo 2^P is the bit under P, so
        // if we first let the number modulo 2^Q(Q > P) and then modulo 2^P, the
        // result is the same.
        int L = A.length;
        int[] fib = new int[L + 2];
        int[] result = new int[L];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= L; i++) {
            // make sure the fibonacci number will not exceed the max integer in java 1<<n = 2^n
            fib[i] = (fib[i - 1] + fib[i - 2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            result[i] = fib[A[i]] % (1 << B[i]);
        }
        return result;
    }

    public int[] solution2(int[] A, int[] B) {
        int[] fibonacci = new int[LIMIT + 1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % MODULO;
        }

        int[] ways = new int[A.length];
        for (int i = 0; i < ways.length; i++) {
            ways[i] = fibonacci[A[i]] % (1 << B[i]);
        }
        return ways;
    }

}
