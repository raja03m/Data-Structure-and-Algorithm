package leetCode_DSA_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseVowelOfString {
	
	
	/*
	 * Input type - String s
	 * Output type - String return
	 * 
	 * 
	 * Positive- Input: s = "IceCreAm"
	 * Negative- Input: s = "12345"
	 * Edge- ""
	 * 
	 * 
	 * Pseudo code
	 * Initiate vowels in an character of array "vowels"
	 * Convert string into character of array "se"
	 * Initiate variable pointer p1=0 and p2= se.length-1
	 * while(p1<p2)
	 *      if(se[p1]!=vowel
	 *        p1++
	 *      if(se[p2]!vowel
	 *        p2--
	 *      else
	 *        char[temp] = se[p1]
	 *        se[p1] = se[p2]
	 *        se[p2] = temp
	 *        p1++;
	 *        p2--;
	 *      return new String[se]
	 *      
	 * 
	 */

	@Test
	public void test1() {
      System.out.println(reverseVowels("IceCreAm"));
	}

	@Test
	public void test2() {
	      System.out.println(reverseVowels("123"));
	}

	@Test
	public void test3() {
	      System.out.println(reverseVowels(" "));
	}

	public String reverseVowels(String s) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		char[] se = s.toCharArray();
		int p1=0,p2=se.length-1;
		while (p1 < p2) {
	        if (!isVowel(se[p1], vowels))
	            p1++;
	        else if (!isVowel(se[p2], vowels))
	            p2--;
	        else {
	            char temp = se[p1];
	            se[p1] = se[p2];
	            se[p2] = temp;
	            p1++;
	            p2--;
	        }
	    }

	    return new String(se);
	}

	private boolean isVowel(char c, char[] vowels) {
	    for (char vowel : vowels) {
	        if (c == vowel) {
	            return true;
	        }
	    }
	    return false;
	}
}