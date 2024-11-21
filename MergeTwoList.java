package leetCode_DSA_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class MergeTwoList {

	/*
	*Input type - List of integer
	*Output type - List of integer
	*
	*Positive - (1,2,3) and (4,5,6)
	*Negative - () and ()
	*Edge - () and (2)
	* 
	* Pseudo code
	* Converting the list of array into integer of array and storing it
	* Finding which input is lengthly and storing it in num
	* Create an empty List Integer "List3"
	* Iterate for loop with num 
	*  - if the list1 size is not equal to zero
	*    add the iterate value to the list
	*  - if the list2 size is not equal to zero
	*    add the iterate value to the list
	* 
	* */


	
	@Test
	public void test1() {
		method(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));

	}

	@Test
	public void test2() {
		method(Arrays.asList(), Arrays.asList());

	}

	@Test
	public void test3() {
		method(Arrays.asList(), Arrays.asList(2));

	}

	public static void method(List<Integer> list1, List<Integer> list2) {
		
		Object[] List1 = list1.toArray();
		Object[] List2 = list2.toArray();
		int num;
		if (List1.length >= List2.length)
			num = List1.length;
		else if (List2.length <= List2.length)
			num = List2.length;
		else
			num = 0;
		List<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < (num); i++) {
			if (list1.size() != 0)
				list3.add((Integer) List1[i]);
			if (list2.size() != 0)
				list3.add((Integer) List2[i]);
		}
		System.out.println(list3);

	}
	
}
