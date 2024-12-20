package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Maths;

public class SquareRootSortedArray {

	
	/*
	 * 
	 *used for loop to sq the integer of array and add it back
	 *
	 * 
	 *Used selected sort instead of default sort array 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
	}
	
	@Test
	public void test2() {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11})));
	}
	
    public int[] sortedSquares(int[] nums) {
    	
    	int p1=0, p2=nums.length-1, n=nums.length;
    	int[] res = new int[n];
    	
    	for(int i=n-1;i>=0;i--) {
            if (Math.abs(nums[p1]) >= Math.abs(nums[p2])) {
    			res[i] = nums[p1]*nums[p1];
    			p1++;
    		}else {
    			res[i] = nums[p2]*nums[p2];
    			p2--;
    		}
    	}
    	
		return res;
    }
}
    	
//    	for(int i=0;i<nums.length;i++) {
//    		 nums[i]= nums[i]*nums[i];
//    	}
//    	
//        for (int i=0;i<nums.length;i++){
//            int minIndex=i;
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]<nums[minIndex]){
//                    minIndex=j;
//                }
//            }
//            // swap i, minIndex
//            int temp= nums[i];
//            nums[i]=nums[minIndex];
//            nums[minIndex]=temp;
//        }
//        return nums;
//    }
//}
