package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class RemoveElementTwoPointer {

/*
 * Input type - integer array and int 
 * Output type - int
 * 
 * Positive Input: nums = [3,2,2,3], val = 3
 * Negative Input: nums = [0,1,3,0,4], val = 2
 * Edge Input: nums = [0,0], val = 0;
 * 
 * Sample Input: nums = [0,1,2,2,3,0,4,2], val = 2

 * 
 * Pseudo code
 * i)Initialize variable for k and 	i
 * ii)Iterate  a for loop with input nums length
 *     - if nums[i] is not equal to val
 *     - nums[k++] = num[i]
 * iv) return k
	*/
	
	
	@Test
	public void test1() {
		System.out.println(removeElement(new int[] {3,2,2,3}, 3));
	}
	
	@Test
	public void test2() {
		System.out.println(removeElement(new int[] {0,1,3,0,4}, 2));
	}
	
	@Test
	public void test3() {
		System.out.println(removeElement(new int[] {0,0}, 0));
	}
	
	@Test
	public void test4() {
		System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
	}
	
    public int removeElement(int[] nums, int val) {
    	int k=0,i;
    	for(i=0;i<nums.length;i++) {
    		if(nums[i]!=val) {
    			nums[k++]=nums[i];
    		}
    	}
		return k;
    	
    }

}
