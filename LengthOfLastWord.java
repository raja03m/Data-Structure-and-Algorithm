package leetCode_DSA_Problems;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class LengthOfLastWord {
	
	
	/*
	* Input type String
	* Output type integer
	* 
	* Positive - hello world
	* Negatvie - "   fly me   to   the moon  "
	* Edge - "luffy is still joyboy"
	* 
	* 
	* Pseudo code
	* Trim string s
	* Convert string into Array list and then split
	* Remove empty space in List
	* Convert list into String array
	* find the words length 
	* in that last word length and return
	* 
	* */
	
	@Test
	public void test1() {
		System.out.println(lengthOfLastWord("Hello World"));
	}
	
	@Test
	public void test2() {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}
	
	@Test
	public void test3() {
		System.out.println(lengthOfLastWord("luffy is still joyboy"));

	}

    public int lengthOfLastWord(String s) {
    	s = s.trim();
    	List<String> textList = Arrays.asList(s.split("\\s+")); 
    	textList.removeIf(String::isEmpty);
    	String[] words = textList.toArray(new String[0]);
        System.out.println(Arrays.toString(words));
        int x = words.length;
        String lastWord = words[x-1];
        return lastWord.length();
	}

}
