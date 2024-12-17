package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SW_Fruits_Into_Basket {

	/*
	 * Input type - integer array
	 * Output type- int
	 * 
	 * Positive - 1 2 1
	 * input 2  - {0,1,2,2}
	 * input 3 - {1,2,3,2,2}
	 * 
	 * 
	 * Pseudo code
	 * 
	 * initiate left=0,right=0,maxfruit=0
	 * iterate for loop with nums[right]
	 * map.put(nums[right], map.getordefault(nums[right],0)+1)
	 * while loop(map.size>2)
	 *     map.put(nums[left], map.getordefault(nums[left],0)-1;
	 *     if(map.get(map[left]==0)
	 *          map.remove(map[left]
	 *     left++
	 * maxfruit = Math.max(maxfruit,right-left+1);
	 * 
	 * return maxfruit;
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(totalFruit(new int[] {1,2,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(totalFruit(new int[] {0,1,2,2}));
	}
	
	@Test
	public void test3() {
		System.out.println(totalFruit(new int[] {1,2,3,2,2}));
	}
	
    public int totalFruit(int[] fruits) {
    	int left=0, right=0, maxFruit=0;
    	Map<Integer,Integer> map = new HashMap<>();
    	
    	for(right=0;right<fruits.length;right++) {
    		map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);
    		
    		while(map.size()>2) {
    			map.put(fruits[left], map.getOrDefault(fruits[left], 0)-1);
    			
    			if(map.get(fruits[left])==0) {
    				map.remove(fruits[left]);
    			}
    			left++;
    		}
    		maxFruit = Math.max(maxFruit,right-left+1);
    	}
		return maxFruit;
    
    }
}
