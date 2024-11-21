package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ReserveWord3 {

	/*
	 *
	 * Input type - String Output type - String print
	 * 
	 * Positive input string - "Let's take LeetCode contest" Edge - " "
	 * 
	 * 
	 * Pseudo code i) Convert the string into String array "q" 
	 * ii) Iterate for loop with q.length 
	 * -Initiate int variable left =0 
	 * -convert each word into separate char array "word"
	 * -initiate int variable right =word.length-1
	 *   Iterate while loop(left<right)
	 *   - char temp = word[right];
	 *   - word[left] = word[right];
	 *   - word[right] = temp;
	 *   -left ++;
	 *   - right--;
	 *   q[i] = new String(word)
	 * 
	 * return String.joins(" ", q);
	 * 
	 */

	@Test
	public void test1() {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	@Test
	public void test2() {
		System.out.println(reverseWords("Mr Ding"));
	}

	@Test
	public void test3() {
		System.out.println(reverseWords(" "));
	}

	public String reverseWords(String s) {
//    	String[] q = s.split(" ");
//    	StringBuilder result = new StringBuilder();
//        for(String st :q) {
//        	char[] chars = st.toCharArray();
//    	for(int z=chars.length-1;z>=0;z--) {
//    		result.append(chars[z]);
//    	}
//    	result.append(" ");
//        }
//		return result.toString().trim();
//    }
//}

		String[] q = s.split(" ");
		for (int i = 0; i < q.length; i++) {
			int left = 0;
			char[] word = q[i].toCharArray();
			int right = word.length - 1;
			while (left < right) {
				char temp = word[left];
				word[left] = word[right];
				word[right] = temp;
				left++;
				right--;
			}
			q[i] = new String(word);

		}
		return String.join(" ", q);
	}
}
