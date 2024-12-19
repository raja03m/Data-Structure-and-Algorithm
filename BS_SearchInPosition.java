package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class BS_SearchInPosition {

	/*
    Binary search:
 i-p= {1,3,5,6}, target=5
 o/p = 2
- initialise two pointers low=0, high=nums.length-1
- while (low<=high)
	- find the mid point
	- if (nums[mid]>=target)
	    result =mid;
	    high=mid-1;
	- if (nums[mid]<target) move to right
		low=mid+1;
    https://leetcode.com/problems/search-insert-position/
     */

    @Test
    public void testOne()
    {
        int[] nums={1,3,5,6};
        int target=5;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    @Test
    public void testTwo()
    {
        int[] nums={1,3,5,6};
        int target=2;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    @Test
    public void testThree()
    {
        int[] nums={1,3,5,6};
        int target=7;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }


    private int searchInsert(int[] nums, int target) {
        int result=nums.length,low=0,high=nums.length-1,mid=0;

    while(low<=high)
    {
        mid=(low+high)/2;
        if(nums[mid]>= target)
        {
            result=mid;
            high=mid-1;
        }
        else if(nums[mid]< target)
        {
            low=mid+1;
        }
    }
    return result;
    }

}