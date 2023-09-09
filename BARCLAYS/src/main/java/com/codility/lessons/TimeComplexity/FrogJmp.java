package com.codility.lessons.TimeComplexity;

public class FrogJmp {

    public int solution1(int X, int Y, int D) {
        double start = X;
        double end = Y;
        double jumpDistance = D;

        return (int) Math.ceil((end - start) / jumpDistance);
    }

    public int solution2(int X, int Y, int D) {
		int initialJumpCount = (Y-X) / D;
		int remainingJumpCount = (Y-X) % D;
		
		return 
		   (remainingJumpCount > 0 ? initialJumpCount + 1: initialJumpCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
