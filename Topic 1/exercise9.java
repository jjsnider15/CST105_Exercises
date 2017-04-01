package exercise9;

import java.util.Scanner;

public class exercise9{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total miles driven");
		double distance = input.nextDouble();
		System.out.println("Enter the Miles Per Gallon (MPG)");
		double miles = input.nextDouble();
		System.out.println("Enter the price of gas");
		double gas = input.nextDouble();
		double cost = (distance/miles) * gas;
		System.out.println("The total trip cost " + cost);
	}
}