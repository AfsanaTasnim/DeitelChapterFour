package practice;

import java.util.Scanner;

public class LargestNumber {
	
	private int counter;
	private int number;
	private int largest;
	
	public LargestNumber(int c, int n, int l) {
		counter = c;
		number = n;
		largest = l;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int c) {
		counter = c;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int n) {
		number = n;
	}
	
	public int getLargest() {
		return largest;
	}
	
	public void setLargest(int l) {
		largest = l;
	}
	
	public void ActualResult() {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < counter; i++) {
			System.out.print("Enter the number: ");
			int number = input.nextInt();
			if(number > largest) {
				largest = number;
			}
		}
		
		System.out.println("The largest number is: " + largest + ".");
	}
}
