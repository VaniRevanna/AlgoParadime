package com.practice.std.problem.Impl;


/**
 * print the fibbonaci number for the given range
 * 
 * two way to solve the problem
 * 1.Iterative approach 
 * 2. Recursive approach
 * @author i508938
 *
 */
public class FibbonnaciNumber {

	//First two number of series
		 static int prev=0,next=1;
		    static int sum=0;
	
	public static void main(String[] args)
	 {
		int numberOfElements = 10;
	  System.out.println("Printing Fibonacci series:");
	  System.out.print("Recursive Fibbonaci Number " +prev + " " +next );
	  printFibonacciSeriersRecursive(numberOfElements-2);
	  printFibonnaciNUmberIteratively(10);
	 }
	
	 public static void printFibonacciSeriersRecursive(int numberOfElements)
	 {
	  if(numberOfElements==0)
	   return;
	  else
	  {
	   sum=prev+next;
	   System.out.print(" "+sum);
	   //prepare for next 2 terms
	   prev=next;
	   next=sum;
	   printFibonacciSeriersRecursive(numberOfElements-1);
	  }
	 }
	private static void printFibonnaciNUmberIteratively(int numberOfElements) {
		 // first two number of series
		  int prev=0,next=1;
		  System.out.print("Iterative fibbaonaci Number " + prev + " " +next );
		 
		  int sum=0;
		  for(int i=2;i<numberOfElements;i++)
		  {
		   sum=prev+next;
		   System.out.print(" "+sum);
		   prev=next;
		   next=sum;
		  }
	}
	
	

}
