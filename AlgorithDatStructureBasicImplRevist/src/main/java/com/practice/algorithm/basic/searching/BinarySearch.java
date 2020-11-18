package com.practice.algorithm.basic.searching;

public class BinarySearch {

	public static void main(String args[]) {
		int[] sortedArray={12,56,74,96,112,114,123,567};
		BinarySearch search = new BinarySearch();
		int result = search.binarySearch(sortedArray, 123);
		System.out.println("position of the gibven value in the array" + result);
	}
	/**
	 * search given sorted array using divide and conquer
	 * @param a input  array
	 * @param key integer to be searched in the array using binary search
	 * @return
	 */
	public int binarySearch(int a[], int key) {
		int low = 0;
		int high = a.length -1;
		while(low<=high) {
			int mid = low + high/2;
			if(key< a[mid]) {
				high =mid-1;
			}else if(key>a[mid]) {
				low = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	
}
