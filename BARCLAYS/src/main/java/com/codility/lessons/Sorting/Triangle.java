package com.codility.lessons.Sorting;

import java.util.Arrays;

/**
 * Determine whether a triangle can be built from a given set of edges.
 * 
 * @author Shaikat
 *
 */
public class Triangle {

	public int solution1(int[] A) {
		// main idea: for any combination (A[i-2], A[i-1], A[i]) 
		// we just need to check if A[i-2] + A[i-1] > A[i] (important)
		// note: A[i-2] + A[i-1] is the max possible combination (needed to check)

		// Using "Arrays.sort(int[])"
		Arrays.sort(A);
		System.out.println("Length Of Array =" + A.length);

		// note: start from i=2
		for (int i = 2; i < A.length; i++) {
			System.out.println("A[" + i + "] + A[" + (i + 1) + "] > " + "A[" + (i + 2) + "]");
			if ((long) A[i - 2] + (long) A[i - 1] > (long) A[i]) { // note: using "long" for overflow cases
				System.out.println("A[" + i + "] + A[" + (i + 1) + "] > " + "A[" + (i + 2) + "]");
				System.out.println("Triplet is (" + i + ", " + (i + 1) + ", " + (i + 2) + ")");
				return 1;
			}
			// note: we just need one combination
		}

		// otherwise, return 0 (no triangular)
		return 0;
	}
	
    private boolean checkForTriangleProperty(int[] A, int startIndex) {
        if( calcSum(A[startIndex], A[startIndex+1]) > A[startIndex+2] &&
            calcSum(A[startIndex+2], A[startIndex]) > A[startIndex+1] &&
            calcSum(A[startIndex+1], A[startIndex+2]) > A[startIndex] ) { return true; }
            
        return false;
    }
    
    // when max int is possible, 
    // ..sum should handle in long - since it cannot fit and overflow
	private long calcSum(int a, int b) {
		return (Long.valueOf(a) + Long.valueOf(b));
	}

    public int solution2(int[] A) {
        // sort array
        // linearly check for triangle property
        
        Arrays.sort(A);
        
        for(int i=0; i<A.length - 2;i++) {
            if(checkForTriangleProperty(A, i)) { return 1; }
        }
        
        return 0;
    }

}
