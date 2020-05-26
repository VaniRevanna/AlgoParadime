package com.practice.dimentional.array;

/**
 * Calculate the Maximum sum value of Hour glass in an 2D array of equal row and column lenght
 * @author i508938
 *
 */
public class HourGlassSumOd2DArray {

	 public static void main (String[] args) 
    { 
        int [][]mat = {{1, 1, 1, 0, 0}, 
                       {0, 1, 0, 0, 0}, 
                       {1, 1, 1, 0, 0}, 
                       {0, 0, 0, 0, 0}, 
                       {1, 1, 0, 0, 0}}; 
        int res = findMaxHourGlass(mat); 
            System.out.println("Maximum sum of hour glass = " + res); 
    }
	
	 /**
	  * calculate the highest hour glass
	  * @param arr
	  * @return
	  */
	 private static int findMaxHourGlass(int[][] arr) {
		
		int result = Integer.MIN_VALUE;
		int size = arr.length;
		for(int i=0;i<size-2;i++) {
			
			for(int j=0;j<size-2;j++) {
				int sum = arr[i][j] + arr[i][j+1]+ arr[i][j+2] +
						arr[i+1][j+1] +
						arr[i+2][j] + arr[i+2][j]+ arr[i+2][j+2];
				System.out.println("Sum"+sum);
				result = Math.max(sum, result);
			}
		}
		
		return result;
		 
	 }
	
}
