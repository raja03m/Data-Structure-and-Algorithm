package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagrams {

	/*
	 * Input type String str1 and String str2
	 * Output boolean
	 * 
	 * Positive - s1 = “geeks”  s2 = “kseeg”
	 * Negative - s1 = “allergy”  s2 = “allergic”
	 * Edge - s1 = “g”, s2 = “g”
	 * 
	 * Pseudo code
	 * Convert two input string into character of array
	 * if the length of first char array is not equal to length of char array return false
	 * else
	 * Sort both the char array 
	 * return arrays.equal(set1,set2)
	 * 
	 */

	@Test
	public void test1() {
		System.out.println(anagrams("geeks", "kseeg"));
	}
	
	@Test
	public void test2() {
		System.out.println(anagrams("allergy", "allergic"));
	}
	
	@Test
	public void test3() {
		System.out.println(anagrams("g", "g"));

	}
	
	public boolean anagrams(String str1, String str2) {
		char[] set1 = str1.toCharArray();
		char[] set2 = str2.toCharArray();
		
		if (set1.length != set2.length)
			return false;
		else {
			Arrays.sort(set1);
			Arrays.sort(set2);
			return Arrays.equals(set1, set2);
			}
	}

}
