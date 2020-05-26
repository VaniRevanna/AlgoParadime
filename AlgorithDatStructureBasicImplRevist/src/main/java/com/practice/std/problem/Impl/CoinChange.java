package com.practice.std.problem.Impl;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		int[] currencies = new int[scn.nextInt()];
 
		for (int i = 0; i < currencies.length; i++) {
			currencies[i] = scn.nextInt();
		}
 
		int amount = scn.nextInt();
 
		coinchangeDP(amount, currencies);
		
	}
 
	
 
	public static void coinchangeDP(int amount, int[] currencies) {
		/*
		 * dp array will contain the number of ways 'i'
		 * amount can be paid using the given currencies,
		 * therefore, we made dp of size amount+1 to have
		 * an index = amount.
		 */
		int[] dp = new int[amount + 1];
		ArrayList<String>[] payments = new ArrayList[amount+1];
		for(int i=0;i<payments.length; i++)
		{
			payments[i] = new ArrayList<>();
		}
 
		/*
		 * positive basecase, when we have remaining amount = 0, 
		 * this means that we have found one way of paying the 
		 * initial amount.
		 */
		dp[0] = 1;
 
		for (int currency : currencies) {
		for (int amt = 1; amt < dp.length; amt++) {
		if(amt-currency >=0 && dp[amt - currency] != 0)
		{
		dp[amt] +=1;
	        /*  we have made an array of arraylist of strings to
		 * store all the ways of paying the current amount,
	         *  therefore, the payments of current amount = 
		 *  payments of (amt - currency) concatenated 
		 *  with the current currency*/
		payments[amt].add(payments[amt-currency].size()>0? 
      (payments[amt-currency].get(payments[amt-currency].size()-1) + currency + " ") 
       : Integer.toString(currency) + " ");
				}
			}
		}
		
		/*number of ways of paying given amount = dp[amount]*/
		System.out.println(dp[amount] + "\n" + payments[amount]);
 
	}
}
