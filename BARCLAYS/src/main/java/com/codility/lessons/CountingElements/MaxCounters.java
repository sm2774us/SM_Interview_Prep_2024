package com.codility.lessons.CountingElements;

// import java.util.Arrays;

class MaxCounters {

    private void patch4ActualMaxSoFar(int[] counterArr, int actualMaxSoFar) {
        for (int i = 0; i < counterArr.length; i++) {
            if (counterArr[i] < actualMaxSoFar) {
                counterArr[i] = actualMaxSoFar;
            }
        }
    }

    public int[] solution1(int N, int[] A) {
        int[] counterArr = new int[N];
        // tracking max so far
        int maxSoFar = 0;
        // tracking max so far that is actually set
        int actualMaxSoFar = 0;

        for (int val: A) {
            // handleIncreaseX
            if (val <= N) {
                // handling actualMaxSoFar inline
                if (counterArr[val - 1] < actualMaxSoFar) {
                    counterArr[val - 1] = actualMaxSoFar;
                }
                if (++counterArr[val - 1] > maxSoFar) {
                    maxSoFar = counterArr[val - 1];
                }
            }

            // handleMaxCounter
            else {
                // do not need to fill counter array actually
                // Arrays.fill(counterArr, maxSoFar); 
                actualMaxSoFar = maxSoFar;
            }
        }

        patch4ActualMaxSoFar(counterArr, actualMaxSoFar);

        return counterArr;
    }

    public int[] solution2(int N, int[] A) {
        // 1. key point: maintain the max value
        int max = 0;
        
        // 2. key point: maintain the current_min (very important!!!)
        // so, we can move "the 2nd for-loop" outside "the 1st for-loop" 
        // by maintaining "min"
        int min =0;
        
        // new integer array
        int[] my_array = new int[N]; 
        
        /* no need to initialize (because the values are "0" by default)
        for(int i=0; i<my_array.length; i++){
            my_array[i] =0;
        }
        */
        
        for(int i=0; i<A.length; i++){
            if( A[i] >= 1 && A[i] <= N){ // normal case
            
                // important: check the "min" before "increasing by 1"
                if(my_array[ A[i] -1] < min){
                    my_array[ A[i] -1] = min; // update it to "min"
                }
                
                my_array[ A[i] -1 ] ++;  // increased by 1
                
                if( my_array[ A[i] -1 ] > max){ // maintain max
                    max = my_array[ A[i] -1 ];
                }
            }
            else if( A[i] == N+1){      // special case 
                /* cannot use for-loop (will take too much time)
                for(int j=0; j<my_array.length; j++){
                    my_array[j] = max;
                }
                // instead, we maintain "min", so we can move the for-loop outside */ 
                min = max; // all the values should be bigger than "max"
                           // therefore, "min = max"
            }
        }
        
        // move the 2nd for-loop outside the 1st for-loop
        // update some elements who have not been updated yet
        for(int j=0; j<my_array.length; j++){
            if(my_array[j] < min){
                my_array[j] = min; // update it to "min"
            }
        }
        
        return my_array;
    }

}