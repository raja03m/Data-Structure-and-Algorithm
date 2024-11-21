package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class MajorityElement {
	
	/*
	* What is the input(s) type? String
	* What is the expected output? boolean
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	
	* Minimum of 3 data set !!
	* Positive - {3,2,3}
	* Edge - {1}
	* Negative - {1,2,3}
	*
	*
	* Start always with pseudo code 
	* Sort the integer array
	* Iterate nest for loop
	*  - create local variable count=0
	*  - if the condition nums[i] is equal to nums[j]
	*  - count++
	*  - if condition - count is greater than inputs. length divide 2
	* return nums[i]
	*  
	* */


	@Test
	public void test1() {
		System.out.println(majorityElement(new int[]{3,2,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
	}
	
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++) {
    		int count=0;
    		for(int j=0;j<nums.length;j++) {
    			if(nums[i]==nums[j]) {
    				count++;
    				}
    		}
    		if(count>nums.length/2) {
    			return nums[i];
    		}
    		
    	}
    	return -1;
    	
    }

}


