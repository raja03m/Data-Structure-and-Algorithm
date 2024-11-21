package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TwoSum {

	
	/*
	 *Input type - integer of array and int target
	 *Output type - integer
	 *
	 *Positive  {5,7,2} and 9
	 *Negative  {5,7,2} and 20
	 *Edge      { } and 1
	 *
	 *
	 *Pseudo code
	 *i) Initiate int pointer p1=0, p2=input.length-1 and target = 9
	 *ii) Initiate an empty list
	 *iii) Iterate p1 > p2.length-1
	 *    if input[p1]+input[p2]!=target
	 *       p1++
	 *    if(input[p1]+input[p2]==target)
	 *       ou
	 *
	* 	* 10) If it fails, debug them to solve it !!
	* */


	@Test
	public void test1() {
		System.out.println(index(new int[] {5,7,2}, 9));
	}
	
	@Test
	public void test2() {
		System.out.println(index(new int[] {5,7,2}, 20));
	}
	
	@Test
	public void test3() {
		System.out.println(index(new int[] {}, 1));
	}
	
	public List<Integer> index(int[] nums, int target) {
		if(nums.length==0) return List.of(-1, -1);
		
		List<Integer> output = new ArrayList<>();
		int p1 = 0, p2 = (nums.length) - 1;
		while (p1 < p2) {
			if (nums[p1] + nums[p2] != target)
				p1++;
			else {
				output.add(p1);
				output.add(p2);
				break;
			}
		}
		return output;
	}
}

//int[] nums  = new int[]{5,7,2}; 
//int target = 9;
//List<Integer> a = new ArrayList<Integer>();
//for(int i=0;i<nums.length;i++){
//  for(int j=i+1;j<nums.length;j++){
//      if(nums[i]+nums[j]==target){
//      a.add(i);
//      a.add(j);
//      break;
//      }
//  }
//}
//System.out.println(a);
