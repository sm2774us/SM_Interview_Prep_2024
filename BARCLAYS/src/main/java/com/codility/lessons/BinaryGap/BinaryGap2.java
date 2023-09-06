package com.codility.lessons.BinaryGap;

public class BinaryGap2 {
	public int solution(int N) {
        int maxGap = 0, currGap = 0;
        boolean isInGap = false;
        
        while(n > 0) {
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
	
	public static void main(String[] args) {
		BinaryGap2  gap =new BinaryGap2();
		
		int n = 9;
		int res = gap.solution(n);
		System.out.println("res--->"+res);
		
		res = gap.solution(529);
		System.out.println("res--->"+res);
		
		res = gap.solution(20);
		System.out.println("res--->"+res);
		
	}
}
