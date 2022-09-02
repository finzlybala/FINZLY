package com.Foreignexchange;

import java.util.ArrayList;

public class Print {
	
		// Storing the booked trade data in arraylist and method for printing it
		static ArrayList <Variables> bh=new ArrayList<>();
		static void addtrading(int tradeNo, String currencyPair, String customerName, double amount, double rate) 
		{
			bh.add(new Variables(tradeNo++,currencyPair, customerName, amount,  rate));
		
		}
		static void printtrading() {
			System.out.println( "tradeNo\t" + "currencyPair\t "+ "customerName\t" + " amount\t    " + " rate\t");
			if(bh.isEmpty()) 
			{
				System.out.println("NO transation is done yet...!\n");
			}
		for(Variables obj : bh) 
		{
			System.out.println(obj);
		}
		Operations.operationlist();
	}
}
