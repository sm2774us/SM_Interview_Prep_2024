package com.codility.lessons.PrimeAndCompositeNumbers;

public class Flags {

	private boolean[] buildPeaks(int[] A) {
		boolean[] peaks = new boolean[A.length];
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peaks[i] = true;
			}
		}
		return peaks;
	}

	private int[] buildNextPeaks(boolean[] peaks) {
		int[] nextPeaks = new int[peaks.length];
		int nextPeak = -1;
		for (int i = nextPeaks.length - 1; i >= 0; i--) {
			if (peaks[i]) {
				nextPeak = i;
			}
			nextPeaks[i] = nextPeak;
		}
		return nextPeaks;
	}

    private boolean canSetFlags(int[] nextPeaks, int flagNum) {
        int index = 0;
        for (int i = 0; i < flagNum; i++) {
            if (index >= nextPeaks.length || nextPeaks[index] < 0) {
                return false;
            }
            index = nextPeaks[index] + flagNum;
        }
        return true;
    }

    public int solution1(int[] A) {
        boolean[] peaks = buildPeaks(A);

        int[] nextPeaks = buildNextPeaks(peaks);

        int maxFlagNum = 0;
        for (int flagNum = 1; (flagNum - 1) * flagNum < A.length; flagNum++) {
            if (canSetFlags(nextPeaks, flagNum)) {
                maxFlagNum = Math.max(maxFlagNum, flagNum);
            }
        }
        return maxFlagNum;
    }
    
    public int solution2(int[] A) {
        int peak_num = 0;
        int[] next_peak = new int[A.length];
        for (int i = A.length - 2; i > 0; i--) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                next_peak[i] = i;
                peak_num++;
            } else {
                next_peak[i] = next_peak[i + 1];
            }
        }
        
        int result = 0;
        for (int i = peak_num; i > 0 && result < i; i--) {
            int flag_num = 0;
            int flag = next_peak[1];
            while (flag != 0 && flag_num < i) {
                flag_num++;
                if (flag + i >= A.length - 1) break;
                flag = next_peak[flag + i];
            }
            if (flag_num > result) result = flag_num;
        }
        return result;
    }

}
