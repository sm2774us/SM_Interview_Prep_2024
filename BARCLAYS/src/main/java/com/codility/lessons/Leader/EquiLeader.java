package com.codility.lessons.Leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    // majority vote algorithm
    private int computeLeader(int A[]) {
        // init to first, since we know at least there is one element - task spec
        int leader = A[0];
        int counter = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == leader) {
                counter++;
            } else {
                counter--;
                if (counter == 0) {
                    leader = A[i];
                    counter++;
                }
            }
        }

        return leader;
    }
    
    public int solution1(int[] A) {
        // Algorithm: find leader in one iteration - O(len)
        // .. use two prefix arrays to keep leader so far - space O(len)
        // .. make to passes - forward and backward and mark if leader is leader so far
        // .. once prefix arrays are ready, check forward prefix array i, backward i+1
        // .. if both leader, i is a split point - count that
        
        int len = A.length;
        boolean[] forwardLeaderCheckArray = new boolean[len];
        boolean[] backwardLeaderCheckArray = new boolean[len];

        int leader = computeLeader(A);
        
        // forward pass
        int countSoFar = 0;
        for(int i=0; i<len; i++) {
            if(A[i] == leader ) { countSoFar++; }
            if( (double)countSoFar / (i+1) > 0.5 ) { forwardLeaderCheckArray[i] = true; }
        }
        
        // backward pass
        countSoFar = 0;
        for(int i=len-1; i>=0; i--) {
            if(A[i] == leader ) { countSoFar++; }
            if( (double)countSoFar / (len-i) > 0.5 ) { backwardLeaderCheckArray[i] = true; }
        }
        
        // evaluate
        int numOfSplits = 0;
        for(int i=1; i<len; i++) {
            if(forwardLeaderCheckArray[i-1] && backwardLeaderCheckArray[i]) { numOfSplits++; }
        }

        return numOfSplits;
    }

    public int solution2(int[] A) {

        // special case
        if( A.length ==0)
            return 0;

        // The key point: 
        // Only the "leader of the whole array" can have an "equi leader"
        // Assume a value Y is "not" the leader of the whole array.
        // Can value Y have an equi leader?
        // The answer is NO.
        
        // Based on this condition, to solve this problem, 
        // 1. we first find the leader of the whole array. 
        // 2. after finding a leader (if any), 
        //    we then scan the whole array again. 

        // 1. find the leader of an array 
        // ---> we use "hashMap"
        Map<Integer, Integer> map = new HashMap<>();
        
        // map(key, value) ---> map(number, count)
        for(int i=0; i<A.length; i++){
            if( !map.containsKey(A[i]) ){
                map.put(A[i], 1);
            }
            else{
                map.put(A[i], map.get(A[i])+1 );
            }    
        }
        
        // find the max_Value and max_Count
        int max_Value =A[0];
        int max_Count =1;
        // important: Using "for( int j: map.keySet() )"
        for(int j: map.keySet() ){
            int cur_Count = map.get(j);
            if( cur_Count > max_Count){
                max_Count = cur_Count;
                max_Value = j;
            }
        }
        
        // check "if there is a leader"
        int leader_Value =0;
        int leader_Count =0;
        if( max_Count > (0.5) * (A.length) ){
            leader_Value = max_Value;
            leader_Count = max_Count;
        }
        else{
            return 0; // no leader ---> no equi leaders
        }
        
        // note: cannot use (1/2) * (A.length)
        // This is because (1/2) will be "zeor" 
        // Instead, we can use (0.5) * (A.length) (be careful)
        
        // 2. scan the whole array again
        int num_equi_leaders = 0; // number of equi leaders
        int left_Leader_Count =0; // number of leaders in left side
        
        // scan the array
        for(int i=0; i<A.length; i++){
            
            // find a leader (in left side)
            if(A[i] == leader_Value){
                left_Leader_Count++;
            }
            
            // if the leader is "a leader in left side" (more than half)
            if( left_Leader_Count > (0.5) * (i+1) ){ 
                // then, check right side
                int right_Leader_Count = leader_Count - left_Leader_Count;                
                // if the leader is "a leader in right side" (more than half)
                if( right_Leader_Count > (0.5) * (A.length -i -1) ){
                    num_equi_leaders++; // leader in both sides (then, equi leaders++)
                }
            } 
        }
        // return number of equi leaders
        return num_equi_leaders;
    }

}
