package practice;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		int miles = 0;
		int gallons = 0;
		int totalmiles = 0;
		int totalgallons = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of trips: ");
		
		int p = input.nextInt();
		
		for(int i = 0; i < p; i++) {
		
			System.out.print("Enter the number of miles driven: ");
			miles = input.nextInt();
			System.out.print("Enter the number of galons used: ");
			gallons = input.nextInt();
		
			float result = miles / gallons;
		
			System.out.println("The amount of miles per gallon is: " + result);
			
			totalmiles = totalmiles + miles;
			totalgallons = totalgallons + gallons;
		
		}
		
		double totalresult = totalmiles / totalgallons;
		System.out.println();
		System.out.println("The combined miles per gallon obtained for all trips upto this point is: " + totalresult);
		

	}

}
