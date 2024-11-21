package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayBuild {

	/*
	 * Two pointer 
	 * 
	 * instead of O(N^2) trying to do O(N)
	 * 
	 * Input type - integer array and int
	 * output type - interger array
	 * 
	 * Postive {2,7,11,15} and 9
	 * Negative {1,1} and 5
	 * Edge {0,1} and 1
	 * 
	 * Create two variable left =0 and right = inputs length-1
	 * Iterate through while loop 
	 *   - left is lesser than right
	 *   - adding left and right value and storing it in integer sum
	 *   if sum is equal to target condition
	 *     - return left index +1 and right index +1
	 *   else if sum is lesser than target
	 *      left ++
	 *   else
	 *       right--
	 *   if it fails all condition return -1,-1 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(twoSum(new int[] {2,7,11,15}, 9));
	}
	@Test
	public void test2() {
		System.out.println(twoSum(new int[] {2,3,4}, 6));
	}
	@Test
	public void test3() {
		System.out.println(twoSum(new int[] {-1,0}, -1));
	}

    public int[] twoSum(int[] numbers, int target) {
    	int left =0;
    	int right = (numbers.length) -1;
    	
    	while(left<=right) {
    		int sum = numbers[left]+numbers[right];
    		if(sum==target) 
    			return new int[] {left+1,right+1};
    		else if(sum<target)
    			left++;
    		else
    			right--;
    	}
    	System.out.println(left+","+right);
		return new int[] {-1,-1};
    }
}
    	
    	