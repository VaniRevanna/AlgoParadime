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
	
	
	//Insertion sort details
	//1)Before Sorting , find minimal value '-30'  [40, 10, -30, 45, 39, 32]swap it to first entry Before Sorting : [-30, 10, 40, 45, 39, 32]
	//2) find next minimal value amd swap to second place and so on 10 is in second place no swap [-30, 10, 40, 45, 39, 32]
	//3)[-30, 10, 32, 45, 39, 40]
	//4) [-30, 10, 32, 39, 45, 40]
	//5)  [-30, 10, 32, 39, 40, 45]
}
