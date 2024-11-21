package leetCode_DSA_Problems;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class ContainsDuplicate {
	
	/*
	 * 
	 * Input - integer of array
	 * Output - boolean - true or false
	 * 
	 * 
	 * Positive - {1,2,3,1}
	 * Negative - {1,2,3,4}
	 * Edge - {1,1,1,1}
	 * 
	 * 
	 * Declare empty Set
	 * for-each loop for input(for each value in the input try to add it in the set if the following condition is met)
	 * (Iterate each input value using loop)
	 * add the num in Set
	 * if unable to add in Set return false
	 * else true
	 * 
	 */
	
		
	@Test
	public void test1() {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(containsDuplicate(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test3() {
		System.out.println(containsDuplicate(new int[] {1,1,1,1}));
	}
	
	
	public boolean containsDuplicate(int[] nums) {
//		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1; j<nums.length;j++) {
//				if(nums[i]==nums[j])
//					return true;
//			}
//		}
//		return false;
//	}
//}
		
	        Set<Integer> set = new HashSet<>();
	        for (int num : nums) {
	            if (!set.add(num)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
	