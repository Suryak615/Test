package com.dnpass.corejavatraining.day6;

public class PaybackCard extends Card{
     int pointsEarned;
     double totalAmount;
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PaybackCard(String holderName, String cardNumber, String expiryDate,int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	
	public void show() {
		System.out.println(getHolderName());
		System.out.println(getCardNumber());
		System.out.println(expiryDate);
		System.out.println("Card Number:"+getCardNumber()+ "\nPoints Earned:"+getPointsEarned()+"\nTotal Amount:"+getTotalAmount());
		
	}
	
     
}
