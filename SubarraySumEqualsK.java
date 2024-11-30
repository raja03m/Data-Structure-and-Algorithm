package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SubarraySumEqualsK {

	/**
	 * 
	 * Input type- integer of array
	 * Output type- int
	 * 
	 * Two input set - input {1,1,1} and 2 
	 * {1,2,3} and 3
	 * 
	 * 
	 * Pseudo code
	 * Create an Empty hashmap - map
	 * inititate an empty variable int sum and count =0
	 * Iterate for loop with nums.length
	 *  - sum = sum+num[i];
	 *  - if(map.containskey(sum)) return true
	 *    else
	 *    map.put(sum,1);
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(subarraySum(new int[] {1,1,1}, 2));
	}
	
	@Test
	public void test2() {
		System.out.println(subarraySum(new int[] {1,2,3}, 3));
	}
	
    public int subarraySum(int[] nums, int k) {
    	int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}