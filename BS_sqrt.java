package leetCode_DSA_Problems;

import org.testng.annotations.Test;

public class BS_sqrt {
	
	@Test
	public void test1() {
		System.out.println(mySqrt(4));
	}
	public int mySqrt(int x) {
	     if(x==0){
				
	            return 0;
	        
			}
			int high = x, low = 1;  
			
			while(low <= high) {
				
				int mid = (low+high)/2;  
				
				//if(mid*mid == x)
				
				if(mid == (x/mid)) {  
					return mid;
				}
				else if (mid > (x/mid) ) {   
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			
			return high;
		}
	}