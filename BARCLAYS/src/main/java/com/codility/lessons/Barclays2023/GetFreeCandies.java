package com.codility.lessons.Barclays2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GetFreeCandies {

    public int findMinCost1(int k, int[] arr){
        int res = 0;
        Arrays.sort(arr);
        for(int i=0; i<k; i++){
            res = res + arr[i];
        }

        return res;
    }

    public int findMaxCost1(int k, int[] arr) {
        int res = 0;
        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            res = res + intArr[i];
        }

        return res;
    }

	public int findMinCost2(int k, int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int cost = 0;
		while (i <= j) {			
			cost += arr[i];
			i++;
			j -= k;
		}
		return cost;
	}

	public int findMaxCost2(int k, int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int cost = 0;
		while (j >= i) {			
			cost += arr[j];
			j--;
			i += k;
		}
		return cost;
	}

    // public void mergeMinMaxCost(int k, int[] c){
    //     int min = findMinCost(k, c);
    //     int max = findMaxCost(k, c);

    //     System.out.println(min + " " + max);
    // }

	public static void main (String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int testcases = in.nextInt();
            GetFreeCandies getFreeCandies = new GetFreeCandies();
            while (--testcases >= 0) {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(getFreeCandies.findMinCost1(k, arr) + " " + getFreeCandies.findMaxCost1(k, arr));
                System.out.println(getFreeCandies.findMinCost2(k, arr) + " " + getFreeCandies.findMaxCost2(k, arr));
            	
            }
        }
	}
}
