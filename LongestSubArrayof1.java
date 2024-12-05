package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class LongestSubArrayof1 {

	/**
	 * 
	 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
	 * 
	 * Input type - Integer of array
	 * Output type - int
	 * 
	 * 
	 * Positive - Input: nums = [1,1,0,1]
	   2nd input - Input: nums = [0,1,1,1,0,1,1,0,1]
	   Edge - Input: nums = [1,1,1]

	 * 
	 *Pseudo code
	 *
	 *Initiate P1=0 slow pointer, P2=0 fast moving pointer and maxLen = 0;
	 *iterate while loop p2>nums.length
	 *      if(nums[p2]==0)
	 *          zeros++;
	 *      
	 *      iterate another while loop
	 *         while(zeros>1){
	 *          if(nums[p1]==0)
	 *            zeros--;
	 *            }
	 *            p1++
	 *      }
	 *      
	 *      mathLen = Math.max(maxlen, p2-p1+1);
	 *      p2++  ;
	 *   }
	 *   
	 *   Iterate another if loop for all inputs are 1 but we need to remove 1 element
	 *      if(maxLen==nums.length)
	 *          maxLen - 1
	 * return maxLen
	 */
	
	@Test
	public void test1() {
		System.out.println(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
	}
	
    public int longestSubarray(int[] nums) {
    	
    	int p1=0,p2=0,maxLen=0,zeros=0;
    	
    	while (p2 < nums.length) {
            if (nums[p2] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (nums[p1] == 0) {
                    zeros--;
                }
                p1++;
            }
            if(zeros==1) {
            	maxLen = Math.max(maxLen, p2-p1);
            }else {
            	maxLen = Math.max(maxLen, p2 - p1 + 1);
            }
            p2++;
        }

        // If the entire array contains only ones, return the length minus one
        if (maxLen == nums.length) {
            maxLen--;
        }

        return maxLen;
    }
}