package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class AddToArray_FormInteger {
	
	
	/*
	 * Input of the problem - Integer array and int
	 * Output should be in Integer list
	 * 
	 * Positive - {1,2,0,0}  , 34
	 * Negative - {}    , 0
	 * Edge - {0} , 0
	 * 
	 * Pseudo code
	 * i) Create an variable n=0 i=0 and total
	 * ii) Iterate the inputs length 
	 *   -  Calculate the variable with 10 + input[i] (n = n*10 +input[i])
	 * iii) Add n and k and store it in total integer
	 * iv) Convert it into string total (String.valueof(n)
	 * v) Create an empty list of Integers
	 * vi) Iterate for each loop
	 *     - Converting int into string (string.valueof(total) and iterate with char c
	 *     - and storing to an char array
	 *     - add each value in List of integers along with converting char into int
	 *      by Integer.parseInt(string.valueof(c)
	 * vii) return list
	 */
	@Test
	public void test1() {
		System.out.println(addToArrayForm(new int[] {1,2,0,0}, 34));
	}
	
	@Test
	public void test2() {
		System.out.println(addToArrayForm(new int[] {}, 0));
	}
	
	@Test
	public void test3() {
		System.out.println(addToArrayForm(new int[] {0}, 0));
	}
	
	
    public List<Integer> addToArrayForm(int[] num, int k) {
    	
    	int n=0;
    	for(int i=0;i<num.length;i++) {
    		n=n*10+num[i];
    	}
    	int total = n+k;
//    	String total = String.valueOf(n+k);
//    	List<Character> f = new ArrayList<>();
//          for(char c: total.toCharArray()) {
//        	  f.add(c);
//          }
//          List<Integer> intList = new ArrayList<>();
//          for (Character c : f) {
//              intList.add((int) c - '0');
//          }
//          //System.out.println(intList);
//           
//		return intList;
    	
    	List<Integer> list = new ArrayList<>();
    	for (char c : String.valueOf(total).toCharArray()) {
    	    list.add(Integer.parseInt(String.valueOf(c)));
    	}
    	return list;
 
}}
