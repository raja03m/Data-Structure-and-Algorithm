package stack;

import java.util.Stack;

public class stack_decodingString {
	
	public static String decode(String s) {
		// initialise two stacks - count stack, string stack
		Stack<Integer> countStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();
		int index = 0;
		String result = "";
		while (index < s.length()) {
			// check if its a digit
			if (Character.isDigit(s.charAt(index))) {
				int count = 0;
				while (Character.isDigit(s.charAt(index))) {
					count = count * 10 + Character.getNumericValue(s.charAt(index));
					index++;
				}
				countStack.push(count);
			} else if (s.charAt(index) == '[') {
				// push the result to string stack
				stringStack.push(result);
				index++;
				result = "";
			} else if (s.charAt(index) == ']') {
				String pop = stringStack.pop();
				Integer temp = countStack.pop();
				StringBuilder builder = new StringBuilder(pop);
				for (int i = 0; i < temp; i++) {
					builder.append(result);
				}
				result = builder.toString();
				index++;
			} else {
				result += s.charAt(index);
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decode(s));
	}
}