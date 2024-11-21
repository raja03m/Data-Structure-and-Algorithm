package leetCode_DSA_Problems;

import java.math.BigInteger;

/*
*
* 1) Did I understand the problem? -> If yes, go to next step !!
*
* What is the input(s) type? String
* What is the expected output? boolean String
* Do I have constraints to solve the problem? No
* Do I have all informations to go to next step!! yes
// * How big is your test data set will be? single word
*
* 2) Test data set
*
* Minimum of 3 data set !!
* Positive - 11, 123
* Edge - 0,0
* Negative - 11,""
*

* Validate with the interviewer if the data set is fine by his/her assumptions
*
* 3) Do I know how to solve it?
* yes
* Yes - great, is there an alternate?
*
* 4) Ask for hint (If you do not know how to solve)
*
* 5) Do I know alternate solutions as well?
*
* No - That is still fine, proceed to solve by what you know !!
*
* 6) If you know alternate solutions -> find out the O Notations
* (Performance)
*
* Then, explain either both or the best (depends on the time)
*
* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
* Approach 2: Write down the options and benefits and code the best
*
* 7) Start always with Psuedo code 
* 
* i)Convert the strings into integer and store it
* ii)add both integer and store in it in new variable total
* iii)covert to string again 
* iv) return string
* 
* 
* 
* 
* 
* 
* // Bruteforce
* Take the String
*  
* 8) Implement them in the code (editor)
*
* 9) Test against the different data set
*
* 10) If it fails, debug them to solve it !!
* */


import org.testng.annotations.Test;

public class AddTwoString {
	
	/*
	 * Input String- m=11 and n=123
	 * Output String total
	 * 
	 * Positive- string m -11 and n - 123
	 * Negative- string m - 456 and n -""
	 * Edge- string m-0 and n-0
	 * 
	 * 
	 * convert String into integer using BigInteger
	 * and once its been add convert back to string
	 * and return string
	 * 
	 * 
	 */
	
	
	
	
	@Test
	public void test1() {
		System.out.println(addStrings("11","123"));
	}
	
	@Test
	public void test2() {
		System.out.println(addStrings("456",""));
	}
	
	@Test
	public void test3() {
		System.out.println(addStrings("0","0"));
	}
	
	public String addStrings(String num1, String num2) {
//		int one = Integer.parseInt(num1); 
//		int two = Integer.parseInt(num2);
//		int total =  one+two;
//		String totalStr = String.valueOf(total);
//		return totalStr; 
//	}
//}
		
		BigInteger a = new BigInteger(num1);
	    BigInteger b = new BigInteger(num2);
	    return a.add(b).toString();
	}
}


