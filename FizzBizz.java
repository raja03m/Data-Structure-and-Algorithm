package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class FizzBizz {

	/*
	 * Input - Integer 
	 * output - list of strings
	 * 
	 * Condition 
	 * If input divide by 5 and 3 print fizzbuzz 
	 * if input divide by 3 print fizz
	 * if input divide by 5 print buzz
	 * 
	 * Pseudo code
	 * Create an empty list string "v"
	 * Iterate for loop with input n integer
	 *    - if the condition i is divide by 5 and 3
	 *     add fizzbuzz to list
	 *    - else if i is divide by 3
	 *     add fizz to list
	 *    - else if i is divide by 5
	 *     add buzz to list
	 *    - else add "i" value to v list
	 * return v list
	 */

	@Test
	public void test1() {
		System.out.println(fizzBuzz(3));
	}

	@Test
	public void test2() {
		System.out.println(fizzBuzz(5));
	}

	@Test
	public void test3() {
		System.out.println(fizzBuzz(15));
	}

	public List<String> fizzBuzz(int n) {
		List<String> v = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if ((i % 5 == 0) && (i % 3 == 0))
				v.add("FizzBuzz");
			else if (i % 3 == 0)
				v.add("Fizz");
			else if (i % 5 == 0)
				v.add("Buzz");
			else
				v.add(Integer.toString(i));
		}
		return v;

	}
}
