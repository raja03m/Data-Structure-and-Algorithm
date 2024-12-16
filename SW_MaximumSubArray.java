package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class SW_MaximumSubArray {

	
	/**
	 * Input type - integer of array
	 * output type - int 
	 * 
	 * Positive- -2,1,-3,4,-1,2,1,-5,4
	 * Negative- 1
	 * Edge- 5,4,-1,7,8
	 * 
	 * Pseudo code
	 * 
	 * intiate currSum and maxSum = nums[0];
	 * 
	 * iterate for loop until nums length
	 *  - currSum = Math.max(currSum+nums[i], maxSum)
	 *  - maxSum = Math.max(currSum, maxSum);
	 * return maxSum
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	@Test
	public void test2() {
		System.out.println(maxSubArray(new int[] {1}));

	}
	
	@Test
	public void test3() {
		System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));

	}
	
    public int maxSubArray(int[] nums) {
    	int currSum=nums[0], maxSum=nums[0];
    	for(int i=1;i<nums.length;i++) {
    		currSum = Math.max(currSum+nums[i], nums[i]);
    		maxSum = Math.max(currSum, maxSum);
    	}
		return maxSum;
    	
    }

}
