package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class PivotIndex {

	/**
	 * Input type - integer array Output type - int
	 * 
	 * Positive - {1,7,3,6,5,6} Negative - {1,2,3} Edge - {2,1,-1}
	 * 
	 * Pseudo code
	 * 
	 * Iterate a for loop and add prefix sum of input nums = "Totalsum" Initialize
	 * int leftSum=0; Iterate a for loop with nums of length - if ( leftsum is equal
	 * to Total - left -nums[i]) return i leftsum = leftsum + nums[i] return -1;
	 * 
	 */

	@Test
	public void test1() {
		System.out.println(pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
	}

	@Test
	public void test2() {
		System.out.println(pivotIndex(new int[] { 1, 2, 3 }));
	}

	@Test
	public void test3() {
		System.out.println(pivotIndex(new int[] { 2, 1, -1 }));

	}

	public int pivotIndex(int[] nums) {

		int totalSum = 0;
		for (int num : nums) {
			totalSum += num;
		}

		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (leftSum == totalSum - leftSum - nums[i]) {
				return i;
			}
			leftSum += nums[i];
		}

		return -1;
	}
}