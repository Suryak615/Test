package com.dnpass.corejavatraining.day4.Account;

public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount account1=new SavingsAccount(1,1000,0.5);
		CurrentAccount account2=new CurrentAccount(2,2000);
		account1.deposit(10000);
		account1.transfer(20000, account2);
		account2.withdraw(1500);
		account2.withdraw(80);
		account1.addInterest();
		account2.deductFees();
		System.out.println("account1 savings balance="+account1.getAccountBalance());
		System.out.println("account2 checking balance="+account2.getAccountBalance());
		
		

	}

}
