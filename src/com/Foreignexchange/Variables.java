package com.Foreignexchange;
// pojo class for collecting the information
public class Variables {
private int tradeNo;
private String currencyPair="";
private String customerName ="";
private double amount;
private double  rate;



public Variables(int tradeNo, String currencyPair, String customerName, double amount, double rate) {
	
	super();
	this.tradeNo = tradeNo;
	this.currencyPair = currencyPair;
	this.customerName = customerName;
	this.amount = amount;
	this. rate = rate;
}
@Override
public String toString() {
	return "   "+ tradeNo + "       "+currencyPair +"     " + customerName +"      INR "+     rate +"   "+ "  "+  66.00  ;

	}
}
