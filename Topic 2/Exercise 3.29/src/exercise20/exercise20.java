package exercise20;

import java.util.Scanner;

public class exercise20{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Circle 1 center x-, y-coordinates, and radius: ");
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter Circle 2 center x-, y-coordinates, and radius: ");
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		double distance = Math.pow((X1-X2) * (X1-X2) + (Y1-Y2) * (Y1-Y2), 0.5);
		if (radius2 >= radius1 && distance <= (radius2 - radius1)){
			System.out.println("Circle 1 is inside Circle 2.");
		}
		else if (radius1 >= radius2 && distance <= (radius1 - radius2)) {
			System.out.println("Circle 2 is inside Circle 1");
		}
		else if (distance > (radius1 + radius2)) {
			System.out.println("Circle 2 does not overlap Circle 1");
		}
		else {
			System.out.println("Circle 2 overlaps Circle 1.");
		}
	}
}