package com.codility.lessons.Leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    private boolean isDominator(int[] A, int candidateIndex) {
        if (candidateIndex < 0)
            return false;

        int countOfCandidate = 0;

        for (int element : A) {
            if (element == A[candidateIndex]) {
                countOfCandidate++;
            }
        }

        return (countOfCandidate > A.length / 2) ? true : false;
    }
    
    public int solution1(int[] A) {
        // majority vote algorithm
        int candidateIndex = -1;
        int counter = 0;
        
        for(int i=0; i<A.length; i++) {
            // first element, init
            if(candidateIndex < 0) {
                candidateIndex = 0;
                counter++;
                continue;
            }
            
            // same element, increment counter
            if(A[i] == A[candidateIndex]) { counter++; }
            
            // different element
            // .. decrement counter if possible
            // .. otherwise set current index as candidate
            else {
                if( counter > 0) { counter--; }
                else {
                    counter = 0;
                    candidateIndex = i;
                }
            }
        }
        
        return (isDominator(A, candidateIndex)) ? candidateIndex : -1;
    }

    public int solution2(int[] A) {

        // Using "hashMap" for counting
        Map<Integer, Integer> map = new HashMap<>();      
        
        // 1. Counting
        // map(key, value) ---> map(number, count)
        for(int i=0; i<A.length; i++){
            if( !map.containsKey(A[i]) ){ // new number
                map.put(A[i],1);          // "put" new number
            }
            else{
                int count = map.get(A[i]); // "get" count
                map.put(A[i], count+1);    // count++
            }
        }
        
        // 2. find the max number of counts
        int max_Number =0;
        int max_Count =0; 
        // note: use "map.keySet()" in for loop 
        for( int key: map.keySet() ){
            int cur_Count = map.get(key); // get value
            if( cur_Count > max_Count){
                max_Count = cur_Count;    // update max count
                max_Number = key;
            }
        }
        
        // 3. check if there is a "dominator" or not
        if( max_Count > (A.length)/2 ){
            // then, max_Number is the "dominator"
        }
        else{
            return -1; // no dominator
        }
        
        // 4. return "any index" of "the dominator"
        for(int i=0; i<A.length; i++){
            if(A[i] == max_Number){
                return i; // return the index
            }
        }
        
        return -1;
    }

}
