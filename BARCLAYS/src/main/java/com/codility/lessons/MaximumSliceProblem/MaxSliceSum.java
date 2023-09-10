package com.codility.lessons.MaximumSliceProblem;

public class MaxSliceSum {
    
    /**
     * Solution 1: Elegant Solution
     *             not using "Math.max( 0, maxEndingHere + A[i])"
     *             Instead, using "Math.max( A[i], maxEndingPrevious + A[i] )"
     * @param A
     * @return
     */
    public int solution1(int[] A) {

        // initial setting A[0]
        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        // note: for i=0, it will return A[0] (also for "one element" cases)
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
        }

        return maxSoFar; // can be used for "all negative" cases 
    }
    
    public int solution2(int[] A) {

        // main idea: 
        // use "golden slice algorithm" O(n)
        // take maxEnding[i] = Math.max( 0, maxEnding[i-1] + A[i] ) <--- important~!!
        // explanation : 
        // At the end of each slice, we decide whether its value 
        // is going to be carried to the next element's computation 
        // based on whether the value is "negative or positive". <--- "key point" 
        // If positive, we carry it (so it contributes to the next slice)
        // Otherwise we start from "0"
        
        // need to be careful about special cases
        // special case 1: one element
        if(A.length ==1) 
            return A[0];
        // special case 2: all the elements are "negative"
        // for case 2: the maximum is equal to the "single max element"
        boolean negtiveCase = true;
        for(int i=0; i< A.length; i++){
            if(A[i] > 0)
                negtiveCase = false;
        }
        if( negtiveCase == true){
            int max = Integer.MIN_VALUE; // use "Integer.MIN_VALUE"
            for(int i=0; i<A.length; i++){
                if(A[i] > max)
                    max = A[i];
            }
            return max;
        }
        
        // 1) find maxEnding[]
        int maxEnding[] = new int[A.length];
        
        if(A[0] < 0) // <--- very important (be careful)
            maxEnding[0] = 0;
        else
            maxEnding[0] = A[0];
        
        for(int i=1; i<A.length; i++){
            maxEnding[i] = Math.max( 0, maxEnding[i-1] + A[i] );
        }
        
        // 2) find max slice <--- very important (be careful)
        // "not" just return maxEnding[i]; instead, we need to find the "max slice"
        int maxSlice = Integer.MIN_VALUE; // <--- be careful (cannot use "0") 
        for(int i=0; i<A.length; i++){
            if(maxEnding[i] > maxSlice)
                maxSlice = maxEnding[i];
        }
        
        return maxSlice;
    }
}
