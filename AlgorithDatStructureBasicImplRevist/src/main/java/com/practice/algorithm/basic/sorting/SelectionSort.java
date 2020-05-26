package com.practice.algorithm.basic.sorting;

/**
 * Selection sort
 * @author i508938
 *
 */
public class SelectionSort {
public static  void main(String args[]) {
	
}
public void sort(int[] a) {
	for(int i=0;i<a.length;i++) {
		int min = i;
		for(int j=i+1;j<a.length;j++) {
			if(less(a[j],a[min])) {
				min =j;
			}
		}
		exec(a,i,min);
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
