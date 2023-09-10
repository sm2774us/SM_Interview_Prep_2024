package com.codility.lessons.PrefixSums;

public class CountDiv {

    public int solution1(int A, int B, int K) {
        int upToADivByK = (A == 0 ? 0 : (A - 1) / K);
        int upToBDivByK = B / K;

        return (A == 0 ? ((upToBDivByK - upToADivByK) + 1) : (upToBDivByK - upToADivByK));
    }

    public int solution2(int A, int B, int K) {
        // need to achieve low complexity O(1)
        // using math equation (low complexity)

        // number of divisible values smaller than B
        int num_B = (int) Math.floor(B / K);
        // note: take "Math.floor" which is the basic number

        // number of divisible values smaller than A
        int num_A = (int) Math.floor(A / K);
        // note: take "Math.floor" which is the basic number

        // number of divisible numbers
        int num_div = num_B - num_A;

        // note: plus one (if A % K == 0)
        // because "A" is also divisble 
        // without "plus", "A" will be deducted
        int plus = 0;
        if (A % K == 0)
            plus = 1;

        // num_div + plus
        num_div = num_div + plus;

        // return the number of K-divisible values between A and B
        return num_div;
    }

}
