package sorting;

import java.util.Arrays;

public class MergeSort {

	
	public static void main(String[] args) {
		int[] nums = {5,4,1,2,3};
		System.out.println(Arrays.toString(mergeSort(nums)));
	}

	private static int[] mergeSort(int[] nums) {
		 helper(nums, 0, nums.length-1);
		 return nums;
		 
	}

	private static void helper(int[] nums, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high) {
			return;
		}
		
		int mid = (low + high)/2;
		helper(nums, 0, mid);
		helper(nums, mid+1, high);
		merge(nums, low, mid, high);
	}

	private static void merge(int[] nums, int low, int mid, int high) {
		
		
		int p1 = 0, p2 = 0, index = low;

        int[] left = Arrays.copyOfRange(nums, low, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);
        while (p1 < left.length && p2 < right.length) {
            if (left[p1] <= right[p2]) {
                nums[index++] = left[p1++];
            } else
                nums[index++] = right[p2++];
        }
        while (p1 < left.length) {
            nums[index++] = left[p1++];
        }
        while (p2 < right.length) {
            nums[index++] = right[p2++];
        }

    }
}