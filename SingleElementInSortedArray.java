package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class SingleElementInSortedArray {

	/**
	 * Same binary pseudo code
	 * int low=0,high=nums.length-1,mid=0;
    int n = nums.length;
    if(n==1) return nums [0];
    if (nums [0]!= nums [1]) 
    	return nums [0]; 
    if(nums [n-1] != nums[n-2]) 
    	return nums[n-1];

    
    while(low<=high)
    {  
    	mid=(low+high)/2;
    
    	if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
      {
    	  low=mid+1; 
      }
      else {
    	  high=mid-1;
      }
    }
 	return nums[low];
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(singleNonDuplicate(new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 }));
	}

	@Test
	public void test2() {
		System.out.println(singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }));
	}

	public int singleNonDuplicate(int[] nums) {
		int low = 0, high = nums.length - 1, mid = 0;
		int n = nums.length;
		if (n == 1)
			return nums[0];
		if (nums[0] != nums[1])
			return nums[0];
		if (nums[n - 1] != nums[n - 2])
			return nums[n - 1];
		while (low <= high) {
			mid = (low + high) / 2;

			if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return nums[low];
	}
}
