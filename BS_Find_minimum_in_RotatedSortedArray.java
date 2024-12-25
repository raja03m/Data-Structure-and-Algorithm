package binarySearch;

import org.testng.annotations.Test;

public class BS_Find_minimum_in_RotatedSortedArray {

	
	/*
	 * Input type- integer of array
	 * Output type - integer
	 * 
	 * Positive - nums = [3,4,5,1,2]
	 * Input 2- nums = [4,5,6,7,0,1,2]
	 * Input 3 - nums = [11,13,15,17]
	 * 
	 * 
	 * Pseudo code
	 * 
	 * Initiate left=0, right=nums.length-1 mid =0;
	 * 
	 * while (left<=right)
	 *     if(nums.lenth ==1)
	 *          return nums[0]
	 *     
	 *     if(nums[mid]>nums[right])
	 *        left = mid+1;
	 *     else
	 *        right = mid
	 *  
	 *  return nums[left]
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(findMin(new int[] {3,4,5,1,2}));
	}
	
	@Test
	public void test2() {
		System.out.println(findMin(new int[] {4,5,6,7,0,1,2}));

	}
	
	@Test
	public void test3() {
		System.out.println(findMin(new int[] {11,13,15,17}));

	}
	
	public int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] > nums[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return nums[left];
	    }
	}