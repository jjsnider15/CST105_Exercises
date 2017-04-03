package exercise14;

import java.util.Scanner;

public class exercise14{
	
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner(System.in);
		
		System.out.println("Enter today's number (0 for Sunday, 1 for Monday... 6 for Saturday) :");
		
		int elapsedDay = input.nextInt();
		int todayNo = input.nextInt();
		int futureDay = (todayNo + elapsedDay) % 7;
		
		switch (todayNo) {
		case 0:
			System.out.print("Today in Sunday and ");
			break;
		case 1:
			System.out.print("Today in Monday and ");
			break;
		case 2:
			System.out.print("Today in Tuesday and ");
			break;
		case 3:
			System.out.print("Today in Wednesday and ");
			break;
		case 4:
			System.out.print("Today in Thursday and ");
			break;
		case 5:
			System.out.print("Today in Friday and ");
			break;
		case 6:
			System.out.print("Today in Saturday and ");
			break;	
		}
		switch (futureDay) {
		case 0:
			System.out.print("the furture is Wednesday.");
			break;
		case 1:
			System.out.print("the furture is Thursday.");
			break;
		case 2:
			System.out.print("the furture is Friday.");
			break;
		case 3:
			System.out.print("the furture is Saturday.");
			break;
		case 4:
			System.out.print("the furture is Sunday.");
			break;
		case 5:
			System.out.print("the furture is Monday.");
			break;
		case 6:
			System.out.print("the furture is Tuesday.");
			break;
		}
	}
}