package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingNumber {

	/*
	 *
	* What is the input(s) type? Integer array
	* What is the expected output? int
	* 
	* Positive - {3,0,1}
	* Edge - {0,1}
	* Negative - {9,6,4,2,3,5,7,0,1}
	*
	*
	* Pseudo code 
	* Sort the array
	* find the length of the input array
	* Iterate a for loop
	*  - if the nums[i] is not equal to i value
	*  - return i
	* return -1
	* 
	* 	* */


	
	@Test
	public void test1() {
		System.out.println(missingNumber(new int[] {3,0,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(missingNumber(new int[] {0,1}));

	}
	
	@Test
	public void test3() {
		System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));

	}
	
    public int missingNumber(int[] nums) {
    	Arrays.sort(nums);
    	int x = nums.length;
    	int i = 0;
    	for(i=0;i<x;i++) {
    		if(!(nums[i]==i)) {
    			return i;
    		}
    	}
		return i;
    	
    }
}
