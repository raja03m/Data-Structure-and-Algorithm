package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SW_SubArrayWithKDiff_Int {

	/**
	 * 
	 * Input type - integer of array
	 * Ouput type - int
	 * 
	 * Two inputs
	 * input1  : nums = [1,2,1,2,3], k = 2
	 * input2  : nums = [1,2,1,3,4], k = 3
	 * 
	 * Pseudo code
	 * 
	 * Intitiate int left=0, right=0, total=0;
	 * Map with integer, integer
	 * 
	 * iterate a for loop with length
	 *    map.put(nums[right] with count++
	 *    while(map.size>k){
	 *      map.put(nums[left], count--
	 *      
	 *        if(map[left]==0
	 *           map.remove[left];
	 *      left++;
	 *      
	 *      }
	 *      total = total +right-left+1;
	 *     }
	 *      return total
	 */
	
	@Test
	public void test1() {
		System.out.println(subarraysWithKDistinct(new int[] {1,2,1,2,3}, 2) - subarraysWithKDistinct(new int[] {1,2,1,2,3}, 2-1));
	}
	
	@Test
	public void test2() {
		System.out.println(subarraysWithKDistinct(new int[] {1,2,1,3,4}, 3) - subarraysWithKDistinct(new int[] {1,2,1,3,4}, 3-1));
	}
	
    public int subarraysWithKDistinct(int[] nums, int k) {
    	int left = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            res += right - left + 1;
        }
        return res;
    	}
    }