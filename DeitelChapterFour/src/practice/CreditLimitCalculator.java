package practice;

import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many customers are there?: ");
		int customer = input.nextInt();
		
		for(int i = 0; i < customer; i++) {
			System.out.print("Enter account number: ");
			int account = input.nextInt();
			System.out.print("Enter balance at the beginning of the month: ");
			int balance = input.nextInt();
			System.out.print("Enter total of all items charged by the customer this month: ");
			int charge = input.nextInt();
			System.out.print("Enter total of all credits applied to the customer's account this month: ");
			int credit = input.nextInt();
			System.out.print("Enter allowed credit limit: ");
			int limit = input.nextInt();
			
			int newbalance = 0;
			newbalance = balance + charge - credit;
			
			System.out.println("The new balance is: " + newbalance);
			if(newbalance > limit) {
				System.out.println("Credit limit exceeded.");
			}
		}
		
		
		
		
	}

}
