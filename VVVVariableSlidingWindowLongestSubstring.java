package leetCode_DSA_Problems;

import java.util.HashMap;

import org.testng.annotations.Test;

public class VVVVariableSlidingWindowLongestSubstring {

	/**
	 * 
	 * Input type - String
	 * Output type - int
	 * 
	 * Positive - "abcabcbb"
 	 * Negative - "bbbbb"
	 * Edge - "a"
	 * 
	 * 
	 * Pseudo code
	 * 
	 * initiate two pointers 
		 * p1=0 //slow move
		 * p2=0 //fast move
	 * initiate maxlen= 0;
	 * 
	 * Create an empty HashMap<Character, Integer>map = new HashMap<>();
	 * 
	 * while(p2>s.size()){
	 *    map.put(s.charAt(p2), map.getordefault(s.charAt(p2),0)+1);
	 *    while(map.get(s.charAt(p2)>1) {
	 *      map.put(s.charAT(p2),map.getordefault(s.charAt(p2),0)+1);
	 *      p1++;
	 *    }
	 *  MaxLen = Math.max(maxlen, p2-p1+1);
	 *  p2++;
	 *  }
	 * 
	 * return maxlen
	 */
	
	@Test
	public void test1() {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	@Test
	public void test2() {
		System.out.println(lengthOfLongestSubstring("bbbbb"));
	}
	
	@Test
	public void test3() {
		System.out.println(lengthOfLongestSubstring("a"));
	}

	public int lengthOfLongestSubstring(String s) {

		int p1 = 0, p2 = 0, maxLen = 0;

		HashMap<Character, Integer> map = new HashMap<>();
        
		while (p2 < s.length()) {
			map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0) + 1);
			while (map.get(s.charAt(p2)) > 1) {
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1), 0) - 1);
				p1++;
			}
			maxLen = Math.max(maxLen, p2 - p1 + 1);
			p2++;
		}

		return maxLen;

	}
}

