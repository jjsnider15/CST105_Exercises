package exercise19;

import java.util.Scanner;

public class exercise19{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0 && number % 6 == 0)
			System.out.println(number + " is divisible by 5 and 6.");
		
		if (number % 5 == 0 || number % 6 == 0)
			System.out.println(number + " is divisible by 5 or 6.");
		
		if (number % 5 == 0 ^ number % 6 == 0)
			System.out.println(number + " is divisible by 5 or 6, but not by both.");
		
		
		
	}
}