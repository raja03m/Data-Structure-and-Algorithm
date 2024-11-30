package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class UncommonCharacter {
	
	/*
	 * 
	 * Input type - string 1 and string 2 
	 * Output type - List of strings
	 * 
	 * Input 1 -str1 = “characters”, str2 = “alphabets” 
	 * Input 2 -str1 = “geeksforgeeks”, str2 = “geeksquiz” 
	 * 
	 * 
	 * Pseudo code
	 * 
	 * Create two emptry Set set1 and set2
	 * Iterate for each loop for str1 length and str2 length
	 * Iterate for loop with comparing set1 with set2
	 * Create empty set with uncommon
	 * 
	 * Convert list to set and print
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(uncommonLetters("characters", "alphabets"));
	}
	
	@Test
	public void test2() {
		System.out.println(uncommonLetters("geeksforgeeks", "geeksquiz"));
	}
	
	public List<Character> uncommonLetters(String str1, String str2){
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for(char c: str1.toCharArray()) {
			set1.add(c);
		}
		
		for(char c: str2.toCharArray()) {
			set2.add(c);
		}
		
		Set<Character>uncommon = new HashSet<>();
		
		for(char c: set1) {
			if(!set2.contains(c)) {
				uncommon.add(c);
			}
		}
		
		for(char c: set2) {
			if(!set1.contains(c)) {
				uncommon.add(c);
			}
		}
		
		List<Character>list = new ArrayList<>(uncommon);
	
		return list;
		
	}

}
