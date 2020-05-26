package com.practice.std.problem.Impl;

/**
 * A prime number is a number which has only two divisors 1 and itself. To check if the number is prime or not, we need to see if it has any other factors other than 1 or itself. If it has, then number is not prime else number is prime.
 * @author i508938
 *
 */
public class PrintPrimeNumberMain {

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 100 are:");
		for (int i = 1; i < 100; i++) {
			if(isPrimeNumber(i))
			{
				System.out.print(" "+i);
			}
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		   if (number <= 1) {
		       return false;
		   }
		   for (int i = 2; i <= Math.sqrt(number); i++) {
		       if (number % i == 0) {
		           return false;
		       }
		   }
		   return true;
	}
}
