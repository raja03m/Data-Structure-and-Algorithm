package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class LongestNiceSubstring {

	/**
	 * 
	 * Input type - String s Output type- String
	 * 
	 * Positive - "YazaAay" Negative - "c" Edge - "aAbB"
	 * 
	 * Pseudo code
	 * 
	 * Initialise pointer p1=0 - slow , p2=0 fast pointer, maxLen = 0;
	 * 
	 * Char[] input = s.toCharArray -Convert string into array and store in "input"
	 * String output = ""; Iterate for loop for(char in: inputs)
	 * if(inputs[p2]==input[p2+1].upperCase) { output.add(input[p2];
	 * output.add(input[p2+1]; } p2++; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		System.out.println(longestNiceSubstring("YazaAay"));
	}

	public String longestNiceSubstring(String s) {
		int n = s.length();
		if (n < 2)
			return "";
		String result = "";
		for (int i = 0; i < n; i++) {
			int[] lower = new int[26];
			int[] upper = new int[26];
			for (int j = i; j < n; j++) {
				char c = s.charAt(j);
				if (Character.isLowerCase(c)) 
					lower[c - 'a']++;
				 else
					upper[c - 'A']++;
				
				if (isNice(lower, upper) && j - i + 1 > result.length()) {
					result = s.substring(i, j + 1);
				}
			}
		}
		return result;
	}

	private boolean isNice(int[] lower, int[] upper) {
		for (int i = 0; i < 26; i++) {
			if (lower[i] > 0 && upper[i] == 0 || upper[i] > 0 && lower[i] == 0)
				return false;
		}
		return true;

	}

}

//int p1=0,p2=0;
//StringBuilder output = new StringBuilder();
//char[] input = s.toCharArray();
//
//
//for(int i=0;i<input.length-1;i++) {
//	if (Character.toLowerCase(input[p2]) == Character.toLowerCase(input[p2+1])) {
//		output.append(input[p2]);
//		output.append(input[p2+1]);
//		if((input.length > 2)) {
//		if(Character.toLowerCase(input[p2+1]) == Character.toLowerCase(input[p2+2])){
//			output.append(input[p2+2]);
//			break;
//		}
//		}
//		else if(input.length==0) {
//			output.append("");
//		}
//	}
//	p2++;
//	}
//return output.toString();
//}
//}
