package practice;

import java.util.Scanner;

public class SalesComissionCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double fixed = 200.00;
		
		double itemOne = 239.99;
		double itemTwo = 129.75;
		double itemThree = 99.95;
		double itemFour = 350.89;
		
		System.out.print("How many salespersons' earnings do you want to calculate?: ");
		int howmany = input.nextInt();
		
		for(int i = 0; i < howmany; i++) {
			System.out.print("How many of item one has she/he sold last week?: ");
			int numOne = input.nextInt();
			System.out.print("How many of item two has she/he sold last week?: ");
			int numTwo = input.nextInt();
			System.out.print("How many of item three has she/he sold last week?: ");
			int numThree = input.nextInt();
			System.out.print("How many of item four has she/he sold last week?: ");
			int numFour = input.nextInt();
			
			double total;
			total = (numOne * itemOne) + (numTwo * itemTwo) + (numThree * itemThree) + (numFour * itemFour);
			double per = 0.09 * total;
			double result = fixed + per;
			
			System.out.println("Her/his earning for last week is: " + result);
		}
		
		
		
		
		
		

	}

}
