package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class TP_3Sum {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer 
	* Do I have constraints to solve the problem? Preserve white space and initial word order
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {1,5,3,3,4,6,7,7,8};
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes
	* Yes - great, is there an alternate?
	* 
	* 4) Ask for hint (If you do not know how to solve)
	* 
	* 5) Do I know alternate solutions as well? 
	* 
	* No - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Bruteforce
	* sort it and 
	* compare first and next element if distinct increase count
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	
	
	@Test
	public static void Test2() {
		int[] inpArray = {0,0,0,0,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	@Test
	public static void Test3() {
		int[] inpArray = {1,1,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	@Test
	public static void Test4() {
		int[] inpArray = {-1,0,1,0}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	
	@Test
	public static void Test5() {
		int[] inpArray = {-2,0,1,1,2}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	//-1,0,1,2,-1,-4,-2,-3,3,0,4
	@Test
	public static void Test6() {
		int[] inpArray = {-1,0,1,2,-1,-4,-2,-3,3,0,4}; 
		System.out.println(findTriplets(inpArray));
	}
	
	@Test
	public static void Test1() {
		int[] inpArray = {-1,0,1,2,-1,-4}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	public static List<List<Integer>> findTriplets(int[] nums){
		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);// -4 -1 -1 0 1 2 

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return result;
    }
}