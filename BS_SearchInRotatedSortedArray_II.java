package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class BS_SearchInRotatedSortedArray_II {

	
	/*
	 * Input type- integer of array
	 * Output type - boolean
	 * 
	 * Positive - nums = [2,5,6,0,0,1,2], target = 0
	 * Negative -nums = [2,5,6,0,0,1,2], target = 3
	 * Edge - [1,1,0,1,1,1] target =1
	 * 
	 * 
	 * Pseudo code
	 * 
	 * Initiate int left =0, mid=0, right=nums.length-1
	 * 
	 * condition to check if its empty -> return false
	 * if(nums == null || nums.length ==0){
	 *     return false;
	 * 
	 * 
	 * Iterate while(left <= right)   
	 *    if(nums[mid] == target){
	 *      return true
	 *    
	 * calculating from left to mid and checking within that target is present 
	 *     
	 *     while(left<=mid)
	 *      {
	 *      if( nums[left]<=target && target <= nums[mid]
	 *          right = mid-1
	 *      else
	 *         left = mid+1
	 *     
	 *     viceversa for left
	 *     
	 *  return false
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(search(new int[] {2,5,6,0,0,1,2}, 0));
	}
	
	@Test
	public void test2() {
		System.out.println(search(new int[] {2,5,6,0,0,1,2}, 3));
	}
	
	@Test
	public void test3() {
		System.out.println(search(new int[] {1,1,0,1,1,1}, 1));
	}
	
	
	public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

//            while (left < mid && nums[left] == nums[mid]) {
//                left++;
//            }
//
//            // Skip duplicates in the right half
//            while (mid < right && nums[mid] == nums[right]) {
//                right--;
//            }
            
            // If the left half is sorted
            if (nums[left] <= nums[mid]) {
                // If the target is in the left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // If the right half is sorted
            else {
                // If the target is in the right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}

