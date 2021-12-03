package com.dnpass.corejavatraining.day4;

class Payments {
	
	int customerNumber;
	int checkNumber;
	int paymentDate;
	int amount;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}
	public int getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(int paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String toString() {
		
		return " PaymentDetails : \n Customernumber = " +customerNumber+ "\n Checknumber =  " +checkNumber+ "\n Paymentdate = " +paymentDate+  "\n Amount = " +amount+ " " ;
	}
}

public class Payment {

	public static void main(String[] args) {
		
		Payments pay = new Payments();
		pay.setCustomerNumber(212121);
		pay.setCheckNumber(321654987);
		pay.setPaymentDate(14);
		pay.setAmount(25000);
		
		System.out.println(pay);

	}

}
