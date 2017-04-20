package Exercise_10_7;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	Account () {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	Account (int newID, double newBalance) {
		id = newID;
		balance = newBalance;
		dateCreated = new Date();
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterest(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getDateCreated () {
		return dateCreated.toString();
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
}
