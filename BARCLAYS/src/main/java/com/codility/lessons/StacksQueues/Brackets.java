package com.codility.lessons.StacksQueues;

import java.util.Stack;

public class Brackets {
    
    private boolean isInBrackets(char c, String brackets) {
        if(brackets.indexOf(c) >= 0) { return true; }
        return false;
    }
    
    private char getCorrespondingOpenBracket(char closeBracket, String openBrackets, String closeBrackets) {
        return openBrackets.charAt(closeBrackets.indexOf(closeBracket));
    }

	public int solution1(String S) {
		String openBrackets = "{[(";
		String closeBrackets = "}])";

		Stack<Character> stack = new Stack<>();

		for (char c : S.toCharArray()) {
			if (isInBrackets(c, openBrackets)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() ||
						stack.pop() != getCorrespondingOpenBracket(c, openBrackets, closeBrackets)) {
					return 0;
				}
			}
		}

		if (stack.isEmpty())
			return 1;
		return 0;
	}
	
	public int solution2(String S) {
		Stack<Character> leftBrackets = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == ')' || ch == ']' || ch == '}') {
				if (leftBrackets.empty()) {
					return 0;
				}
				char top = leftBrackets.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return 0;
				}
			} else {
				leftBrackets.push(ch);
			}
		}
		return leftBrackets.empty() ? 1 : 0;
	}

    public int solution3(String S) {

        // main idea: use "Stack" (push and pop)
        
        //special case
        if(S.length() == 0)
            return 1;
        
        // new Stack<Character>()
        Stack<Character> stack = new Stack<>();
        
        // scan the string (just one pass)
        for(int i=0; i< S.length(); i++){    
            // note: push "its pair"
            if( S.charAt(i) == '(' ){
                stack.push(')');
            }
            else if( S.charAt(i) == '[' ){
                stack.push(']');
            }
            else if( S.charAt(i) == '{' ){
                stack.push('}');
            }
            // pop and check
            else if( S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}'){
                // important: check if the stack is empty or not (be careful)
                if(stack.isEmpty() == true){
                    return 0;
                }
                else{
                    char temp = stack.pop(); // check if the stack is empty before pop!!!
                    if(temp != S.charAt(i)){ // not a pair
                        return 0;
                    }
                }
            }
        }
        // note: check if the stack is empty or not (be careful)
        if( !stack.isEmpty() ){
            return 0;
        }
        else{
            return 1;
        }
    }

}
