package com.practice.algorithm.basic.quickFind;

/** quick find eager search algorithm
 * its quadartic algorith, complexity is N2
 * it does not scale
 * 
 * @author i508938
 *
 */
public class QuickFind {

	private int[] qf;
	
	public QuickFind(int n) {
		qf = new int[n];
		for(int i=0; i<n; i++) {
			qf[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return qf[p] == qf[q];
	}
	
	public void union(int p, int q) {
		int pid = qf[p];
		int qid = qf[q];
		for(int i=0; i<qf.length; i++) {
			if(qf[i] ==pid) 
				qf[i] = qid;
		}
	}
}
