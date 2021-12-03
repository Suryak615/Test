package com.dnpass.corejavatraining.day6;

public class MemebershipCard extends Card {
        
	int rating;
	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MemebershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
	
	public void show() {
		super.show();
		System.out.println(getHolderName());
		System.out.println(getCardNumber());
		System.out.println(expiryDate);
		System.out.println("Membership Details\n");
		System.out.println("Rating:"+getRating());




	}

	

}
