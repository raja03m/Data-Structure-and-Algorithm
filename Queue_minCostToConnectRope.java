package queue;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class Queue_minCostToConnectRope {

	/**
	 * 
	 * Input type - integer of array
	 * Ouput type - int
	 * 
	 * Positive - arr[] = {4,3,2,6} , N = 4
	 * 
	 * 
	 * Pseudo code
	 * 
	 * 2+3 =5
		5+4=9  => 9+5=14
		9+6=15. => 15+14 =29
	 */
	
	@Test
	public  void test1() {
		System.out.println(minCost(new int[] {4,3,2,6},4)); //  
	}
	
	public  int minCost(int[] nums, int k) {
		int sum = 0, cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);// 2,4,3,6
		}
		sum = pq.poll();
		for (int i = 1; i < nums.length; i++) {
			sum += pq.poll();
			cost += sum;
		}
		return cost;
	}
}
