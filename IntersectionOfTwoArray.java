package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class IntersectionOfTwoArray {
	
	/*
	 * Input type - integer array num1 and integer array num2
	 * Output type - Integer array
	 * 
	 * Positive - {1,2,2,1} and {2,2}
	 * Negative - {} and {1}
	 * Edge - {0,0} and {0}
	 * 
	 * 
	*- sort the arrays
	 - initialize the pointers with value 0, to traverse both the arrays
	 - compare the elements at index p1, p2
		- if(num1[p1]<nums2[p2])
			-p1++;
		- else if (nums1[p1]>nums2[p2]){
			-p2++;
		- else 
			// add the element into the set //an array
			p1++;p2++	
	*/
	@Test
	public void test1() {
		System.out.println(intersection(new int[] {1,2,2,1}, new int[] {2,2}));
	}
	
	@Test
	public void test2() {
		System.out.println(intersection(new int[] {}, new int[] {1}));
	}
	
	@Test
	public void test3() {
		System.out.println(intersection(new int[] {0,0}, new int[] {0}));
	}
	
    public Integer[] intersection(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	Set<Integer> s = new HashSet<>();
    	// [ 1,1,2,2] [2,2]
    	int p1=0, p2=0;
    	
    	while((p1<nums1.length) && (p2<nums2.length)) {
    		if(nums1[p1]<nums2[p2]) 
    			p1++;
    		else if(nums1[p1]>nums2[p2])
    			p2++;
    		else {
    			s.add(nums1[p1]);
    			p1++;p2++;
    		}
    			
    	}
    	Integer[] array = s.toArray(new Integer[0]);
    	System.out.println(Arrays.toString(array));
		return array;
		
}
}
