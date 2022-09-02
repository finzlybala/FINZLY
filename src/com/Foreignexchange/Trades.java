package com.Foreignexchange;
import java.util.Scanner;
public class Trades {
	static int count = 0;

	public static void main(String[] args) {
		Operations.operationlist();
	}

	@SuppressWarnings("resource")
	// Booking the trade
	public static void booktrading() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the CustomerName ");
		String customerName = s.nextLine();
		if (customerName.matches("^[a-zA-Z\\s]*$")) {
		System.out.println("Enter the CurrencyPair \n Only USD to INR is Accepted");//*CurrencyPair of USD to INR is Accepted  *
		
		String currencyPair = s.next();
		String pair = "USDINR";

		if (pair.equalsIgnoreCase(currencyPair)) {
			
			System.out.println("Enter the Amount to Transfer");
			double amount = s.nextDouble();
			System.out.println("Do u want to get Rate (YES/NO)");
			String rates = s.next();
			
			final double rateOfUSD = 66.00;
			double INR = rateOfUSD * amount;
			if ("yes".equalsIgnoreCase(rates)) {
				System.out.println("You are transferring INR  " + INR + " to " + customerName + "\n");
			} else if("no".equalsIgnoreCase(rates)){
				System.out.println("Warning : Are you sure to continue without knowing the rate...!");
				String warning = s.next();
				String Statement = (warning.equalsIgnoreCase("no"))? "You are transferring INR   " + INR + " to " + customerName: "";
				System.out.println(Statement);}
			else {
				System.out.println("Enter valid Option...\n");
				Operations.operationlist();}

			System.out.println("BOOK - To Book the Trade \n Warrnig :Other inputs will cancel the Trade");
			String bookOrcancel = s.next();
			if(bookOrcancel.equalsIgnoreCase("Book")) 
			{
				System.out.println("Trade for " + pair + " has been booked with  rate  " + 66.00 + ", The amount of Rs." + INR+ " will be Transferred in 2 working days to " + customerName + "\n");
				count++;
				Print.addtrading(count, currencyPair, customerName, amount, INR);
			}
			else{ 
				System.out.println(" Trade is canceled...!" + "" + "\n");
			}
		}
	} else {
			System.out.println(" Entering Invalid Input ,Appropriate error message.....!\t Enter Valid Input..");}
		Operations.operationlist();
	}

	@SuppressWarnings("resource")
	// Exiting from the code
	public static void exit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you really want to exit (y/n)");
		String yn = s.next();

		if (yn.equalsIgnoreCase("y")) {
			System.out.println("Bye - have a good day ");
		} else if (yn.equalsIgnoreCase("n")) {
			System.out.println("");
			Operations.operationlist();
		} else {
			System.out.println("Invalid data...!");
			exit();
		}
	}
}
