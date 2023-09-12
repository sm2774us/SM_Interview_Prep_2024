package com.codility.lessons.Barclays2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestNumberOfVaccines {

    public int solve(int money, int[] arr) {
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < 9; i++) {
            mn = Math.min(mn, arr[i]);
        }
        int posdigits = money / mn;
        int dig = -1;
        for (int i = 8; i >= 0; i--) {
            if (arr[i] == mn) {
                dig = i + 1;
                break;
            }
        }
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < posdigits; i++) {
            num.append(dig);
        }
        money -= posdigits * mn;
        for (int i = 0; i < posdigits; i++) {
            for (int j = 8; j >= 0; j--) {
                if (money + arr[num.charAt(i) - '0' - 1] >= arr[j] && j + 1 > num.charAt(i) - '0') {
                    money += arr[num.charAt(i) - '0' - 1];
                    money -= arr[j];
                    num.setCharAt(i, (char) (j + 1 + '0'));
                }
            }
        }
        if (num.length() > 0) {
            System.out.println(num);
            return Integer.parseInt(num.toString());
        } else {
            System.out.println(-1);
			return -1;
        }
    }
	
    public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int testcases = in.nextInt();
            LargestNumberOfVaccines largestNumberOfVaccines = new LargestNumberOfVaccines();
            while (--testcases >= 0) {
                int money = in.nextInt();
                List<Integer> a = new ArrayList<>();
                for (int i = 0; i < 9; i++) {
				    a.add(in.nextInt());
                }
                Integer[] intArr = a.stream().toArray(Integer[]::new);
                int[] arr = Arrays.stream(intArr).mapToInt(Integer::intValue).toArray();
                System.out.println(largestNumberOfVaccines.solve(money, arr));            	
            }
        }
    }

}
