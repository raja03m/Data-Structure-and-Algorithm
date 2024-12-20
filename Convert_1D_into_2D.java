package leetCode_DSA_Problems;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Convert_1D_into_2D {

	
	/**
	 * Input type - integer of array
	 * Output type - 2D 
	 * 
	 * Positive - 1,2,3,4  m=2, n=2
	 * Negative - 1,2  m =1, n=1
	 * Edge - 1,2,3 m=1, n=3
	 * 
	 * 
	 * Pseudo code
	 * 
	 * intiate index =0;
	 * if(nums).length != m*n 
	 *      return int[0][0];
	 * 
	 * int[][] result = new int[m][n];
	 * for(int i=0;i<m,i++)
	 *   for(int j=0;i<n;j++)
	 *   	result[i][j] = nums[index++];
	 *   }
	 *  }
	 * return result
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(construct2DArray(new int[] {1,2,3,4}, 2, 2)));
	}
	
	@Test
	public void test2() {
		System.out.println(Arrays.toString(construct2DArray(new int[] {1,2}, 1, 1)));
	}
	
	@Test
	public void test3() {
		System.out.println(Arrays.toString(construct2DArray(new int[] {1,2,3}, 1, 3)));		
	}
	
	public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }

        return result;
    }
}

