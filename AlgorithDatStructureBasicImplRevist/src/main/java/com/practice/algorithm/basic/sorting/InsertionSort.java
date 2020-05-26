package com.practice.algorithm.basic.sorting;

public class InsertionSort {
	public void sort(int[] a) {
		int N = a.length;
		for(int i=0;i<N;i++) {
			for(int j=i; j>0;j--) {
				if(less(a[j],a[j-1])) {
					exec(a,j,j-1);
				}else 
					break;
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
