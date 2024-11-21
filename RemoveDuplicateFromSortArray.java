package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveDuplicateFromSortArray {

	
	/*
	 * Input type - Integer Array
	 * Output type - Int
	 * 
	 * Positive - Input: nums = [1,1,2]
	 * Negative - Input: nums = [0,0]
	 * Edge - Input: nums = []
	 * 
	 * Pseudo code
	 * i) initiate variable  k=1;
	 * ii) for loop with nums length
	 *    -  if(nums[i] != nums[i-1]
	 *        nums[k++]=nums[i]
	 *    returns k
	 *        
	 */
	
    	
    	@Test
    	public void test1() {
    		System.out.println(removeDuplicates(new int[] {1,1,2}));
    	}
    	
    	@Test
    	public void test2() {
    		System.out.println(removeDuplicates(new int[] {0,0}));
    	}
    	
    	@Test
    	public void test3() {
    		System.out.println(removeDuplicates(new int[] {}));
    	}
    	
        public int removeDuplicates(int[] nums) {
        	if (nums.length == 0) return 0;
            
            int k = 1; // number of unique elements
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k++] = nums[i];
                }
            }
            System.out.println(Arrays.toString(nums));
            return k;
        }
}