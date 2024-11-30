package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FirstUniqCharInString {

	
	/**
	 * Input type-
	 * Output type-
	 * 
	 * Positive
	 * Negative
	 * Edge
	 * 
	 * 
	 * Pseudo code
	 * Create an empty Map with Character and Integer
	 * Store string into character array
	 * Iterate a for loop with char input
	 *   - map.put(each char with count)
	 * Iterate for loop with input.length
	 *   -  if(map.get(s.charAt(i))==1)
    			return i
	 * return -1
	 */
	
	@Test
	public void test1() {
		System.out.println(firstUniqChar("leetcode"));
	}
	
	@Test
	public void test2() {
		System.out.println(firstUniqChar("loveleetcode"));
	}
	
	@Test
	public void test3() {
		System.out.println(firstUniqChar("aabb"));
	}
	
    public int firstUniqChar(String s) {
    	Map<Character,Integer> map = new HashMap<>();
    	char[] input = s.toCharArray();
    	for(char in: input) {
    		map.put(in, map.getOrDefault(in, 0)+1);
    	}
    	
    	for(int i=0;i<input.length;i++) {
    		if(map.get(s.charAt(i))==1) {
    			return i;
    		}
    	}
    	
		return -1;
       }
}
