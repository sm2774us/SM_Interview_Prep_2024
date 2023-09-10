package com.codility.lessons.StacksQueues;

import java.util.Stack;

public class Fish {

    /**
     * Solution 1: Single-Stack Solution.
     *
     * @param A
     * @param B
     * @return
     */
    public int solution1(int[] A, int[] B) {

        // special case: no fish
        if (A.length == 0)
            return 0;

        // main idea: use "stack" to store the fishes with B[i]==1 
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for (int i = 0; i < A.length; i++) {

            // case 1; for the fish going to downstrem
            // push the fish to "stack", so we can keep them from the "last" one
            if (B[i] == 1) {
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if (B[i] == 0) {
                while (!st.isEmpty()) {
                    // if the downstream fish is bigger (eat the upstream fish)
                    if (st.peek() > A[i]) {
                        numAlive--;
                        break; // the upstream fish is eaten (ending)   
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if (st.peek() < A[i]) {
                        numAlive--;
                        st.pop(); // the downstream fish is eaten (not ending)
                    }
                }
            }
        }

        return numAlive;
    }
    
    /**
     * Solution 2: Two-Stack Solution.
     *
     * @param A
     * @param B
     * @return
     */
    public int solution2(int[] A, int[] B) {
        // sizes --> A
        // directions --> B   0:upstream   1:downstream
        int len = A.length;
        Stack<Integer> upstreamStack = new Stack<>();
        Stack<Integer> downstreamStack = new Stack<>();
        
        for(int i=0; i<len; i++) {
            int size = A[i];
            int direction = B[i];
            
            // downstreaming fish cannot eat previous elements in first pass
            if(direction == 1) { downstreamStack.push(size); }
            
            // upstreaming fish eats all previous downstream smaller fishs
            // .. if meet previous bigger fish, eaten by it
            // .. otherwise saved in upstreamStack
            else {
                while(!downstreamStack.isEmpty() && size > downstreamStack.peek() ) {
                    downstreamStack.pop();
                }
                
                if(downstreamStack.isEmpty()) { upstreamStack.push(size); }
            }
        }
        
        return downstreamStack.size() + upstreamStack.size();
        
    }
}
