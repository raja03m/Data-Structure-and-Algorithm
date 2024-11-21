package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ReverseString {

	
	/*
	 *
	 *Input type character of string
	 *Output String print
	 *
	 *Positive - {'h'e'l'l'o}
	 *negative - {h,''}
	 *edge - {}
	 *
	 *Initiate int variable left = 0;
	 *Initiate int variable right = input.length-1;
	 *Iterate while loop left is greater than right
	 * - char[temp] = s[right];
	 * - s[left] = s[right];
	 * - s[right] = temp;
	 * - left++
	 * - right --
	 *print(s)
	 *
	* 
	* */


	
	@Test
	public void test1() {
	//	ReverseString solution = new ReverseString();
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	    }
	
	@Test
	public void test2() {
	//	ReverseString solution = new ReverseString();
		char[] s = {'h',' '};
		reverseString(s);
	    }
	
	@Test
	public void test3() {
	//	ReverseString solution = new ReverseString();
		char[] s = {'h'};
		reverseString(s);
	    }
	
	
    public void reverseString(char[] s) {
    	
//    	 char[] temp = new char[s.length];
//         for (int i = 0; i < s.length; i++) {
//             temp[s.length - 1 - i] = s[i];
//         }
//		
//       	System.out.println(temp);
//    }
//    }
    	int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
        System.out.println(s);
    }
}
