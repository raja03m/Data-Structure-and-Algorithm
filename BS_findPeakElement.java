package binarySearch;

import org.testng.annotations.Test;

public class BS_findPeakElement {
	/*
    i/p=1,2,3,1
    o/p=2
     /*
    1) low=1,high=nums.lenght-2
   if(n==1) return nums [0];
   if (nums [0]>nums [1]) return nums [0];
   if(nums [n-1]>nums[n-2]) return nums[n-1];
    2) while(low<=high)
     int mid=(low+high)/2;
     if ( nums[mid-1]<nums [mid] && nums[mid+1]<nums[mid]
              return nums[mid];
      if( nums[mid]<nums[mid+1]
            left=mid+1;
       else  high=mid-1;
     */

    @Test
    public void testOne()
    {
        int[] nums={1,2,3,1};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }
    @Test
    public void testTwo()
    {
        int[] nums={1,2,1,3,5,6,4};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }

    @Test
    public void testThree()
    {
        int[] nums={1,2,1,3,5,6,8};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }

    @Test
    public void testFour()
    {
        int[] nums={1,1};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }


    private int findPeakElement(int[] nums) {
        int low = 1, high = nums.length - 2;
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1])
                low = mid + 1;
            else high = mid - 1;
        }
    return -1;
    }
}