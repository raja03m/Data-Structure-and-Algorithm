package queue;

import java.util.PriorityQueue;

import org.testng.annotations.Test;


public class Queue_kTh_SmallestElement {

	
	@Test
	public void test1() {
		System.out.println(kThMin(new int[] {1,3,5,7,9},4)); // 1,3,5,7,9 - >
	}
	
	public int kThMin(int[] nums, int k ) {
		
//		int answer=0; 
//		//PriorityQueue<Integer> prior = new PriorityQueue<>((a,b)->b-a);
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int i=0; i<nums.length;i++) {
//			pq.add(nums[i]); 
//		}
//		
//		while(k>0) {
//			answer = pq.poll();
//			k--;
//		}
//		return answer;
//		
//	}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for (int i=0;i<k;i++) {
			pq.add(nums[i]);
		}
		
		for(int i=k;i<nums.length;i++) {
			if(nums[i]<pq.peek()) { 
				pq.poll();
				pq.add(nums[i]); 
			}
		}
		return pq.poll();
		
	}
}
