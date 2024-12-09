package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindFirstAndLastElementSortedArray {

	/**
	 * 
	 * Input type- integer of array  and int
	 * Output type- int
	 * 
	 * Positive - 5,7,7,8,8,10 target 8
	 * Negative - 5,7,7,8,8,10 target 6
	 * Edge - [] target 0
	 * 
	 * 
	 * Pseudo code
	 * /*
		    Binary search:
		 i-p= {5,7,7,8,8,10}, target=8
		 o/p = 3,4
		- initialise two pointers low=0, high=nums.length-1
		- while (low<=high)
			- find the mid point
			- if (nums[mid]>=target)
			    result =mid;
			    high=mid-1;
			- if (nums[mid]<target) move to right
				low=mid+1;
	* 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 8)));
	}
	
	@Test
	public void test2() {
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 6)));

	}
	
	@Test
	public void test3() {
		System.out.println(Arrays.toString(searchRange(new int[] {}, 0)));

	}
	
    public int[] searchRange(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
	    int[] res = new int[]{-1, -1};

    	if(nums==null||nums.length==0)
    		return res;
        while(low<=high) {
        	int mid = (low+high)/2;
        	if(nums[mid]>target) {
        	   high=mid-1;
        	}
        	else if(nums[mid]<target){
        		low=mid+1;
        	}
        	else {
        		res[0]=mid;
        		res[1]=mid;
        		while (res[0] > 0 && nums[res[0] - 1] == target) {
                    res[0]--;
                }
                while (res[1] < nums.length - 1 && nums[res[1] + 1] == target) {
                    res[1]++;
                }
                return res;
            }
        }
		return res;
    }
}
