package com.codility.lessons.BinaryGap;

public class BinaryGap {

	private boolean isOne(int n) {
		return n%2 == 1 || n == 1 ;
	}

    public int solution1(int n) {
		System.out.println("n--->"+n);
		System.out.println("n in Binary--->"+Integer.toBinaryString(n));
		
		int maxGap = 0, currGap = 0;
		boolean isInGap = false;
		
		while(n > 0) {
			System.out.println("n--->"+n);
			System.out.println("n in Binary--->"+Integer.toBinaryString(n));
			if (isOne(n)) {
				System.out.println("n--->"+n);
				System.out.println("n in Binary--->"+Integer.toBinaryString(n));
				maxGap = maxGap < currGap ? currGap : maxGap;
				currGap = 0;
				isInGap = true;
			} else if (isInGap) {
				currGap++;
			}
			n /= 2;
		}
		return maxGap;
	}
	
	/**
	 * Solution 2 - Bitwise Operation (https://en.wikipedia.org/wiki/Bitwise_operation)
	 */
	public int solution2(int n) { 
		// get rid of right-hand zeros
	    while (n != 0 && (n & 1) == 0) {
	        n >>>= 1;
	    }
	    System.out.println("n--->"+n);
	    
	    int max = 0;
	    int gap = 0;
	    while (n != 0) {
	        if ((n & 1) == 0) {
	            gap++;
	            max = Math.max(gap, max);
	        } else {
	            gap = 0;
	        }
	        n >>>= 1;
	    }
	    return max;
	}

	public int solution3(int N) {
		int pre = -1;
		int len = 0;
	 
		while (N > 0) {
			int k = N & -N;
	 
			int curr = (int) Math.log(k);
	 
			N = N & (N - 1);
	 
			if (pre != -1 && Math.abs(curr - pre) > len) {
				len = Math.abs(curr - pre) + 1;
			}
			pre = curr;
		}
	 
		return len;
	}

}
