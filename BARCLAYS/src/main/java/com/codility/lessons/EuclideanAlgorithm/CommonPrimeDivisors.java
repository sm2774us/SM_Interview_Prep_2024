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
public class CommonPrimeDivisors {

    /**
     * 1) GCD
     * Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of
     * two positive integers is the largest positive integer that
     * divides both numbers without remainder.
     */
    private int gcd(int a, int b) {
	    if(a % b == 0) return b;
	    return gcd(b,a%b);
	}
	
	private boolean hasSamePrimeDivisors(int a, int b) {
	    int gcdValue = gcd(a,b);
        int gcdA;
        int gcdB;
        while(a!=1) {
            gcdA = gcd(a,gcdValue);
            if(gcdA==1)
                break;
            a = a/gcdA;
        }
        if(a!=1)  {
            return false;
        }
        while(b!=1) {
            gcdB = gcd(b,gcdValue);
            if(gcdB==1)
                break;
            b = b/gcdB;
        }
        return b==1;        
	}
    
    public int solution(int[] A, int[] B) {
        int count = 0;
        for(int i=0;i<A.length;i++) {
            if(hasSamePrimeDivisors(A[i], B[i])){
                count++;    
            } 
        }
        return count;
    }

}
