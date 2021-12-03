package com.dnpass.corejavatraining.day4;

class Orders {
	
	int orderNumber;
	String orderDate;
	String requiredDate;
	String shippedDate;
	String status;
	String comments;
	int customerNumber;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}
	public String getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public String toString() {
		return " Orders : \n Ordernumber = " +orderNumber+ "\n Orderdate = " +orderDate+ "\n Requireddate = " +requiredDate+ "\n Shippeddate = " +shippedDate+ "\n Status = " +status+ "\n Comments = " +comments+ "\n Customernumber = " +customerNumber+ " " ;
	}
}

public class Order {

	public static void main(String[] args) {
		
		Orders ord = new Orders();
		ord.setOrderNumber(123456);
		ord.setOrderDate("14/11/21");
		ord.setRequiredDate("16/11/21");
		ord.setShippedDate("15/11/21");
		ord.setStatus("Active");
		ord.setComments("It will reach within one day");
		ord.setCustomerNumber(124578);

		System.out.println(ord);
	}

}
