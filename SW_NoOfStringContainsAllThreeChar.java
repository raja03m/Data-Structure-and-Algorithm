package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class SW_NoOfStringContainsAllThreeChar {

	
	@Test
    public void testOne() {
        String s = "abcabc";
        int theCOntainsSubstringcount = findTheCOntainsSubstringcount(s);
        System.out.println(theCOntainsSubstringcount);

    }
	
	@Test
    public void testTwo() {
        String s = "aaabc";
        int theCOntainsSubstringcount = findTheCOntainsSubstringcount(s);
        System.out.println(theCOntainsSubstringcount);

    }


    private int findTheCOntainsSubstringcount(String s) {

    	int[] asciiCount = new int[3];
		 int left = 0, right = 0, count = 0; 
		 
		 while (right < s.length()) { 
			 
			 asciiCount[s.charAt(right) - 'a']++; 
			 
			 while (asciiCount[0] > 0 && asciiCount[1] > 0 && asciiCount[2] > 0) {
				 
				 count += s.length() - right; 
				 asciiCount[s.charAt(left) - 'a']--; 
				 left++;
				 
			 } 
			 
			 right++; 
		 } 
		 
		 return count;
}
	
}