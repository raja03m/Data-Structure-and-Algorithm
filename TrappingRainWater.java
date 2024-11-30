package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class TrappingRainWater {
	
	@Test
	public void test1() {
		System.out.println(storeWater(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
		
	}

	public static int storeWater(int[] nums) {
		
		int ans=0;
		int[] leftMaxHeight = new int[nums.length];
		int[] rightMaxHeight = new int[nums.length];

		leftMaxHeight[0]= nums[0];
		rightMaxHeight[rightMaxHeight.length-1]= nums[nums.length-1];
		
		//find out left heights
		
		for(int i=1;i<nums.length;i++) {
			leftMaxHeight[i] = Math.max(leftMaxHeight[i-1], nums[i]);
		}
		
		// find out right heights
		for(int i=rightMaxHeight.length-2;i>=0;i--) {
			rightMaxHeight[i] = Math.max(rightMaxHeight[i+1], nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			ans += Math.min(leftMaxHeight[i], rightMaxHeight[i])-nums[i];
			ans = Math.max(0, ans);
		}
		return ans;
		
	}
}
