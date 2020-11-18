package com.practice;

import java.util.HashMap;

public class FibonaciSeries {

	/**
	 * Recursion 
	 * @param n
	 * @return
	 */
	public static int getFibonacciNumberRecursively(int n) {
	    if(n == 0) return 0;
	    if(n == 1) return 1;
	    return getFibonacciNumberRecursively(n - 1) + getFibonacciNumberRecursively(n - 2);
	  }
	// initialize map for memoization
	  public static HashMap<Integer, Integer> memoaization = new HashMap<Integer, Integer>();
	  
	  //top down approach to fibonacci series
	  public static int getFibonacciNumberTopDown(int n) {
	    if(memoaization.containsKey(n)) return memoaization.get(n);
	    if(n == 0) return 0;
	    if(n == 1) return 1;
	    int nthValue = getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
	    memoaization.put(n, nthValue);
	    return nthValue;
	  }
	  public static int getFibonacciNumberBottomUpWithCache(int n) {
	    memoaization.put(0, 0);
	    memoaization.put(1, 1);
	    for(int i = 2; i <= n; i++) {
	      memoaization.put(i, memoaization.get(i - 1) + memoaization.get(i - 2));
	    }
	    return memoaization.get(n);
	  }
	  
	  /**
	   * without meoization,bottom up approach to solve fibbonacci series problem
	   * @param n
	   * @return
	   */
	  public static int getFibonacciNumberBottomUpWithoutCache(int n) {
	    int fnMin2 = 0;
	    int fnMin1 = 1;
	    int sum = 0;
	    for(int i = 2; i <= n; i++) {
	      sum = fnMin1 + fnMin2;
	      fnMin2 = fnMin1;
	      fnMin1 = sum;
	    }
	    return sum;
	  }
	  public static void main(String [] args) {
	   System.out.println("recursive result: " +getFibonacciNumberRecursively(8)); // 21
	    getFibonacciNumberTopDown(8); // 21
	    getFibonacciNumberBottomUpWithCache(8); // 21
	    getFibonacciNumberBottomUpWithoutCache(8); // 21
	  } 
}
