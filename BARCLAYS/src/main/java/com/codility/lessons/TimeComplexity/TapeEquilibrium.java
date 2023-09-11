package com.codility.lessons.TimeComplexity;

public class TapeEquilibrium {

    private void calculateLeftSums(int[] A) {
        // sure A has at least 2 elements from task spec
        for(int i=1; i<A.length; i++) {
            A[i] += A[i-1];
        }
    }
    
    private int findMinDiffPoint(int[] A) {
        int minDiff = Integer.MAX_VALUE;
        int rightSum = 0;
        for(int i=A.length -1; i > 0; i--) {
            rightSum += A[i] - A[i-1];
            int diff = Math.abs( rightSum - A[i-1] );
            if( diff < minDiff ) {minDiff = diff;}
        }
        
        return minDiff;
    }

	/**
	 * Solution-1
	 */
	public int solution1(int[] A) {
        // cumulative approach works - two passes
        // first pass (left to right): at each point we can store left sum for that point 
        // .. no additional space is required, we can update array A
        // .. since an element is equal to its diff with its left element (calculatable)
        // second point (right to left): at each point we can calculate right sum (no need to store)
        // .. and since both left and right sums known at second pass, take diff and search for min

        // first pass
        calculateLeftSums(A);
        
        // second pass 
        return findMinDiffPoint(A);
	}

	/**
	 * Solution-2
	 */
	public int solution2(int[] A) {
        // Using the concept of Sum
        // and, (sum of the 2nd part) = Sum - (sum of the 1st part)
        // importantly, difference = |(sum of the 2nd part) - (sum of the 1st part)|
        
        // First, compute the sum (will be used for several times)
        int sum =0; // initial
        for(int i=0; i< A.length; i++){
            sum = sum + A[i];
        }
        
        // then, find the minimum difference
        int min_diff = Integer.MAX_VALUE;  // initial setting: Integer.MAX_VALUE
        
        int sum_part_one =0;
        int sum_part_two =0;
        int diff =0;
        
        // try to compute the above values in "one pass"!
        // for the possible partition-point P
        for(int p =1; p< A.length; p++){
            /* no need to use the second for loop (important)
            for(int j=0; j< p; j++){ // to compute the sum of the 1st part
                sum_part_one = sum_part_one + A[j];
            }
            */
            sum_part_one = sum_part_one + A[p-1];   // the sum of part one
            sum_part_two = sum - sum_part_one;      // the sum of part two
            diff = sum_part_one - sum_part_two;     // the difference
            if(diff <0)                             // absolute value
                diff = -diff;                       // all the values can be computed (one pass)
            
            min_diff = Math.min(min_diff, diff);    // min difference
        }
        return min_diff; // return the min difference
	}

	public static void main(String[] args) {
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		int[] A = {3,1,2,4,3};

		int result1 = tapeEquilibrium.solution1(A);
		System.out.println("result1--->"+result1);

		int result2 = tapeEquilibrium.solution2(A);
		System.out.println("result2--->"+result2);
	}

}
