package com.codility.lessons.PrimeAndCompositeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public int solution1(int[] A) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                array.add(i);
            }
        }
        if (array.size() == 1 || array.size() == 0) {
            return array.size();
        }
        int sf = 1;
        int ef = array.size();
        int result = 1;
        while (sf <= ef) {
            int flag = (sf + ef) / 2;
            boolean suc = false;
            int used = 0;
            int mark = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) >= mark) {
                    used++;
                    mark = array.get(i) + flag;
                    if (used == flag) {
                        suc = true;
                        break;
                    }
                }
            }
            if (suc) {
                result = flag;
                sf = flag + 1;
            } else {
                ef = flag - 1;
            }
        }
        return result;
    }

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

	public int solution2(int[] A) {
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
}
