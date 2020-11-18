package com.practice.std.problem.Impl.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurences {

/**
 * Given a Sorted Array of integers containing duplicates. Find the frequency of every unique element present in the array.
Frequency is defined as the number of occurrence of any element in the array.
 * @param args
 */
public static void main(String args[]) {
		
	int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		
		Map<Integer,Integer> frequencyMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!frequencyMap.containsKey(arr[i])) {
				frequencyMap.put(arr[i], 1);
			}else {
				frequencyMap.put(arr[i], frequencyMap.get(arr[i])+1);
			}
		}
		
		frequencyMap.values().forEach(s-> System.out.println(s));
		
	}
}
