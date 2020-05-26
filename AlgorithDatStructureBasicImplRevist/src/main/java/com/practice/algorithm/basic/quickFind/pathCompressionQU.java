package com.practice.algorithm.basic.quickFind;

public class pathCompressionQU {
	private int[] id;
	private int[] sz;
		
		public pathCompressionQU(int n) {
			id = new int[n];
			sz = new int[n];
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
			if(sz[i]<sz[j]) {
				id[i] = j;
				sz[j] +=sz[i];
			}else {
				id[j] = i;
				sz[i] +=sz[j];
			}
		}
}
