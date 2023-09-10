package com.codility.lessons.PrimeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int solution1(int[] A) {

        // main idea:
        // 1) find all the peaks, and put them into a List
        // 2) try to divide the array into a number of groups,
        //    and check if all the groups have at least one peak
        //--> if yes, return the "number of groups"

        // use "List" to store all the peaks
        List<Integer> peaksIndexList = new ArrayList<>();

        // 1) find the peaks (and store them)
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) { // A[i] > A[i-1], A[i] > A[i+1]
                peaksIndexList.add(i);
            }
        }

        // 2) check the number of Blocks
        int N = A.length;

        // from the "biggest possible number" to smaller number
        for (int numBlocks = N; numBlocks >= 1; numBlocks--) {

            if (N % numBlocks == 0) { // it is divisible   

                int blockSize = N / numBlocks;
                int ithOkBlock = 0; // the ith block has peak(s)

                // test all the peaks 
                // if a peak is found in the ith block
                // then, go to the (i+1)th block
                for (int peaksIndex : peaksIndexList) {
                    if (peaksIndex / blockSize == ithOkBlock) { // peak in the ith block
                        ithOkBlock++; // go to check (i+1)th block
                    }
                }

                // ithOkBlock: the number of blocks having peak(s) 
                // if all the blocks have peak(s)
                // then, return the number of blocks
                // note: we test from the biggest possible number
                // so, once we find it, we can just return it
                // (no need to check the smaller possible numbers)
                if (ithOkBlock == numBlocks) {
                    return numBlocks;
                }
            }
        }

        return 0;
    }

	private int[] buildPeakNums(int[] A) {
		int[] peakNums = new int[A.length];
		int peakNum = 0;
		for (int i = 0; i < peakNums.length; i++) {
			if (i > 0 && i < A.length - 1 && A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peakNum++;
			}
			peakNums[i] = peakNum;
		}
		return peakNums;
	}

	private int computePeaks(int[] peakNums, int begin, int end) {
		return peakNums[end] - (begin == 0 ? 0 : peakNums[begin - 1]);
	}

    private boolean allContainPeak(int[] peakNums, int size) {
        for (int i = 0; i < peakNums.length; i += size) {
            if (computePeaks(peakNums, i, i + size - 1) == 0) {
                return false;
            }
        }
        return true;
    }

	public int solution2(int[] A) {
		int[] peakNums = buildPeakNums(A);
		if (computePeaks(peakNums, 0, A.length - 1) == 0) {
			return 0;
		}
		for (int size = 1;; size++) {
			if (A.length % size == 0 && allContainPeak(peakNums, size)) {
				return A.length / size;
			}
		}
	}

}
