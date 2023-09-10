package com.codility.lessons.FibonacciNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibFrog {

    class Jump {
        int position;
        int counter;

        Jump(int position, int counter) {
            this.position = position;
            this.counter = counter;
        }
    }

    private List<Integer> getFibonaci(int max) {
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);
        int f = 1;
        while (fibs.get(f) <= max) {
            fibs.add(fibs.get(f) + fibs.get(f - 1));
            f++;
        }
        fibs.remove(0);
        Collections.reverse(fibs);
        return fibs;
    }

    public int solution2(int[] A) {
        List<Integer> fibs = getFibonaci(A.length);
        boolean[] accessed = new boolean[A.length]; 
        List<Jump> jumps = new ArrayList<>();
        jumps.add(new Jump(-1, 0));
        Jump cj = null;
        int step = 0;
        while(true) {
            if(step==jumps.size()) {
                return -1;
            }
            cj = jumps.get(step);
            step++;
            for(int f: fibs) {
                if(cj.position+f==A.length) {
                    return cj.counter+1;
                } else if(cj.position+f>A.length || A[cj.position+f]==0 || accessed[cj.position+f]) {
                    continue;
                }
                
                jumps.add(new Jump(cj.position+f, cj.counter+1));
                accessed[cj.position+f] = true;
            }
        }
    }
        
    public int solution1(int[] A) {
        List<Integer> steps = new ArrayList<>();
        steps.add(1);
        steps.add(1);
        while (true) {
            int nextStep = steps.get(steps.size() - 2)
                    + steps.get(steps.size() - 1);
            if (nextStep > A.length + 1) {
                break;
            }
            steps.add(nextStep);
        }

        int[] minJumpNums = new int[A.length + 2];
        Arrays.fill(minJumpNums, Integer.MAX_VALUE);
        minJumpNums[0] = 0;
        for (int i = 0; i < minJumpNums.length; i++) {
            if (i == 0 || i == minJumpNums.length - 1 || A[i - 1] == 1) {
                for (int step : steps) {
                    if (step > i) {
                        break;
                    }
                    minJumpNums[i] = (int) Math.min(minJumpNums[i],
                            (long) minJumpNums[i - step] + 1);
                }
            }
        }
        return minJumpNums[minJumpNums.length - 1] == Integer.MAX_VALUE ? -1
                : minJumpNums[minJumpNums.length - 1];
    }
    

}
