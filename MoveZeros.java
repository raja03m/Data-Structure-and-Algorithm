package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveZeros {
	
	
	/*
	 *Input type -integer of array 
	 *Output type - integer of array
	 *
	 *Positive -{0,1,0,3,12}
	 *Negative -{1,3,12}
	 *Edge - {0,0}
	 * 
	 * Pseudo code
	 * i) initiate int variable i =0;
	 * ii) Iterate a for loop with nums length
	 *    - if nums[j] is not equal to 0
	 *    - nums[i]=nums[j];
	 *    -i++;
	 * iii)Iterate a for loop with nums.length starting from i value
	 *    - nums[i value] =0;
	 *    so from i value to length remaining element will be replaced by 0
	 * iv)return nums
	 * 
	 * 
	 */
	


	@Test
	public void test1() {
		System.out.println(moveZeroes(new int[] {0,1,0,3,12}));
	}
	
	@Test
	public void test2() {
		System.out.println(moveZeroes(new int[] {0}));
		
	}
	
    public int[] moveZeroes(int[] nums) {
    	int i=0;
    	for(int j=0;j<nums.length;j++) {
    		if(nums[j] !=0) {
    			nums[i]=nums[j];
    			i++;
    		}
    	}
    	for(int z=i;z<nums.length;z++) {
    		nums[z]=0;
    	}
    	System.out.println(Arrays.toString(nums));
		return nums;
    }
}
    	