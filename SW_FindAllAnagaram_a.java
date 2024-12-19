package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class SW_FindAllAnagaram_a {

	@Test
	public void testOne() {
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> arnagrramsStarIndex = findArnagrramsStarIndex(s, p);
		System.out.println(arnagrramsStarIndex);
	}

	private List<Integer> findArnagrramsStarIndex(String s, String p) {

		int n=s.length(),m=p.length();
	    ArrayList<Integer> sIndex = new ArrayList<>();
	    if (n < m) {
	        return sIndex;
	    }
	    int[] cwindow = new int[26];
	    int[] pwindow = new int[26];
	    for(int i=0;i<m;i++) {
	        cwindow[s.charAt(i) -'a']++;
	        pwindow[p.charAt(i)-'a']++;
	    }
	    if(Arrays.equals(cwindow,pwindow)) {
	        sIndex.add(0);
	    }
	    for(int i=m;i<n;i++) {
	        cwindow[s.charAt(i)-'a']++;
	        cwindow[s.charAt(i-m)-'a']--;
	        if(Arrays.equals(cwindow,pwindow)) {
	            sIndex.add(i-m+1);
	        }
	    }
	    return sIndex;
	}
}