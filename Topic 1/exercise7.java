package exercise7;

import java.util.Scanner;

public class exercise7{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Total");
		double total = input.nextDouble();
		System.out.println("Enter Gratuity");
		double gratuity = (input.nextDouble() * .01) * total;
		double subtotal = total + gratuity;
		System.out.println("The total is " + total + " plus a gratuity of " + gratuity + " your final total is " + subtotal);
		
	}
}