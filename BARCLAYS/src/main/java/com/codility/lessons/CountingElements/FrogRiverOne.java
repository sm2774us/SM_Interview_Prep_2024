package com.codility.lessons.CountingElements;

import java.util.*;

/**
 * <p>https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/ </p>
 *
 */
public class FrogRiverOne {

    public int solution1(int[] A) {
        // the main ideas:
        // 1. create a "set", and put "1~X" into the set first.
        // 2. when a number matches a number in the set, 
        //    then remove the number from the set.
        // 3. when the set becomes "empty",
        //    all the numbers "1~X" have appeared
        
        Set<Integer> set = new HashSet<Integer>();
        
        // put "1~X" into the set first
        for(int i=1; i<= X; i++){
            set.add(i);
        }
        
        for(int i=0; i< A.length; i++){
            if( set.contains(A[i]) == true ){ // when a number appears,
                set.remove(A[i]);             // then, remove it from the set
            }
            if(set.isEmpty() == true){        // nothing in the set
                return i;                     // In second i, "1~X" have all appeared 
            }
        }
        
        // not all the elements "1~X" appeared
        return -1;
    }

    public int solution2(int[] A) {
        // X can fit in memory and O(X) space is allowed - task spec 
        // indicates whether there is leaf at point X
        // frog needs each point to be true 
        // X +1 --> to map each index as real leaf position
        // .. easier for claculations
        boolean[] isLeafFallAtPointArr = new boolean[X+1];
        
        // counts the first leaf at each point 
        // .. since only that is useful to frog
        // .. for frog, there should be exactly X useful leaves
        int usefulLeafCounter = 0;
        
        // looping array, fill isLeafFallAtPointArr to track whether leaf fall at that point
        // doing that keep track of actual set operations (usefulLeafCounter)
        // .. to make sure every point filled (should be X set operations)
        for(int i=0; i<A.length; i++) {
            if(!isLeafFallAtPointArr[A[i]]) {
                isLeafFallAtPointArr[A[i]] = true;
                usefulLeafCounter++;
                
                if(usefulLeafCounter == X) { return i;}
            }
        }
        
        return -1;
    }

}
