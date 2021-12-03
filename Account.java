package com.dnpass.corejavatraining.day4.Account;



public class Account {
	private static int lastAssignedNumber=0;
	private int accountNumber;
	private double accountBalance;
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Account(int accountNumber, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
    public Account() {
    	lastAssignedNumber++;
    	accountNumber=lastAssignedNumber;
    }
	public Account(double accountBalance) {
		lastAssignedNumber++;
		accountNumber=lastAssignedNumber;
		this.accountBalance = accountBalance;
	}
	public void showdata() {
		System.out.println("Account Number"+accountNumber);
		System.out.println("Account Balance"+accountBalance);
	}
     public void deposit(double depositAmount) {
    	 System.out.println("account deposit is called");
    	 if(depositAmount<0) {
    		 
    	 }else
    		 accountBalance=accountBalance+depositAmount;
     }
     public void withdraw(double withdrawAmount) {
    	 if(accountBalance<withdrawAmount) {
    		 
    	 }else
    		 accountBalance=accountBalance-withdrawAmount;
     }
     public void transfer(double amount,Account other) {
    	 withdraw(amount);
    	 other.deposit(amount);
     }
     public int getAccountNumber() {
    	 return accountNumber;
     }
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accountNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance)) {
			return false;
		}
		if (accountNumber != other.accountNumber) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
	}
	
	
    	
}