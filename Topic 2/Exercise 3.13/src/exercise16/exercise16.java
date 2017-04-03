package exercise16;

import java.util.Scanner;

public class exercise16{
	
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("(0 - Single filer, 1 - Married Jointly or " + 
		"qualifying widow(er), 2 - Married Seperatley, 3 - Head of " + 
		"Household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		if (status == 0)
		{
			if (income <= 8350)
				tax = income * .10;
			else if (income <= 33950)
				tax = 8350 * .10 + (income - 8350) * .15;
			else if (income <= 82250)
				tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 82250) * .28;
			else if (income <= 171550)
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (income - 82250) * .28;
			else if (income <= 372950)
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 +
				(income - 171550) *.33;
			else 
				tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 +
				(372950 - 171550) * .33 + (income - 372950) * .35;		
		}
		else if (status == 1){
		 
			  if (income <= 8350)
               tax = income *.10;
            else if (income <= 33950)
            	tax = 8350 * .10 + (income - 8350) * .15;
            else if (income <= 82250)
            	tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 82250) * .28;
            else if (income <= 171550)
            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (income - 82250) * .28;
            else if (income <= 372950)
            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 +
            	(income - 171550) *.33;
            else
            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 + 
            	(372950 - 171550) * .33 + (income - 372950) * .35;               
		} 	 
		else if (status == 2){
	
			 if (income <= 8350)
	               tax = income *.10;
	            else if (income <= 33950)
	            	tax = 8350 * .10 + (income - 8350) * .15;
	            else if (income <= 82250)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 82250) * .28;
	            else if (income <= 171550)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (income - 82250) * .28;
	            else if (income <= 372950)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 +
	            	(income - 171550) *.33;
	            else
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 + 
	            	(372950 - 171550) * .33 + (income - 372950) * .35;
		}
		else if (status == 3){
		 
			 if (income <= 8350)
	               tax = income *.10;
	            else if (income <= 33950)
	            	tax = 8350 * .10 + (income - 8350) * .15;
	            else if (income <= 82250)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 82250) * .28;
	            else if (income <= 171550)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (income - 82250) * .28;
	            else if (income <= 372950)
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 +
	            	(income - 171550) *.33;
	            else
	            	tax = 8350 * .10 + (33950 - 8350) * .15 + (83350 - 33950) * .25 + (171550 - 82250) * .28 + 
	            	(372950 - 171550) * .33 + (income - 372950) * .35;
		}
		 
		else{
			System.out.println("Error : Invalid Status");
			System.exit(1);			
		}
		
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		
	}
}