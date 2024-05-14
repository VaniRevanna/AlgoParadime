package com.practice.dimentional.array;

/**
 * find maximum some path in a matrix
 * @author i508938
 *
 */
public class MaxSumPath {

	 public static void main (String[] args) 
	    { 
		 int mat[][] = {{5, 9, 6},
		           {11, 5, 2}};
		 int n = 2;
		 int m = 3;
	        //int res = findMaxSumPath(mat,n,m);
			int res = maxPathSum(mat,n,m);
			System.out.println("Maximum sum of hour glass = " + res);
	    }
		
	 

	 public int maxPathSum(int[][] grid) {
		 int[][] resultGrid = new int[grid.length][grid[0].length];
		 resultGrid[0][0] = grid[0][0];
		 for(int i = 0; i < grid.length; i++) {
			 for(int j = 0; j < grid[0].length; j++) {
				 if(i == 0 && j == 0) continue;
				 int right = Integer.MIN_VALUE;
				 if(j-1 >= 0) {
					 right = resultGrid[i][j-1] + grid[i][j];
				 }

				 int down = Integer.MIN_VALUE;
				 if(i-1 >= 0) {
					 down = resultGrid[i-1][j] + grid[i][j];
				 }
				 resultGrid[i][j] = Math.max(right, down);
			 }
		 }
		 return resultGrid[resultGrid.length - 1][resultGrid[0].length - 1];
	 }
}
