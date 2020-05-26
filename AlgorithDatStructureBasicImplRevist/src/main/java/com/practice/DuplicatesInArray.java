package com.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * https://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html
 * @author i508938
 *
 */
public class DuplicatesInArray {

	public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
	public static void main(String args[])  {
	String[] withDuplicates = new String[] {"one","two","three","one"};
	System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));

	
	}


}
