package com.dnpass.corejavatraining.day4.Account;


public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(int accountNumber, double initialBalance,double rate) {
		super(accountNumber, initialBalance);
		interestRate=rate;
	}
	public void addInterest() {
		double interest=getAccountBalance()+interestRate/100;
		deposit(interest);
	}

	
}
