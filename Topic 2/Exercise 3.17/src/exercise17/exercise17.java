package exercise17;

import java.util.Scanner;
import java.util.Random;

public class exercise17{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String personPlay;
		String computerPlay = null;
		int computerInt;
		
		String response;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Rock (1), Paper (2), or Scissors (0)?");
		
		computerInt = generator.nextInt(3);
		
		if (computerInt == 1)
			computerPlay = "Rock";
		else if (computerInt == 2)
			computerPlay = "Paper";
		else if (computerInt == 0)
			computerPlay = "Scissors";
		
		System.out.print(" Enter your play: ");
		personPlay = scan.next();
		
		System.out.print("Computer play is: " + computerPlay);
		
		if (personPlay == computerPlay){
			System.out.print("It is a tie!");
}
		else if (personPlay.equals(1))
		    if (computerPlay.equals(0))
	            System.out.print("Rock crushes Scissors. You Win!");
			else if (computerPlay.equals(2))
				System.out.print("Paper covers Rock. You Lose!");
		 
		 else if (personPlay.equals(2))
			 if (computerPlay.equals(0))
				 System.out.print("Scissors cuts Paper. You Lose!");
			 else if (computerPlay.equals(1))
				 System.out.print("Paper Covers Rock. You Win!");
				
		 else if (personPlay.equals (0))
			 if (computerPlay.equals(1))
				 System.out.print("Rock crushes Scissors. You Lose!");
			 else if (computerPlay.equals(2))
	   	         System.out.print("Scissors cut Paper. You Win!");
								
	}
	
}