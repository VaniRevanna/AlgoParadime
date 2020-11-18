package com.practice.std.problem.Impl.arrays;


/**
 * Given an Array of integers and an Integer k, Find the maximum element of from all the contiguous subarrays of size K.s
 * @author i508938
 *
 */
public class SlidingWindowMax {

	
public static void main(String args[]) {
		
		int a[] = {1, 5, 2, 1, 0, 2, 0};
		int n= a.length;
		int k = 3;
		
		for(int i=k;i<n;i++) {
			int max = Integer.MIN_VALUE;
			for(int j = i-k;j<i;j++) {
				max = Math.max(max, a[j]);
			}
			System.out.println("Max Value" + max);
		}
		
		
		
	}
}
