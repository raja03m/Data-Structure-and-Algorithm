package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class RemoveDuplicateFromSortArray2 {

	/*
	 * Input type - Integer Array
	 * Output type - Int
	 * 
	 * Positive - Input: nums = [1,1,1,2,2,3]
	 * second - Input: nums = [0,0]
	 * Edge - Input: nums = []
	 * 
	 * Pseudo code
	 * i) initiate variable  k=2;
	 * ii) for loop with nums length
	 *    -  if(nums[i] != nums[k-1]
	 *        nums[k++]=nums[i]
	 *    returns k
	 *        
	 */
	
    	@Test
    	public void test1() {
    		System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
    	}
    	
    	@Test
    	public void test2() {
    		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
    	}
    	
    	@Test
    	public void test3() {
    		System.out.println(removeDuplicates(new int[] {}));
    	}
    	
        public int removeDuplicates(int[] nums) {
        	if(nums.length<=2)return nums.length;
        	int k=2;
        	for(int i=2;i<nums.length;i++) {
        		if(nums[i] != nums[k-2])
        			nums[k++] = nums[i];
        	}
			return k;
        }
}
