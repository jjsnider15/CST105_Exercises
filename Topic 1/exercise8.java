package exercise8;

import java.util.Scanner;

public class exercise8{
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Annual Interest Rate");
		double rate = input.nextDouble();
		System.out.println("Enter current balance");
		double balance = input.nextDouble();
		double interest = balance * (rate/1200);
		System.out.println("The Interest for next month is " + interest);
	}
}