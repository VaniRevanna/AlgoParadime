package com.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * https://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html
 * @author i508938
 *
 */
public class DuplicatesInArray {

	public static boolean checkDuplicateMapCount(int[] input) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int counter=0;
        for (int val : input) {
            if(hashMap.containes(val)) {
                counter = hashMap.get(val)+1;
            }else {
                counter=1;
            }

            map.put(val,counter);
        }
        return false;
    }
	public static void main(String args[])  {
	int[] withDuplicates = new int[] {1,1,1,2,2,3};
	System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));

	
	}


}
