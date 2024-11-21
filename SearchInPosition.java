package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SearchInPosition {

	/*
	 * Need to reverify the problem
	* */


	
	@Test
	public void test1() {
		System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
	}
	
	@Test
	public void test2() {
		searchInsert(new int[]{1,3,5,6}, 2);
	}
	
	@Test
	public void test3() {
		searchInsert(new int[]{1,3,5,6}, 7);
	}
	
    public int searchInsert(int[] nums, int target) {
    	Set<Integer> n = new TreeSet<>();
    	for(int i=0;i<nums.length;i++) {
    		n.add(nums[i]);
    		n.add(target);
    	}
    	Object[] x = n.toArray();
    	for(int j=0;j<n.size();j++) {
    		if(x[j].equals(target)) {
    			System.out.println(j);
    			return j;
    		}
    	}
		return target;
    	

	}

}
