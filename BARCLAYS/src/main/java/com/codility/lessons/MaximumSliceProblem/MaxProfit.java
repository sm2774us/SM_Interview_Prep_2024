package com.codility.lessons.MaximumSliceProblem;

public class MaxProfit {
    /**
     * Solution 1: One-Pass Solution using Math.min and Math.max
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : A) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    
    /**
     * Solution 2: One-Pass Solution using smallest valley
     * @param A
     * @return
     */
    public int solution2(int[] A) {
        // main idea (One Pass Solution):
        // We can maintain two variables 
        // 1) minprice (key point~!!)
        // 2) maxprofit (corresponding to the smallest valley)
        
        // special case 
        if(A.length <= 1)
            return 0; // no profit
        
        // two variables (and initial setting)
        int minPrice = A[0];
        int maxProfit =0;
        
        // one pass solution
        for(int i=1; i<A.length; i++){
            if(A[i] < minPrice) // case 1: from high to low
                minPrice = A[i];
            else{               // case 2: from low to high
                int curProfit = A[i] - minPrice;
                if(curProfit > maxProfit) // update max profit
                    maxProfit = curProfit;
            }            
        }
        
        return maxProfit;
    }
}
