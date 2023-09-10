package com.codility.lessons.StacksQueues;

import java.util.Stack;

public class Nesting {
	
	/**
	 * Solution 1: Using Stack Data Structure.
	 * @param S
	 * @return
	 */
	public int solution1(String S) {
		Stack<Character> stack = new Stack<>();

		for (Character c : S.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return 0;
				}
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
			return 1;
		}

		return 0;
	}

	/**
	 * Solution 2: Using Stack Data Structure (more complicated).
	 * @param S
	 * @return
	 */
    public int solution2(String S) {

        // special case 1: empty string
        if( S.length() ==0)
            return 1;
        // special case 2: odd length
        else if( S.length() % 2 == 1)
            return 0;

        // main idea: use "stack" to check
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            
            if( S.charAt(i)=='(' ){
                st.push(')'); // note: push its pair (be careful)
            }
            else if(S.charAt(i)==')'){
                
                // before pop: need to check if stack is empty (important)
                if(st.isEmpty() == true){
                    return 0;
                }
                else{
                    char temp = st.pop();
                    if( temp != ')'){
                        return 0;
                    }   
                }
            }
        }
        
        // be careful: if stack is "not empty" -> return 0
        if( !st.isEmpty() )
            return 0;
        else 
            return 1;   
    }

	/**
	 * Solution 3: Solution without Stack Data Structure.
	 * @param S
	 * @return
	 */
	public int solution3(String S) {
		int leftBracketNum = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				leftBracketNum++;
			} else {
				if (leftBracketNum == 0) {
					return 0;
				}
				leftBracketNum--;
			}
		}
		return leftBracketNum == 0 ? 1 : 0;
	}

}
