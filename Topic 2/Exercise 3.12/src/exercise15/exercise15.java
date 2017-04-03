package exercise15;

import java.util.Scanner;

public class exercise15{
	
	private static Scanner input;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		
		System.out.println("Enter a three digit number: ");
		int user = input.nextInt();
		
		int temp_remaining = 0;
		
		int d1 = user % 10;
		temp_remaining = user / 10;
		int d2 = temp_remaining % 10;
		int d3 = user / 10;
		
		String rev = Integer.toString(d1) + Integer.toString(d2) + Integer.toString(d3);
		String original = Integer.toString(user);
		
		if(rev.equals(original)){
			System.out.println(original + " is a palindrone.");
		}
		
		else {
			System.out.println(original + " is not a palindrone.");
		}
		
	}

	private static String original(Scanner input2) {
		// TODO Auto-generated method stub
		return null;
	}
}