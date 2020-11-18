package com.practice.std.problem.Impl.arrays;

public class PrintPrimeNumbersFrom1To100 {

	
	public static void main(String args[]) {
		
		for(int i=1;i<100;i++) {
			if(isprimeNumber(i)) {
				System.out.println(i);
			}
			
		}
		
	}
	
	public static boolean isprimeNumber(int number) {
		if(number<1) {
			return false;
		}else if(number ==1 || number ==2) {
			return true;
		}else {
			for(int i=2;i<Math.sqrt(number);i++) {
				if(number % i == 0) {
					return false;
						
				}
			}
			return true;
		}
		
		
	}
}
