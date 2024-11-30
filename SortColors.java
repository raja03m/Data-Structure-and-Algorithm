package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortColors {

	/*- left=0, right=nums.length-1, mid=0; (mid, fast pointer, left, right= slow pointer)
	
	- if(nums[mid]==0){
		// code
		swap left, mid
		increment both mid, left
	}else if(nums[mid]==1){
		//mid++
	}
	else{
		// swap mid and right
		// decremt right
	}
	*/

	@Test
	public void test1() {		
		System.out.println(Arrays.toString(new int[] {2,0,2,1,1,0}));
	}

	@Test
	public void test2() {
		System.out.println(Arrays.toString(new int[] {0,1,2}));
	}
	
	@Test
	public void test3() {
		System.out.println(Arrays.toString(new int[] {}));
	}

	public static int[] sortColors(int[] nums) {
		int left = 0, right = nums.length - 1, mid = 0;
		int temp = 0;
		while (mid <= right) {
			if (nums[mid] == 0) {
				temp = nums[left];
				nums[left] = nums[mid];
				nums[mid] = temp;
				mid++;
				left++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				temp = nums[mid];
				nums[mid] = nums[right];
				nums[right] = temp;
				right--;
			}

		}
		return nums;
	}

}
