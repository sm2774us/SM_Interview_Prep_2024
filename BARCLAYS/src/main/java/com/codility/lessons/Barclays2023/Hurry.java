package com.codility.lessons.Barclays2023;

import java.util.PriorityQueue;
import java.util.Arrays;

public class Hurry {

    public int maxTasks(int T, int[] l, int[] t) {
        int x = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int opt = 0;
        
        int[][] sorted = new int[l.length][2];
        for (int i = 0; i < l.length; i++) {
            sorted[i][0] = l[i];
            sorted[i][1] = t[i];
        }
        Arrays.sort(sorted, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < sorted.length; i++) {
            int l_i = sorted[i][0];
            int t_i = sorted[i][1];
            
            T -= 2 * (l_i - x);
            x = l_i;
            
            T -= t_i;
            
            heap.offer(-t_i);
            
            while (T < 0) {
                if (heap.isEmpty()) {
                    return opt;
                }
                
                T -= heap.poll();
            }
            
            opt = Math.max(opt, heap.size());
        }
        
        return opt;
    }
    
    public static void main(String[] args) {
        Hurry hurry = new Hurry();
        int T = 10;
        int[] l = { 1, 2, 3 };
        int[] t = { 4, 5, 6 };

        int result = hurry.maxTasks(T, l, t);
        System.out.println(result);
    }
    
}
