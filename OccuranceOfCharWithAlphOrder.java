package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfCharWithAlphOrder {
	
	/*
	 * Pseudo code
	 * 
	 * 
	 * iterate the list
		load the entries into tree map
		get the entryset into an arraylist (hint: create arrayList object and pass entryset inside the constructor)
		sort the array list using below lamda expression
		entries.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue()));
		iterate the entry set 
		and add the key value pair in the needed format <key>+" "+<value>
	 * 
	 * Input - 'notebook', 'notebook', 'mouse', 'keyboard', 'mouse'
	 *  notebook2 mouse2 keyboard1 
	 *  mouse2 notebood2 keyboard1
	 * 
	 * Create an empty map List
	 * Iterate a for loop with input.length
	 * 
	 * for(int i=0;i<input.length;i++)
	 *    - if(map.contains(inputs[i]){
	 *    		map.getordefault(input[i], 0+1)
	 *    
	 * Create a treeMap
	 * Iterate a for loop
	 *    - map entry set 
	 *    - map.append(key) append(value)
	 *    
	 *    **(value should be desc order)
	 * 
	 */
	
	@Test
	public void test1() {
		String[] inputt = {"notebook", "notebook", "mouse", "keyboard", "mouse"};
	    List<String> asList = Arrays.asList(inputt);
	    System.out.println(occ(asList));
	}

	public ArrayList<Entry<String, Integer>> occ (List<String>input){
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<input.size();i++) {
				map.put(input.get(i), map.getOrDefault(input.get(i), 0)+1);	
		}
		ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort((i1,i2)->i2.getValue().compareTo(i1.getValue()));		
		return entries;
		

		
	}
}
