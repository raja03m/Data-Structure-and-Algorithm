package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SubArrayWithZeroSum {
	
	/*
	 * Input type - integer of array
	 * Output type- boolean
	 * 
	 * Positive - {4,2,-3,1,6}
	 * Negative - {4,2,0,1,6}
	 * Edge - {-3,2,3,1,6}
	 * 
	 * Pseudo code
	 * 
	 * initiate variable sum=0;
	 * Create an empty Map -"map"
	 * Iterate for loop for input nums.length
	 *  - sum = sum+nums[i]
	 *   if(sum==k)
	 *      return true
	 *   map.put(sum,1);
	 *return -1;
	 *
	 */

	@Test
	public void test1() {
		System.out.println(sum(new int[] {4,2,-3,1,6}));
	}
	
	public boolean sum(int[] nums) {
		int sum=0,k=0;
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
			if(map.containsKey(sum)) 
				return true;
			else 
				map.put(sum, 1);
		}
		return false;
		
	}
}
