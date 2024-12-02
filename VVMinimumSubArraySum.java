package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class VVMinimumSubArraySum {

	/**
	 * 
	 * Input type - int and integer of array
	 * Output type - int
	 * 
	 * Input - integer of array {2,3,1,2,4,3} and int target 7
	 * Negative - {1,1,1} int target 7
	 * 
	 * Pseudo code
	 * initiate p1=0 slow move
	 * p2=0  fast move and min=0;
	 * Create a empty map with integer,integer
	 * while(p2<nums.length) {
    		preSum = preSum + nums[p2];
    		while(preSum>=target) {
    			preSum = preSum - nums[p1];
    			minLen = Math.min(minLen, p2-p1+1);
    			p1++;
    		}
    		p2++;
    	}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(minSubArrayLen(7, new int[] {1,1,1}));
	}
	
	@Test
	public void test3() {
		System.out.println(minSubArrayLen(7, new int[] {1,1,1,1,1,1,1}));
	}
	
    public int minSubArrayLen(int target, int[] nums) {
    	int p1=0, p2=0, minLen = Integer.MAX_VALUE, preSum=0;
    	Map<Integer,Integer>map = new HashMap<>();
    	while(p2<nums.length) {
    		preSum = preSum + nums[p2];
    		while(preSum>=target) {
    			preSum = preSum - nums[p1];
    			minLen = Math.min(minLen, p2-p1+1);
    			p1++;
    		}
    		p2++;
    	}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    public int minSubArrayLen(int[] nums, int target) {
//    	int p1=0, p2=0, min=0, preSum=0;
//    	for(int i=0;i<nums.length;i++) {
//    		preSum += nums[i];
//    		while(preSum>=target) {
//    			preSum=preSum-nums[p1];
//    			min=Math.min(i, p2-p1+1);
//    			p1++;
//    		}
//    		p2++;
//    	}
//    	
//    	
//    	
//    	
//    	
//    	
//		return min;
//    	
//    }
//
//}
