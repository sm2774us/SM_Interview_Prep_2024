package com.codility.lessons.Barclays2023;

import java.util.HashSet;
import java.util.Set;

public class CalculateCost {
    public int getCost(int x, int k, int[] prices, int n) {
        Set<Integer> s = new HashSet<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!s.contains(prices[i])) {
                s.add(prices[i]);
                res++;
            }
        }
        k = res - k;
        return k * x;
    }
}
