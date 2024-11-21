package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class FindIndexOfFirstOccuranceofString {

	/*
	 * Input type - String haystack and String needle Output type - int
	 * 
	 * Positive - Input: haystack = "sadbutsad", needle = "sad" Negative - Input:
	 * haystack = "leetcode", needle = "leeto" Edge - Input : haystack = "a", needle
	 * ="a"
	 * 
	 * Pseudo code 
	 * 
	 *        return haystack.indexOf(needle);
	 * 
	 * 
	 */

	// Input: haystack = "sadbutsad", needle = "sad"

	
	@Test
	public void test1() {
		System.out.println(strStr("sadbutsad", "sad"));
	}
	
	@Test
	public void test2() {
		System.out.println(strStr("leetcode", "leeto"));
	}
	
	@Test
	public void test3() {
		System.out.println(strStr("butsad", "sad"));
	}
	public int strStr(String haystack, String needle) {
//		char[] input1 = haystack.toCharArray();
//		char[] input2 = needle.toCharArray();
//		for (int i = 0; i < input1.length-input2.length; i++) {
//			int match=0;
//		    for(int j=0;j<input2.length;j++) {
//		    	if(input2[j]==input1[i+j])
//		    		match++;
//		    	else
//		    		break;
//		    }
//			if( match == input2.length)
//				return i;
//		}
//		return -1;
		
		char[] input1 = haystack.toCharArray();
	    char[] input2 = needle.toCharArray();
	    int len1 = input1.length;
	    int len2 = input2.length;
	    
	    if (len2 == 0) return 0;
	    if (len1 < len2) return -1;
	    
	    for (int i = 0; i <= len1 - len2; i++) {
	        int match = 0;
	        for (int j = 0; j < len2; j++) {
	            if (input2[j] == input1[i + j]) 
	            	match++;
	            else 
	            	break;
	        }
	        if (match == len2) 
	        	return i;
	    }
	    
	    return -1;
	}
		//one line solution
       // return haystack.indexOf(needle);
	}


