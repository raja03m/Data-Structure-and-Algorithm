package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RotateArray {

	
	/**
	 * 
	 *Input type - integer of array
	 *Output type- int
	 *
	 *Positive - nums - 1,2,3,4,5,6,7 and k=3
	 *Negative - 1,2 and 3
	 *Edge - 1,2,3 and 3
	 *
	 *Pseudo code
	 *pointer p1=0 p2=nums.length-1
	 *Iterate a for loop with k
	 *
	 * 
	 */
	
	@Test
	public void test1() {
		rotate(new int[] {1,2,3,4,7,8,9},3);
	}
	
	@Test
	public void test2() {
		rotate(new int[] {1,2},3);

	}
	
	@Test
	public void test3() {
		rotate(new int[] { 1, 2, 3 }, 3);

	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

	
	private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

}
