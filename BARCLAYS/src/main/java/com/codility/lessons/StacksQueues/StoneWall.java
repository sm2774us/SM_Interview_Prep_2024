package com.codility.lessons.StacksQueues;

import java.util.Stack;

public class StoneWall {
	/**
	 * Solution 1: Using the Stack Data Structure
	 * @param H
	 * @return
	 */
	public int solution(int[] H) {
		// Greedy Algorithm: 
		// Build the bottoms as much as common as possible
		// .. for that, keen track of heights in a stack
		// .. while iterating, if current building can be built using stone at top of stack
		// .. than no new stone is needed
		// .. if current building is higher, new stone is needed and top of stack is updated
		// .. if current building is lower, top of stack is popped until we find a <= height stone
		// .. in stack, then new stone is needed for previous ones 
		// .. and current height is pushed to stack
		Stack<Integer> stackOfHeights = new Stack<>();
		int numOfStones = 0;

		for (int currentHeight : H) {
			while (!stackOfHeights.isEmpty() && stackOfHeights.peek() > currentHeight) {
				stackOfHeights.pop();
			}

			if (!stackOfHeights.isEmpty()) {
				if (stackOfHeights.peek() == currentHeight) {
					continue;
				} else {
					numOfStones++;
					stackOfHeights.push(currentHeight);
				}
			} else {
				numOfStones++;
				stackOfHeights.push(currentHeight);
			}
		}

		return numOfStones;
	}

	/**
	 * Solution 2: Solution without Stack Data Structure.
	 * @param H
	 * @return
	 */
	public int solution2(int[] H) {
		int N = H.length;
		int[] stack = new int[N];
		int num = 0;
		stack[num++] = H[0];
		int result = 1;
		for (int i = 1; i < N; i++) {
			// store the stonewall in ascending order and pop out the larger
			// stonewall than the current stonewall
			while (num > 0 && stack[num - 1] > H[i]) {
				num--;
			}
			// if the stack is empty or the top of stack isn't equal to the
			// current stonewall, then we should push the current stonewall in
			// the stack and add 1 to the result.
			if (num == 0 || stack[num - 1] != H[i]) {
				stack[num++] = H[i];
				result++;
			}
		}
		return result;
	}

}
