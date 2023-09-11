package com.codility.lessons.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**

 */
public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] A = {
            -3,
            8,
            9,
            -7,
            6
        };
        int K = 3;

        int[] sol1 = cyclicRotation.solution1(A, K);
        System.out.println("sol1-->" + Arrays.toString(sol1));

        int[] sol2 = cyclicRotation.solution2(A, K);
        System.out.println("sol2-->" + Arrays.toString(sol2));
    }

    /**
     * Solution 1:
     * Java solution using the concept of "mod" (to make it cyclic)
     */
    public int[] solution1(int[] A, int K) {
        // Using the concept of "mod" (to make it cyclic)
        
        int[] new_array = new int[A.length]; // a new array
        
        for(int i=0; i< A.length; i++){
            int new_position = (i + K) % A.length; // using "mod" to do Cyclic Rotation           
            new_array[new_position] = A[i]; // put A[i] to the new position
        }
        
        return new_array; // return new array
    }

    /**
     *  Solution 2:
     *  Java8 Stream Solution
     */
    public int[] solution2(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        final LinkedList<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        while (K > 0) {
            list.addFirst(list.getLast());
            list.removeLast();
            K--;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
