package com.codility.lessons.CaterpillarMethod;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public int solution1(int[] A) {
        Arrays.sort(A);
        int i = 0, j = A.length - 1;
        int res = Integer.MAX_VALUE;
        while (i <= j) {
            int sum = A[i] + A[j];
            if (res > Math.abs(sum))
                res = Math.abs(sum);
            if (sum < 0) {
                i++;
            } else if (0 < sum) {
                j--;
            } else {
                break;
            }
        }
        return res;
    }

	public int solution2(int[] A) {
		int result = Integer.MAX_VALUE;
		Arrays.sort(A);
		for (int number : A) {
			int index = Arrays.binarySearch(A, -number);
			if (index < 0) {
				index = -1 - index;
			}
			if (index < A.length) {
				result = Math.min(result, Math.abs(number + A[index]));
			}
			if (index >= 1) {
				result = Math.min(result, Math.abs(number + A[index - 1]));
			}
		}
		return result;
	}    
}
