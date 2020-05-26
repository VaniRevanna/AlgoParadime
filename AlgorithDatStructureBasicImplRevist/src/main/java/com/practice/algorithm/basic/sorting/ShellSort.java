package com.practice.algorithm.basic.sorting;

public class ShellSort {
	public void sort(int[] a) {
		int N = a.length;
		int h =1;
		while(h <N/3) h = h*3+1;
		while (h>=1) {
			for(int i=h;i<N;i++) {
				for(int j=i; j>=h && less(a[j],a[j-1]) ; j--) {
						exec(a,j,j-h);
				}
				
			}
		}
		
	}

	public boolean less(int value1, int value2) {
	return value1<value2;
	}
	public void exec(int[] a, int i, int min) {
	 if(a[i]>=a[min]) {
		 int temp = a[i];
		 a[i] = a[min];
		 a[min] = temp;
	}

	}
}
