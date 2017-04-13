package exercise_6_5;

import java.util.Scanner;

public class exercise_6_5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		displaySortedNumbers(num1, num2, num3);
	}	


public static void displaySortedNumbers( double num1, double num2, double num3) {
	if ((num1 < num2) && (num2 < num3)){
	    System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
	    }
	if ((num1 < num2) && (num2 > num3)){
	    System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2);
	    }
	if ((num1 > num2) && (num2 < num3)){
	    System.out.println("The sorted numbers are " + num2 + " " + num1 + " " + num3);
	    }
	if ((num1 > num3) && (num3 < num2)){
	    System.out.println("The sorted numbers are " + num3 + " " + num1 + " " + num2);
	    }
	if ((num2 < num1) && (num1 > num3)){
	    System.out.println("The sorted numbers are " + num2 + " " + num3 + " " + num1);
	    }
	if ((num2 > num3) && (num3 < num1)){
	    System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1);
	    }
    }

}