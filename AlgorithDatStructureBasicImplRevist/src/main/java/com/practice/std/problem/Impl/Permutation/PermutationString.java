package com.practice.std.problem.Impl.Permutation;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {

	
	private Set<String> stringPermutation = new HashSet<String>();
	

	public void genratePermutation(String str, int l, int r) {
		
		if(l==r) {
			
			stringPermutation.add(str);
		}else {
			for(int i=l;i<=r;i++) {
				 str = swap(str, l, i);
				 genratePermutation(str,l+1,r);
				
			}
		}
	}


	private String swap(String str, int l, int r) {
		
		char[] charArray = str.toCharArray();
		char temp = charArray[l];
		charArray[l] = charArray[r];
		charArray[r] = temp;
		return String.valueOf(charArray);
		
		
	}
	
	public static void main(String args[]) {
		String str = "ABC";
		PermutationString permuatation = new PermutationString();
		permuatation.genratePermutation(str, 0, str.length()-1);
		//print permuatation array
		permuatation.stringPermutation.forEach(s-> System.out.println(s));
		
	}
}
