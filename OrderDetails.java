package com.dnpass.corejavatraining.day4;

class OrderDetail {
	int orderNumber;
	int productCode;
	int quantityOrdered;
	String priceEach;
	int orderLineNumber;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(String priceEach) {
		this.priceEach = priceEach;
	}
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
	public String toString() {
		return " Orderdetails : \n Ordernumber = " +orderNumber+ "\n Productcode = " +productCode+ "\n Quantityordered = " +quantityOrdered+ "\n Priceeach = " +priceEach+ "\n Orderlinenumber = " +orderLineNumber+ " " ;
	}
}

public class OrderDetails {

	public static void main(String[] args) {
		 OrderDetail ord = new OrderDetail();
		 ord.setOrderNumber(123456);
		 ord.setProductCode(24567);
		 ord.setQuantityOrdered(25);
		 ord.setPriceEach("Rs.100");
		 ord.setOrderLineNumber(78787);
		 
		 System.out.println(ord);

	}

}
