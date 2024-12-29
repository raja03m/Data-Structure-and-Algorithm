package stack;

import java.util.HashMap;
import java.util.Stack;

import org.testng.annotations.Test;

public class ValidParentheses {

	/*
	 * 
	 * https://leetcode.com/problems/valid-parentheses/description/
	 * 
	 * Example 1:

		Input: s = "()"

		Output: true

		Example 2:

		Input: s = "()[]{}"

		Output: true
		
	 */
	
	@Test
	public void test1() {
		System.out.println(isValid("()"));
	}
	
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for (char ch: s.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else{
               // if(stack.isEmpty()) return false;
                if(!stack.isEmpty() && stack.peek()==map.get(ch))
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }


}

