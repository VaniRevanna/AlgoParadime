package com.practice.algorithm.basic.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Devide and conquer algorith
 * Best/Worst/Average case complexity is O(nlogn)
 * @author i508938
 *
 */
public class MergeSort {
	static  int  arr[]={100,20,15,30,5,75,40};
	 
	
	// Recursive algorithm for merge sort
		public static void mergeSort(int start,int end)
		{
			int mid=(start+end)/2;
			if(start<end)
			{
				// Sort left half
				mergeSort(start,mid);
				// Sort right half
				mergeSort(mid+1,end);
				// Merge left and right half
				merge(start,mid,end);
			}
	 
		}
		
		 public static List<String> mostFrequent(String helpText, List<String> wordsToExclude) {
			    
			    String inputText = helpText.toLowerCase();
			int count;
			    String[] words = inputText.split(" ");
                int tempCount = 1;
			    List<String> result = new ArrayList<String>();
			 //  TreeMap<String,Integer> map  = new TreeMap<String,Integer>();
			    for(int i=0;i<words.length;i++) {
			       count=1;
			        if(wordsToExclude.contains(words[i])) {
			            continue;
			        }else {
			      for(int j= i+1 ;j<words.length;j++) {
			          if(words[i].equals(words[j])) {
			              count ++;
			              //avoiding duplicate
			              words[j] = "0";
			          }
			      }

			    }
			    if(count>1&& words[i]!="0") {
			   //    map.put(words[i], count);
			    	if(tempCount < count) {
			    		tempCount = count;
			    		result = new ArrayList<String>();
			    		result.add(words[i]);
			    	}else if(tempCount == count) {
			    		result.add(words[i]);
			    	}
			    }
			    }
			   
			   Collections.sort(result);
			    
		 return result;
		 }
		
		private static void merge(int start, int mid, int end) {
			// Initializing temp array and index
			int[] tempArray=new int[arr.length];
			int tempArrayIndex=start;
			System.out.print("Before Merging:  ");
			printArray(arr,start,end);
			int startIndex = start;
			int midIndex = mid +1;
			
			// It will iterate until smaller list reaches to the end
			while(startIndex<=mid && midIndex<=end)
			{
				if(arr[startIndex]< arr[midIndex])
				{
					tempArray[tempArrayIndex++]=arr[startIndex++];
				}
				else
				{
					tempArray[tempArrayIndex++]=arr[midIndex++];
				}
			}
			
			
			// Copy remaining elements
			while(startIndex<=mid)
			{
				tempArray[tempArrayIndex++]=arr[startIndex++];
			}
			while(midIndex<=end)
			{
				tempArray[tempArrayIndex++]=arr[midIndex++];
			}
			
			
			// Copy tempArray to actual array after sorting 
			for (int i = start; i <=end; i++) {
				arr[i]=tempArray[i];
			}
	 
			System.out.print("After merging:   ");
			printArray(tempArray,start,end);
			System.out.println();
			
			
		}
	public static void main(String args[])
	{
		//List<String> wordsToExclude = new ArrayList<>();
	//wordsToExclude.add("help");
	//wordsToExclude.add("and");
	//	fizzBuzz(15);
	//	mostFrequent("Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.",wordsToExclude);
		// Print array before merge sort
		System.out.println("Array before sorting:");
		printArray(arr,0,arr.length-1);
		System.out.println("-----------------------------");
 
		mergeSort(0,arr.length-1);
 
		System.out.println("-----------------------------");
 
		// Print array after sorting
		System.out.println("Array After sorting:");
		printArray(arr,0,arr.length-1);
 
 
	}
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	   
	  
}
