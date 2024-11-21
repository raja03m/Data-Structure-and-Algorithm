package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class MaximumThirdNumber {

	/*
	 *
	* What is the input(s) type? Integer array
	* What is the expected output? boolean
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? single word
	*
	* 2) Test data set
	*
	* Minimum of 3 data set !!
	* Positive, Edge, Negative
	*
	*
	* 7) Pseudo code
	* i)Sorting the input
	* ii)Create empty set
	* iii) Iterate for loop and add inputs into set(skip duplicate value)
	* iv) Create empty integer array with num size
	* v) Iterate set values in integer array
	* vi)if (array.length == 2) {
			return array[1];
		} else if (array.length == 1) {
			return array[0];
		} else {
			return array[array.length - 3];
		}
	*  
	
	* */


	
	@Test
	public void test1() {
		System.out.println(thirdMax(new int[] { 3, 2, 1 }));
	}

	@Test
	public void test2() {
		System.out.println(thirdMax(new int[] { 1, 1, 2 }));

	}

	@Test
	public void test3() {
		System.out.println(thirdMax(new int[] { 2, 2, 3, 1,5,6,5,4}));

	}

	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> num = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			num.add(nums[i]);
		}
		int[] array = new int[num.size()];
		int i = 0;
		for (int val : num) {
			array[i++] = val;
		}

		if (array.length == 2) {
			return array[1];
		} else if (array.length == 1) {
			return array[0];
		} else {
			return array[array.length - 3];
		}

	}
}
