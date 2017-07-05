package practice;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter the employee's name: ");
			String s = input.next();
			
			System.out.print("Enter the number of hours worked: ");
			double h = input.nextDouble();
			
			System.out.print("Enter the hourly rate of the person: ");
			double r = input.nextDouble();
			
			if(h <= 40.00) {
				System.out.print("His gross pay is: " + (h * r));
			} else {
				double first = 40.00 * r;
				double last = (h - 40.00) * (1.50 * r);
				double result = first + last;
				System.out.println("The gross pay is: " + result);
			}
			System.out.println();
		}
		
		
		
		
	}

}
