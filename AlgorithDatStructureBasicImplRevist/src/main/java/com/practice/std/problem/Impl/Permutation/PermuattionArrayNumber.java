package com.practice.std.problem.Impl.Permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuattionArrayNumber {
	public List<List<Integer>> stringPermutation = new ArrayList<List<Integer>>();
	

	public boolean isPresent(List<Integer> intArray,List<List<Integer>> finalArray) {
	
		for( List<Integer> s : finalArray) {
			if(s.equals(intArray)) {
				return true;
			}
		}
		
		return  false;
		
	}
	public void genratePermutation(List<Integer> intArray, int l, int r,Set<List<Integer>> finalArray ) {
	
		
		if(l==r-1) {
			
			//if(!isPresent(intArray,finalArray)) {
				finalArray.add(new ArrayList<Integer>(intArray));
			//}
		}else {
			for(int i=l;i<r;i++) {
				intArray = swap(intArray, l, i);
				 genratePermutation(intArray,l+1,r,finalArray);
				 intArray = swap(intArray, l, i);
				
			}
		}
	}


	private List<Integer> swap(List<Integer> intArray, int l, int r) {
		
		
		Integer temp = intArray.get(l);
		intArray.set(l, intArray.get(r)) ;
		intArray.set(r, temp) ;
		
		return intArray;
		
	
	}
	
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(12);
		integers.add(22);
		integers.add(31);
		integers.add(1);
		//print input array
		System.out.println("Input array");
		integers.forEach(s-> System.out.println(s));
		System.out.println("end");
		Set<List<Integer>> finalArray = new HashSet<List<Integer>>();
		PermuattionArrayNumber permuatation = new PermuattionArrayNumber();
		int n = integers.size();
		//finalArray.add(integers);
		permuatation.genratePermutation(integers, 0, n,finalArray);
		System.out.println(finalArray.size());
		//print permuatation array
		finalArray.forEach(s->{
			System.out.println("\n");
			s.forEach(k->System.out.println(k));
		});
		
	}
	
	
}
