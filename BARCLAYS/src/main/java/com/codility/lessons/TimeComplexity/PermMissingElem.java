package com.codility.lessons.TimeComplexity;

import java.util.Arrays;

/**
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains integers in the range [1..(N + 1)], which means that exactly one
 * element is missing.
 * 
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a zero-indexed array A, returns the value of the missing element.
 * 
 * For example, given array A such that:
 * 
 * A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the function should return 4, as it is
 * the missing element.
 * 
 * Assume that:
 * 
 * N is an integer within the range [0..100,000]; the elements of A are all
 * distinct; each element of array A is an integer within the range [1..(N +
 * 1)]. Complexity:
 * 
 * expected worst-case time complexity is O(N); expected worst-case space
 * complexity is O(1), beyond input storage (not counting the storage required
 * for input arguments). Elements of input arrays can be modified.
 *
 */
public class PermMissingElem {

	private long calcSum(int[] A) {
        long sum = 0;
        
        for(int elem: A) { sum += elem; }
        
        return sum;
    }

	/**
	 * Solution 1:
	 */
    public int solution1(int[] A) {
        // since all distinct, we are safe.. some controls can be omitted
        // if the missing also available, sum would be n (n + 1) / 2 where n = length (A) + 1
        // tip: sums should be long, since might overflow for large n
        long shouldBeLength = A.length + 1;
        long shouldBeSum = shouldBeLength * (shouldBeLength + 1) / 2;
        
        return (int) (shouldBeSum - calcSum(A));
        
    }

	/**
	 * Solution 2:
     * Using the concept of "Sum = (ceiling + floor) * height /2"
	 */
    public int solution2(int[] A) {
        // Using the concept of "Sum = (ceiling + floor) * height /2"
        // So---> Sum = (1 + N+1) * N /2
        // the missing element can be found by minus other elements
        
        // note: need to use "long" to avoid potential bugs (large numbers)
        long ceiling = A.length +1;
        long floor = 1;
        long height = A.length + 1; // note: need to plus extra "1" 
                                    // because there is one element "missing"! 
                                    // be careful about this (important)
        long sum = (ceiling +floor) * height /2; // main idea
        /*        
        int high = A.length +1; 
        int low = 1;
        int height = A.length + 1; 
        int sum = (high +low) * height /2; // main idea
        */
        long missing_number = sum; // initial setting (sum)
        
        for(int i=0; i<A.length; i++){
            missing_number = missing_number - A[i]; // minus other elements
        }
        
        return (int)missing_number; // return the missing element (long->int)
    }

	/**
	 * Solution 3:
     * Java8 Stream Solution
	 */
	public int solution3(int[] A) {
		if(A == null){
			return 0;
		}
		long arraySum = Arrays.stream(A).asLongStream().sum();
		long N = A.length+1;
		long expectedSum = (N*(N+1))/2;
        return (int)(expectedSum-arraySum);
    }

	public static void main(String[] args) {
		PermMissingElem permMissingElem = new PermMissingElem();		
		int[] input = {2,3,1,5};
		int result1 = permMissingElem.solution1(input);
		System.out.println("result1--->"+result1);
		
		int result2 = permMissingElem.solution2(input);
		System.out.println("result2--->"+result2);

		int result3 = permMissingElem.solution3(input);
		System.out.println("result3--->"+result3);
	}

}
