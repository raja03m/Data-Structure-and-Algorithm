package leetCode_DSA_Problems;

import java.math.BigInteger;
import java.util.Arrays;

import org.testng.annotations.Test;

public class AddingOneToArray {
	/*
	 *
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* What is the input(s) type? int Array
	* What is the expected output? boolean
	*
	* 2) Test data set
	* Minimum of 3 data set !!
	* Positive - {1,2,3}
	* Edge - {9,9}
	* Negative - {0}
	*
	* 3) pseudo code
	* Create an variable n and i=0
	* Iterate for loop with input's length 
	*   - n variable * 10 + digit[i]
	* Converting the int array into int
	* Add 1 to the int n
	* Convert into String r (String.valueof(n)
	* create an empty integer array with String r length
	* Iterate the for loop with r length
	*  - Store  each character in the string into int y array(Character.getNumericValue(r.charAt(i))
	*  return int array y
	*  
	* */
	@Test
	public void test1() {
		System.out.println(plusOne(new int[]{1,2,3}));
	}
	@Test
	public void test2() {
		System.out.println(plusOne(new int[]{9,9}));
	}
	@Test
	public void test3() {
		System.out.println(plusOne(new int[]{0}));
	}
    public int[] plusOne(int[] digits) {
//    	String sample = Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "");
// 
//    	StringBuilder sb = new StringBuilder();
//    	for (int i : digits) {
//    	    sb.append(i);
//    	}
//    	String str = sb.toString();
//    	System.out.println(str);
//    	long number = Long.parseLong(sample) + 1;
//
//      BigInteger number = new BigInteger(sample).add(BigInteger.ONE);
//
//    	int number = Integer.parseInt(sample)+1;
//    	System.out.println(number);
//    	String xyy = String.valueOf(number);
//    	int[] y = new int[xyy.length()+1] ;
//    	for(int i=0;i<xyy.length();i++) {
//    		y[i] = Character.getNumericValue(xyy.charAt(i));
//    	}
//		return y;
    	
		int n = 0;
		for (int i = 0; i < digits.length; i++)
			n = n * 10 + digits[i];
		n = n + 1;
		String r = String.valueOf(n);
		int[] y = new int[r.length()];
		for (int i = 0; i < r.length(); i++)
			y[i] = Character.getNumericValue(r.charAt(i));
		System.out.println(Arrays.toString(y));
		return y;
	}

}
