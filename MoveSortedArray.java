package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveSortedArray {
	
	/*
	 * Input1 type - integer of array and int  and input 2 type - integer of arry and int
	 * Ouput type - Integer of array print
	 * 
	 * 
	 * Positive - nums1 {1,2,3,0,0,0}, m-3 and input 2 -{2,5,6}, n- 3
	 * Negative - nums1 {1} , m- 1 and input 2 -{0}, n-0
	 * Edge - nums1 {0},m - 0 and input 2 {1}, n -1
	 * 
	 * Pseudo code
	 * initiate variable p1 = input int m-1
	 *                   p2 = input int n-1
	 *                index = nums1.length-1
	 * while loop condition
	 *   while(p1>=0 && p2>=0) {
    		if(nums1[p1]<nums2[p2]) {
    			nums1[index]=nums2[p2];
    			p2--;
    			index--;
    		}
    		else if(nums1[p1]>nums2[p2]) {
    			nums1[index]=nums1[p1];
    			index--;
    			p1--;
    		}else {
    			nums1[index]=nums1[p1];
    			p1--;
    			index--;
	 * 
	 * 
	 */
	@Test
	public void test1() {
		merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
	}
	
	@Test
	public void test2() {
				merge(new int[] {1},1, new int[] {0}, 0);
	}
	
	@Test
	public void test3() {
				merge(new int[] {0},0, new int[] {1},1);
		
	}
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int p1=m-1, p2=n-1, index=nums1.length-1;
    	while(p1>=0 && p2>=0) {
    		if(nums1[p1]<nums2[p2]) {
    			nums1[index]=nums2[p2];
    			p2--;
    			index--;
    		}
    		else if(nums1[p1]>nums2[p2]) {
    			nums1[index]=nums1[p1];
    			index--;
    			p1--;
    		}else {
    			nums1[index]=nums1[p1];
    			p1--;
    			index--;
    			
    		}
    	}
    	while(p2>=0) {
    		nums1[index]=nums2[p2];
    		p2--;
    		index--;
    	}
    	System.out.println(Arrays.toString(nums1));
    }
}
