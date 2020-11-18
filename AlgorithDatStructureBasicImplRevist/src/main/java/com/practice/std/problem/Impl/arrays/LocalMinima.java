package com.practice.std.problem.Impl.arrays;

public class LocalMinima {

	
	public static void main(String args[]) {
		int a[] = {10, 5, 3, 6, 13, 16, 7};
		int n = a.length;
		int minima = a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<minima) {
				minima = a[i];
			}
		}
		
		System.out.println("Mininma Value" + minima);
		
		
	}
}
