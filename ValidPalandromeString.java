package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ValidPalandromeString {

	
	/*
	 * Input type - String
	 * Output type - boolean
	 * 
	 * 
	 * Positive - "A man, a plan, a canal: Panama" 
	 * Negative - race a car
	 * Edge - " "
	 *
	 *
	 * Pseudo code
	 * i) Remove the space, symbols and change every character to lowercase
	 * ii) store each character into character array
	 * iii) split the length and iterate the for loop
	 *   	- char[i] is not equal to the char[length-1-i]
	 *      - return false
	 * return true
	 *
	 *
	 * */


	
	@Test
	public void test1() {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void test2() {
		System.out.println(isPalindrome("race a car"));
	}

	@Test
	public void test3() {
		System.out.println(isPalindrome(" "));
	}

//	public boolean isPalindrome(String s) {
//		String beforeReversing = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//		char[] before = beforeReversing.toCharArray();
//
//		String afterReversing = "";
//
//		for (int i = before.length - 1; i >= 0; i--)
//			afterReversing += before[i];
//
//		if (beforeReversing.equals(afterReversing))
//			return true;
//		else
//			return false;
//
//	}
//
//}
	
	public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] strAsChar = str.toCharArray();
        for(int i = 0; i < strAsChar.length/2; i++){
            if(strAsChar[i] != strAsChar[strAsChar.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
