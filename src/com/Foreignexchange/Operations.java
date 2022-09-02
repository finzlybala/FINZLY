package com.Foreignexchange;

import java.util.Scanner;

public class Operations {
	@SuppressWarnings("resource")
	public static void operationlist(){
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println(" Book Trades -1:");
	
	System.out.println(" Print Trades -2:");
	
	System.out.println(" Exit -3:");
try {	
	int opt = scan.nextInt();
	
	switch(opt) {
		case 1:
			Trades.booktrading();
			break;
			
		case 2:
			Print.printtrading();
			break;
		case 3:
			Trades.exit();
			break;
		default :
			System.out.println("Invalid option... Enter the valided option ...!\n");
			Operations.operationlist();
			break;
		}
}
catch(Exception e) {
	System.out.println("Invalid option... 1 or 2 or 3 ...!\n");
	Operations.operationlist();}

	}
}
	
	
