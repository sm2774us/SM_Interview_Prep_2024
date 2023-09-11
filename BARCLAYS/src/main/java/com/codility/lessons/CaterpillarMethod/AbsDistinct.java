package com.codility.lessons.CaterpillarMethod;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    /**
     * Solution 1: Using HashSet Data Structure.

     * @param A
     * @return
     */
    public int solution1(int[] A) {

        // using "Set"
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            // note: using "Math.abs(int)"
            if (!set.contains(Math.abs(A[i]))) {
                set.add(Math.abs(A[i]));
            } else {
                // do nothing (already existed in the set)
            }
        }

        return set.size();
    }
    
    /**
     * Solution 2: No data structures (sliding window).
     * @param A
     * @return
     */
    public int solution2(int[] A) {
		int absDistinctNum = 0;
		long previous = Long.MAX_VALUE;
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			long leftAbs = Math.abs((long) A[left]);
			long rightAbs = Math.abs((long) A[right]);
			long current;
			if (leftAbs >= rightAbs) {
				current = leftAbs;
				left++;
			} else {
				current = rightAbs;
				right--;
			}
			if (current != previous) {
				absDistinctNum++;
			}
			previous = current;
		}
		return absDistinctNum;
	}
}
