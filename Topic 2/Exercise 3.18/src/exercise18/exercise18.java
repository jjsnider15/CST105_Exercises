package exercise18;

import java.util.Scanner;

public class exercise18 {
	
	public static void main(String[] args){
	int weight = 30;
	System.out.println("Enter the weight of the package: ");
	Scanner input = new Scanner (System.in);
	int status = input.nextInt();
	
	if (weight < 3.5) {
		System.out.println("Shipping costs $1");
	}
	else if (weight < 5.5){
		System.out.println("Shipping costs $3");
	}
	else if (weight < 8.5 ){
		System.out.println("Shipping costs $10");
	}
	else if (weight < 10.5){
		System.out.println("Shipping costs $20");
	}
	else if (weight < 50)
		System.out.println("This package cannot be shipped");
	}
}