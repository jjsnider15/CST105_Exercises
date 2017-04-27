package exercise_11_8;

public class exercise_11_8 {
	
	public static void main(String[] args) {
		
		Account account = new Account("George", 1122, 1000);
		
		account.setAnnualInterestRate(1.5);
		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("       Account Summary");
	    System.out.println("------------------------------------");
	    System.out.println("Account holder name: " + account.getName());
	    System.out.println("Interest Rate: " + account.getAnnualInterestRate());
	    System.out.printf("Balance: $%.2f\n", account.getBalance());
	    System.out.println("/n     List of Transactions");
	    System.out.println("------------------------------------");
	    for (int i = 0; i < account.getTransaction().size(); i++) {
	    	System.out.println("Date: " + (account.getTransaction()).get(i).getDate());
	    	System.out.println("Type: " + (account.getTransaction()).get(i).getType());
	    	System.out.println("Amount: " + (account.getTransaction()).get(i).getAmount());
	    	System.out.println("Balance: " + (account.getTransaction()).get(i).getBalance());
	    	System.out.println("Description: " + (account.getTransaction()).get(i).getDescription());
	    	System.out.println();
	    }
	}
}