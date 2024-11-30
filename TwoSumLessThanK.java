package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TwoSumLessThanK {

	
	/*
	 * Input type - array of integer
	 * Output type - int
	 * 
	 * Positive - nums = [34,23,1,24,75,33,54,8], k = 60
	 * Negative - nums = [35,35], k = 60
	 * Edge - nums = [], k = 60
	 * 
	 * Pseudo Code
	 * i)sort the array - Arrays.sort(nums)
	 * ii) intiate pointer p1=0 and p2=nums.length and target k=60 maxNum=-1
	 * iii) while(p1<p2)
	 *     if(nums[p1]+nums[p2]<target)
	 *       maxNum = Math.max(maxNum,nums[p1]+nums[p2])
	 *       p1++
	 *     else
	 *       p2--
	 * return maxNum
	 * 
	 */
	
	
	@Test
	public void test1() {
		System.out.println(twoSum(new int[] {34, 23, 1, 24, 75, 33, 54, 8}, 60));
	}

	@Test
	public void test2() {
		System.out.println(twoSum(new int[] { 34, 35 }, 60));
	}

	@Test
	public void test3() {
		System.out.println(twoSum(new int[] {}, 60));
	}

	public int twoSum(int[] nums, int target) {
		Arrays.sort(nums);
		int p1 = 0, p2 = (nums.length-1), maxNum = -1;
		while (p1 < p2) {
			int sum = nums[p1] + nums[p2];
			if (sum < target) {
				maxNum = Math.max(maxNum, sum);
				p1++;
			} else
				p2--;
		}
		return maxNum;
	}
}
