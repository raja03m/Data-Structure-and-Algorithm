package leetCode_DSA_Problems;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class UncommonWordFromTwoSentence {

	
	/*
	 * Input type - String s1 and String s2
	 * Output type - String array
	 * 
	 * Two sample input
	 * input 1 - "this apple is sweet", "this apple is sour"
	 * input 2 - ""gw gw pk xy", "gw aje zqd"
	 * 
	 * Pseudo code
	 * i) Combining both the string and
	 *     change it to lower case and 
	 *     split with space and store it in string array "t"
	 * ii) Create two empty Set string - result and exists
	 * iii) Iterate for each loop "t"
	 * 	if(exists.contains(s)){
	            result.remove(s);
	        }else{
	            result.add(s);
	            exists.add(s);
	        }
	    }
	     return result.toArray(new String[0]);
	 * 
	 * 
	 * 
	 */

	
	@Test
	public void test1() {
		System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));
	}

	@Test
	public void test2() {
		System.out.println(uncommonFromSentences("gw gw pk xy", "gw aje zqd"));
	}

	public String[] uncommonFromSentences(String s1, String s2) {		
		String [] t=(s1+" "+s2).toLowerCase().split(" ");
	    Set<String> result =new HashSet<>();
	    Set<String> exists =new HashSet<>();
	    for(String s : t){
	        if(exists.contains(s)){
	            result.remove(s);
	        }else{
	            result.add(s);
	            exists.add(s);
	        }
	    }
	     return result.toArray(new String[0]);
	}
}
//String s3= s1+" "+s2;
//String[] z = s3.split(" ");        
//Arrays.sort(z);
//
//int i=0;
//List<String> q = new ArrayList<>();
//for(i=0;i<z.length;i=i+2) {
//	if(i==z.length-1) {
//		q.add(z[i]);
//		break;
//	}
//    for(int j=i+1;j<z.length;j++) {
//    	if(z[i].equals(z[j]))
//    		break;
//    	else if(z[i]!=z[j]){
//    		q.add(z[i]);
//    		q.add(z[j]);
//    		break;
//    	}
//    }
//}
//return z;
//}
//}

//Map<String, Integer> count = new HashMap<>();
//
//// Count word frequencies
//for (String word : (s1 + " " + s2).split(" ")) {
//	count.put(word, count.getOrDefault(word, 0) + 1);
//}
//
//// Filter uncommon words
//List<String> uncommon = new ArrayList<>();
//for (Map.Entry<String, Integer> entry : count.entrySet()) {
//	if (entry.getValue() == 1) {
//		uncommon.add(entry.getKey());
//	}
//}
//
//// Return uncommon words as array
//return uncommon.toArray(new String[0]);
//}
//}
