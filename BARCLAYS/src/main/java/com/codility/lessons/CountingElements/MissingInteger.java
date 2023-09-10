package com.codility.lessons.CountingElements;

import java.util.HashSet;
import java.util.Set;

class MissingInteger {

    public int solution1(int[] A) {
        int number = 0;
        boolean foundIt = true;
        boolean occurs;

        while (foundIt) {
            occurs = false;
            number++;

            for (int i = 0; i < A.length; i++) {
                if (number == A[i]) {
                    occurs = true;
                    break;
                }
            }

            if (!occurs) foundIt = false;
        }

        return number;
    }

    public int solution2(int[] A) {
        //special case
        if (A.length == 0) {
            return 1;
        }

        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        Set<Integer> set = new HashSet<>();

        // add elements into the set
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for (int i = 1; i <= A.length; i++) {
            if (set.contains(i) != true) // the 1st missing element
                return i;
        }

        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length + 1;
    }
}
