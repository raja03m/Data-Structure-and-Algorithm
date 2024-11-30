package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SingleNumber {

	
	@Test
	public void test1() {
		System.out.println(singleNumber(new int[] {2,2,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));

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
