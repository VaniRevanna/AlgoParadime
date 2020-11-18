package com.practice.std.problem.Impl.String;

public class FindPermutation {

	public static void main(String args[]) {
		String input = "XYZ";
		permutate(input,"");
	}
	
	private static void permutate(String input,int l, int r) {
		if(input.length() == 0) {
			System.out.println(output);
		}else {
			for(int i=0;i<input.length();i++)  {
				char ch = input.charAt(0);
				String str = input.substring(0,i)+input.substring(i+1);
				permutate(str,output+ch);
			}
		}
	}
}
