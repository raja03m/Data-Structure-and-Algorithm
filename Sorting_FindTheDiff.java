package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class Sorting_FindTheDiff {

	/*
	 * input type - string 
	 * output type - character 
	 * 
	 * input1 - s = "abcd"  t= "abcde"
	 * input2 - s = "" t = "y"
	 * 
	 *Pseudo code
	 *
	 * initiate emptry integer array
	 * iterate for each loop with s.length 
	 *    find the count using ascii
	 * iterate for each loop with t.lenth
	 *    reduce the count using ascii
	 *    if(ascii >0)
	 *      return c
	 * return 0;
	 *
	 */
	
	@Test
	public void test1() {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
	
	@Test
	public void test2() {
		System.out.println(findTheDifference("", "y"));

	}
	
    public char findTheDifference(String s, String t) {
		
    	int[] output = new int [26];
    	
    	for(char c: s.toCharArray()) {
    		output[c - 'a'] ++;
    	}
    	
    	for(char c: t.toCharArray()) {
    		output[c - 'a']--;
    		if(output[c - 'a']<0) {
    			return c;
    		}
    	}
    	
    	return 0;
    
    }
}
