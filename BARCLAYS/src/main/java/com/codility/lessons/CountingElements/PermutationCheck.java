package com.codility.lessons.CountingElements;

import java.util.*;

/**
 * <p>https://app.codility.com/demo/results/training4GF5TP-THG/ </p>
 *
 */
public class PermutationCheck {

    private int checkForPermutation(boolean[] isIntExist) {
        // since 1-indexing, skip 0th index
        for(int i=1; i<isIntExist.length; i++) {
            if(!isIntExist[i]) return 0;
        }
        
        return 1;
    }

    public int solution1(int[] A) {
        // a permutation should have all from 1 to len(A) 
        // .. O(n) space is allowed in task space
        int len = A.length;
        // 1-indexing to match entries with integers
        // .. for easy calculation 
        boolean[] isIntExist = new boolean[len+1];
        
        for(int val: A) {
            if(val > len || isIntExist[val]) return 0;
            isIntExist[val] = true;
        }
        
        return checkForPermutation(isIntExist);
    }
    
    public int solution2(int[] A) {
        // to check "permutation"
        // the main idea is as follows:
        // 1. use set to remember which elements have appeared
        // 2. use "for loop" to check if all the elements from "1 to A.length" appeared
        // If all the elements have appeared, then "yes".
        // Otherwise, "no".
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i < A.length; i++){
            set.add(A[i]);
        }
        
        // check if "all" the elements from "1 to A.length" appeared
        for(int i=1; i<= A.length; i++){
            if( set.contains(i) == false )
                return 0; // not a permutation (A[i] is missing)
        }
        
        // if it contains all the elements (from "1 to A.length")
        // then, "yes"
        return 1;       
    }

    public int solution3(int[] A) {
        boolean[] used = new boolean[A.length];
        for (int number : A) {
            if (number < 1 || number > A.length || used[number - 1]) {
                return 0;
            }
            used[number - 1] = true;
        }
        return 1;
    }
}
