package exercise_4_23;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise_4_23{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Emloyee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter Hourly pay rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter Federal tax withholding: ");
		double federal = input.nextDouble();
		System.out.print("Enter State tax withholding: ");
		double state = input.nextDouble();
		
		double grossPay = hours * rate;
		
		double fedWith = grossPay * federal;
		
		double stateWith = grossPay * state;
		
		double total = fedWith + stateWith;
		
		double net = grossPay - total;
		
		System.out.print("Empoyee name: " + name +
				"\n Hours Worked: " + hours + 
				"\n Pay Rate: " + formatCurrency(rate) +
				"\n Deductions: " + 			
				"\n Federal tax withholding (" + formatPercent(federal) +") : " + formatCurrency(fedWith) +
				"\n State tax withholding (" +formatPercent(state) + ") : " + formatCurrency(stateWith) + 
				"\n Total Deduction: " + formatCurrency(total) +
				"\n Net Pay: " + formatCurrency(net));
	}

	public static String formatCurrency(double money) {
		return DecimalFormat.getCurrencyInstance().format(money);
	}
	public static String formatPercent(double percent) {
		return DecimalFormat.getPercentInstance().format(percent);
	}
}