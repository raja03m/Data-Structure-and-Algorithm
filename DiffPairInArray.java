package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DiffPairInArray {
	
	/*
	 * 
	 * Input type int of array "nums" and int "target"
	 * Output type  - int
	 * 
	 * Positive - Input: nums = [3,1,4,1,5], target = 2
	 * Negative Input: nums = [1,2,3,4,5], k = 1
	 * Edge - Input: nums = [1,3,1,5,4], k = 0
	 * 
	 * 
	 * Pseudo code
	 * i) sort the integer array list
	 * ii) Initiate pointer p1=0 p2=nums.length-1
	 * iii) create an empty integer Set
	 * iv) Iterate a while loop [1,1,3,4,5]
	 *    - while(p1<p2)
	 *      - if (nums[p2]-nums[p1])!=target
	 *           p2--
	 *        else
	 *           s.add(nums[p1];
	 *           s.add(nums[p2];
	 * return s;
	 */
	
	@Test
	public void test1() {
		System.out.println(findPairs(new int[] {3,1,4,1,5}, 2));
	}
	
	@Test
	public void test2() {
		System.out.println(findPairs(new int[] {1,2,3,4,5}, 5));

	}
	
	@Test
	public void test3() {
		System.out.println(findPairs(new int[] {2,2}, 0));

	}
	
    public int findPairs(int[] nums, int target) {
    	Arrays.sort(nums);
    	int p1=0,p2=(nums.length)-1;
        Set<String> pairs = new HashSet<>();
    	while(p1<=p2) {
    		if ((nums[p2] - nums[p1]) < target) {
                p1++;
            } else if ((nums[p2] - nums[p1]) > target) {
                p2--;
            } else {
                pairs.add(nums[p1] + "," + nums[p2]);
                p1++;
                p2--;
            }
        }
		return pairs.size();
    }
    
    
    
//    	Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        
//        int count = 0;
//        if (target == 0) {
//            // Count duplicates
//            for (int num : set) {
//                int freq = 0;
//                for (int n : nums) {
//                    if (n == num) {
//                        freq++;
//                    }
//                }
//                if (freq > 1) {
//                    count++;
//                }
//            }
//        } else {
//            // Find k-diff pairs
//            for (int num : set) {
//                if (set.contains(num + target)) {
//                    count++;
//                }
//            }
//        }
//        
//        return count;
//    }
    
}

