package exercise_6_7;

import java.util.Scanner;

public class exercise_6_7{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final int  numberOfYears = 30;
		
		System.out.print("The amount invested: ");
		int amount = input.nextInt();
		System.out.print("The annual interst rate: ");
		int rate = input.nextInt();
		
		int monthlyRate = rate / 1200;
		System.out.println("Years     Future Value");
		for (int years = 1; years <= numberOfYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyRate, years));
			}
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}