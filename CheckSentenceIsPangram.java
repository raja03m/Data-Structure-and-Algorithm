package leetCode_DSA_Problems;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class CheckSentenceIsPangram {

	
	/*
	 * Input type - string
	 * output type - boolean
	 * 
	 * Positive - "thequickbrownfoxjumpsoverthelazydog"
	 * Negative - "asad"
	 * Edge -'aaabbbbbbbbbbbbbcccccccccccddd'
	 * 
	 * Pseudo code
	 * 
	 * Iterate for each loop with input 
	 * Add it to any empty Character set
	 * if the length is equal to 26 return true 
	 * else false
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		
	}
	
	@Test
	public void test2() {
		System.out.println(checkIfPangram("asad"));

	}
	
	@Test
	public void test3() {
		System.out.println(checkIfPangram("aaabbbbbbbbbbbbbcccccccccccddd"));

	}
	
    public boolean checkIfPangram(String sentence) {
    	Set<Character> alphabet = new HashSet<>();
    	for(char alph: sentence.toCharArray())
    		alphabet.add(alph);
		return alphabet.size()==26;

    }
}
