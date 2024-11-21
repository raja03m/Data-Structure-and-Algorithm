package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Palandrome {

	
	/*
	* Input type = integer
	* Output type = boolean
	* 
	* Positive - input int - 123
	* Negative - input int - -121
	* Edge - input int 1
	* 
	* 
	* Pseudo code
	* i) convert the int into char array "x"
	* ii) initiate variables pointer p1=0 and pointer p2= x.length-1
	* iii) Iterate while loop p1>p2
	* iv) Iterate if loop x[p1] ==x[p2]
	*      p1++
	*      p2--
	*     else
	*         return false
	* return true
	* */
		@Test
		public void test1() {
			int input = 121;
			System.out.println(method(input));
		}

		@Test
		public void test2() {
			int input = -121;
			System.out.println(method(input));
		}

		@Test
		public void test3() {
			int input = 1;
			System.out.println(method(input));
		}

		public boolean method(int input) {
			char[] x = String.valueOf(input).toCharArray();
			int p1 = 0, p2 = x.length - 1;
			
			while(p1<p2) {
				if(x[p1]==x[p2]) {
					p1++;
					p2--;
				}
				else {
					return false;
				}
			}
			return true;
//			String x = String.valueOf(input);
//			ArrayList<String> array_list = new ArrayList<String>();
//			String[] strSplit = x.split("");
//			String str = String.join("", strSplit);
//			for (int k = strSplit.length - 1; k >= 0; k--)
//				array_list.add(strSplit[k]);
//			String str1 = String.join("", array_list);
//			if (str.equals(str1)) {
//				return true;
//			}
//			else {
//				return false;
//			}
		}
	}
