package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class DetectCapital {

	/*
	 * Input - String
	 * Output type - boolean
	 * 
	 * Condition
	 * 1. All should be capital
	 * 2. Only first letter should be capital
	 * 3. All letter should be small lowercase
	 * 
	 * Pseudo code
	 * 
	 * create integer variable upperCount =0
	 * Iterate for each loop 
	 * - change the input into charArray and run with char c
	 * - if the condition satisfied with uppercase, increase the uppercount
	 * 
	 * 
	 * return condition
	 *  i) uppercase == 0 (all lower case) 
	 *  ii) uppercase == word.length (all letter in word length should be uppercase)
	 *  iii) uppercase ==1 and Character.uppercase(word.charAt(0)
	 * 
	 * 
	 */
	@Test
	public void test1() {
		System.out.println(detectCapitalUse("USA"));
	}
	
	@Test
	public void test2() {
		System.out.println(detectCapitalUse("FlaG"));

	}
	
    public boolean detectCapitalUse(String word) {
    	int upperCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }
        return upperCount == 0 || upperCount == word.length() || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
        	
        	