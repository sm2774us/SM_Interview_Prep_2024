package com.codility.lessons.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *  *
 */

public class OddOccurrencesInArray {

	/**
	 * Solution 1:
	 * XOR Solution
	 */
    public int solution1(int[] A) {
        // Using the concept of "XOR" (^)
        // when there is a pair A and B 
        // A^B will be zero 
        // A^B^C (where C is not paired), 
        // then A^B^C = C
        
        // special case
        if(A.length == 0)
            return 0;
        
        int unpaired;
        unpaired = A[0]; // initial
        
        for(int i=1; i< A.length; i++){    
            unpaired = unpaired ^ A[i]; // xor    
        }
        
        return unpaired; // return the unpaired value
    }

	/**
	 * Solution 2:
	 * Java Solution using HashSet Data Structure.
	 */
    public int solution2(final int[] A) {

        final Set<Integer> set = new HashSet<>();

        for (int i : A) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }

        return set.iterator().next();
    }
	
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
		int[] A = {9,3,9,3,9,7,9};
		
		int result1 = oddOccurrencesInArray.solution1(A);
		System.out.println("result1--->"+result1);

		int result2 = oddOccurrencesInArray.solution2(A);
		System.out.println("result2--->"+result2);
	}

}
