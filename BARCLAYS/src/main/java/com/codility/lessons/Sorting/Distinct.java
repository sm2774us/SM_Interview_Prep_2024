package com.codility.lessons.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Compute number of distinct values in an array.
 */
public class Distinct {

    /**
     * Solution 1: Using Arrays.sort()
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int numOfDistinct = 1;
        // the built-in sorting function performs O(n*log(n)) time complexity
        // even in the worst case
        Arrays.sort(A);

        for (int i = 1; i < A.length; i++) {
            // add 1 to the number when there is a bigger element.
            if (A[i] != A[i - 1])
                numOfDistinct++;
        }

        return numOfDistinct;
    }
    
    /**
     * Solution 1: Using HashSet Data Structure.
     * @param A
     * @return
     */
    public int solution2(int[] A) {
        Set<Integer> numberSet = new HashSet<>();
        for (int number : A) {
            numberSet.add(number);
        }
        return numberSet.size();
    }

}
