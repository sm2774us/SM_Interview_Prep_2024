package com.codility.lessons.PrimeAndCompositeNumbers;

public class Peaks {

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

    public int solution1(int[] A) {
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

    public int solution2(int[] A) {
        // main idea:
        // 1) find all the peaks, and put them into a List
        // 2) try to divide the array into a number of groups,
        //    and check if all the groups have at least one peak
        //--> if yes, return the "number of groups"

        // 1) find the peaks (and store them)
        int[] peak_counter = new int[A.length + 1];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peak_counter[i + 1] = peak_counter[i] + 1;
            } else {
                peak_counter[i + 1] = peak_counter[i];
            }
        }
        peak_counter[A.length] = peak_counter[A.length - 1];

        // 2) check the number of Blocks
        // from the "biggest possible number" to smaller number
        for (int i = peak_counter[A.length]; i > 0; i--) {
            if (A.length % i != 0) continue; // skip if non-divisible
            int len = A.length / i;
            Boolean isValid = true;

            // test all the peaks 
            // if a peak is found then return
            for (int start = 0; start <= A.length - len; start += len) {
                if (peak_counter[start + len] - peak_counter[start] <= 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) return i;
        }
        return 0;        
    }

}
