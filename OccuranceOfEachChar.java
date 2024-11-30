package leetCode_DSA_Problems;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

public class OccuranceOfEachChar {

	/*
	 * Input type - String Output type - String
	 * 
	 * Positive- aabbccddde
	 * Second input- aZ 
	 * Edge-abc
	 * 
	 * Pseudo code 
	 * Convert string to char array 
	 * Create an empty Map with Character/integer
	 * String builder ouput
	 * Iterate for loop with inpuT length Map count
	 *   	- map.put the input[i] with count of key
	 * Iterate a for loop with map.entry<Character and integer> 
	 *      - output.append the key and value
	 * return output.toString
	 */

	@Test
	public void test1() {
		System.out.println(occurance("aabbccddde"));
	}

	@Test
	public void test2() {
		System.out.println(occurance("aZ"));
	}

	@Test
	public void test3() {
		System.out.println(occurance("abc"));
	}

	public String occurance(String inpuT) {
		char[] input = inpuT.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < inpuT.length(); i++)
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			output.append(entry.getKey()).append(entry.getValue());
		return output.toString();
	}
}
