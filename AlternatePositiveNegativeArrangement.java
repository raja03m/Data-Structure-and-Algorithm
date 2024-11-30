package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AlternatePositiveNegativeArrangement {

	
	/**
	 * Input type - integer array
	 * Output type- integer array
	 * 
	 * Positive - [9, 4, -2, -1, 5, 0, -5, -3, 2]
	 * Negative- [0,0,0,-1]
	 * Edge - [-1,-2,0]
	 * 
	 * Pseudo code
	 * 
	 * Two separate array positive and negative
	 * initiate two integer variable x and y =0;
	 * for each loop with input numbers
	 *   - if(a>=0) //positive
	 *     positive[x++] = a;
	 *   -else
	 *     negative[y++] = a;
	 * initiate integer variable k=0;
	 * initiate integer minLen = Math.min(x,y);
	 * for loop with minLen
				numbers[k++] = positive[i];
		        numbers[k++] = negative[i];	 
     * while (k < numbers.length) 
		        numbers[k++] = positive[minLen++];
	 * return numbers
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(alternative(new int[] {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8})));
	}
	
	@Test
	public void test2() {
		System.out.println(Arrays.toString(alternative(new int[] {0,0,0,-1})));
	}
	
	@Test
	public void test3() {
		System.out.println(Arrays.toString(alternative(new int[] {-1,0})));
	}
	
	//acutal - [5, -5, 2, -2, 4, -8, 7, 0, 1, 0]
    //expected [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
	public int[] alternative(int[] numbers) {
		
		int[]positive = new int[numbers.length];
		int[]negative = new int[numbers.length];
		
		int x=0,y=0;
			for(int a: numbers) {
				if(a>=0) 
					positive[x++] = a;
				else
					negative[y++] = a;
			}
			int k=0;
			int minLen = Math.min(x, y);
		    for (int i = 0; i < minLen; i++) {
		        numbers[k++] = positive[i];
		        numbers[k++] = negative[i];
		    }

		    // Append the remaining positive numbers
		    while (k < numbers.length) {
		        numbers[k++] = positive[minLen++];
		    }

		    return numbers;
		}
	}
