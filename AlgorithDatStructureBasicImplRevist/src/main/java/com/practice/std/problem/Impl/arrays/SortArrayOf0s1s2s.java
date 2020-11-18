package com.practice.std.problem.Impl.arrays;

/**
 * 
 * @author i508938
 *
 */
public class SortArrayOf0s1s2s {

	public static void sort(int a[]) {
		//int a[] = {1, 2, 2, 0, 0, 1, 2, 2, 1};
		
		int low =0; int mid =0; int high = a.length-1;
		
		while(mid <= high) {
			
			if(a[mid] == 0) {
				a[low] = swap(a[mid],a[mid]=a[low]);
				low++;
				mid++;
			}else if(a[mid] == 2) {
				a[high] = swap(a[mid],a[mid]=a[high]);
				high --;
				
			}else  {
				mid++;
			}
		}
				
	}
public static void main(String[] args) {
		
		int[]a = {2,2,2,0,0,1,2,2,0};
		sort(a);
		for(int val : a)
		{
			System.out.print(val + " ");
		}
 
	}
	
	/* utility swap function*/
	public static int swap(int i, int j)
	{
		return i;
	}
}
