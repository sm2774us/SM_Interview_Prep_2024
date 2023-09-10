package com.codility.lessons.PrefixSums;

public class PassingCars {

    public int solution1(int[] A) {
        // 0: east -->
        // 1: west <--
        // p: -->
        // q:   <--   passing
        // for each left 0, there are as many passing cars as 1 s on its right
        // in other words,
        // ... for each 1, there are as many passing cars as 0 s on its left

        int eastCount = 0;
        int passingCount = 0;

        for (int val : A) {
            if (val == 0) {
                eastCount++;
            } else {
                passingCount += eastCount;
            }

            if (passingCount > 1000000000)
                return -1;
        }

        return passingCount;
    }

    public int solution2(int[] A) {
        // note: find number of pairs (P, Q)
        // where P < Q (important)
        // try to use "one pass" solution (low time complexity)

        int num_east = 0; // initial
        int num_pass = 0; // initial

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) { // to east
                num_east++;
            }
            if (A[i] == 1) { // to west
                num_pass = num_pass + num_east;
            }
            // note: just look back "num_east" 
            //       that will be the number of cars can be paired 
            //       (with the current car)
        }

        // note 1: can use "_" for a big value
        // note 2: "num_pass < 0" is for the "overflow" cases
        //         when "overflow" occurs, the value will "< 0" (important)
        if (num_pass > 1_000_000_000 || num_pass < 0)
            return -1;
        else
            return num_pass;
    }

}
