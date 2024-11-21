package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class OnlyOneOccurance {
	
	
	/*
	 * 
	 * Input type - integer of array
	 * Output type - int
	 * 
	 * Positive - input int[] {2,2,1}
	 * Negative - input int[] {1,2,1,2}
	 * Edge - input int[] {1}
	 * 
	 *
	 * Pseudo code
	 * 
	* i)Sorting the nums 
	* ii)Create an empty Hashmap list - countMap
	* iii)Iterate for each loop for  nums
	*     - countmap put num , countmap.getorDefault(num,0)+1)
	* iv)Iterate for each loop for countmap.keyset()
	*     if countmap.get(num) ==1
	*     return num
	* return -1
	*  */
	
	@Test
	public void test1() {
		System.out.println(singleNumber(new int[] {2,2,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(singleNumber(new int[] {1,2,1,2}));
	}
	
	@Test
	public void test3() {
		System.out.println(singleNumber(new int[] {1}));
	}
	
    public int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}

