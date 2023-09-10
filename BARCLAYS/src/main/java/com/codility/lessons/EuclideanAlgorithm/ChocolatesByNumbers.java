package com.codility.lessons.EuclideanAlgorithm;

/**
 * Using Euclidean Algebra.
 * 
 * Concepts:
 * 1) GCD
 * Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of
 * two positive integers is the largest positive integer that
 * divides both numbers without remainder.
 * It is useful for reducing fractions to be in its lowest terms. 
 * @see <a href="https://www.idomaths.com/hcflcm.php">Greatest Common Divisor (GCD) and Lease Common Multiple (LCM)</a>
 * @see <a href="https://www.idomaths.com/hcflcm.php#findhcf">Methods to find GCD</a>
 *
 * 2) LCM
 * Least Common Multiple (LCM) of two integers is the smallest integer
 * that is a multiple of both numbers.
 * @see <a href="https://www.idomaths.com/hcflcm.php">Greatest Common Divisor (GCD) and Lease Common Multiple (LCM)</a>
 * @see <a href="https://www.idomaths.com/hcflcm.php#findlcm">Methods to find LCM</a>
 */
public class ChocolatesByNumbers {

    /**
     * 1) GCD
     * Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of
     * two positive integers is the largest positive integer that
     * divides both numbers without remainder.
     */
    private int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
    
    /**
     * 1) LCM
     * Least Common Multiple (LCM) of two integers is the smallest integer
     * that is a multiple of both numbers.
     */
    private long lcm(int a, int b) {
        return a * (long) (b / gcd(a, b));
    }

    public int solution(int N, int M) {
        return (int)(lcm(N, M) / M);
    }

}
