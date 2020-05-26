package com.practice.algorithm.basic.quickFind;

/**
 * lazy algorithm uses tree structure
 * complexity is N
 * N array access
 * trees are flat, but too expensive to keep them flat
 * tree can get tall
 * 
 * find is too expensive 
 * @author i508938
 *
 */
public class QuickUnion {
	private int[] id;
	
	public QuickUnion(int n) {
		id = new int[n];
		// add sequence number of n to array
		for(int i=0; i<n; i++) {
			id[i] = i;
		}
	}
	
	public  int root(int i) {
		while(i!=id[i]) {
			i =id[i];
			
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	public void union(int p, int q) {
		int i= root(p);
		int j = root(q);
		id[i] = j;
	}

}
