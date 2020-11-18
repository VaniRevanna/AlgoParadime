package com.practice.std.problem.Impl.arrays;

/**
 * Check if it is possible to reach end of given Array by Jumping	
 * @author i508938
 *
 */
public class ReachEnd {
	
	public static void main(String args[]) {
		
		int a[] = {1, 5, 2, 1, 0, 2, 0};
		
		
		System.out.println("isReachable : " + solve(0,a));
		
		
		
	}
	public static boolean solve(int cp, int a[]) {
		
		boolean isReachable = false;
		if(cp == a.length -1) {
			return   true;
		 } 
		
		if(a[cp] == 0) {
			 isReachable =  false;
		 } else {
		
		
			 cp = a[cp]+cp;
			 isReachable =  solve(cp,a);
		 }

		 return isReachable;
		 
	}

}
