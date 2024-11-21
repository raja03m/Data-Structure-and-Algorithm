package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

/*
*
* 1) Did I understand the problem? -> If yes, go to next step !!
*
* What is the input(s) type? String array
* What is the expected output? boolean
* Do I have constraints to solve the problem? No
* Do I have all informations to go to next step!! yes
// * How big is your test data set will be? single word
*
* 2) Test data set
*
* Minimum of 3 data set !!
* Positive - Input: words = ["bella","label","roller"]

* Edge- Input: words = ["", "aaa"]
* 
* Negative-Input: words = ["bella","cdz","fgh"]

*
* Validate with the interviewer if the data set is fine by his/her assumptions
*
* 3) Do I know how to solve it?
* yes
* Yes - great, is there an alternate?
*
* 4) Ask for hint (If you do not know how to solve)
*
* 5) Do I know alternate solutions as well?
*
* No - That is still fine, proceed to solve by what you know !!
*
* 6) If you know alternate solutions -> find out the O Notations
* (Performance)
*
* Then, explain either both or the best (depends on the time)
*
* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
* Approach 2: Write down the options and benefits and code the best
*
* 7) Start always with Psuedo code // Bruteforce 
*  	Take one empty String List named initial
*   Iterate through the words
*   Iterate through the words
*   Iterate through the words
*   if the value of text is present in words add to the list
*   Else complete the iterations
*   Return the List
*   
*    
* 8) Implement them in the code (editor)
*
* 9) Test against the different data set
*
* 10) If it fails, debug them to solve it !!
* */


public class FindCommonCharacter {
	
	@Test
	public void test1() {
		System.out.println(commonChars(new String[]{"bella","label","roller"}));
	}

	@Test
	public void test2() {
		System.out.println(commonChars(new String[]{"bbb","aaa","sdf"}));
	}

	@Test
	public void test3() {
		System.out.println(commonChars(new String[]{"bella","cddd","fghh"}));
	}

	
    public List<String> commonChars(String[] words) {
    	List<String> result = new ArrayList<>();

        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            boolean common = true;

            for (int j = 1; j < words.length; j++) {
                boolean found = false;
                for (int k = 0; k < words[j].length(); k++) {
                    if (words[j].charAt(k) == c) {
                        found = true;
                        words[j] = words[j].substring(0, k) + "*" + words[j].substring(k + 1);
                        break;
                    }
                }
                if (!found) {
                    common = false;
                    break;
                }
            }

            if (common) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}