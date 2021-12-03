package com.dnpass.corejavatraining.day4.Account;

public class PrivelegeAccount extends Account{

	public void withdraw(double amount) {
		
		super.setAccountBalance(super.getAccountBalance()-amount);
	}

}