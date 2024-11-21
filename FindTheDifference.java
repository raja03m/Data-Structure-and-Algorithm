package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindTheDifference {

	
	/*
	* Input type - String s and String t
	* 
	* Positve
	* Negative
	* 
	* 
	* Convert the string s into schar array
	* Convert the string t into tchar array
	* and then sort both array
	* Iterate with sArrays length 
	*  - if condition if sArrays[i] is not equal to tArray[i]
	*  -return tArray[i]
	* return tArray[tarray.length-1]
	* 
	*/

	
	@Test
	public void test1() {
		System.out.println(findTheDifference("kjk","kjkr"));
	}
	
	@Test
	public void test2() {
		System.out.println(findTheDifference("","y"));
	}
	
	
	
	
    public char findTheDifference(String s, String t) {    	
    	char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }
        
        return tArray[tArray.length - 1];
    }}
