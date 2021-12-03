package com.dnpass.corejavatraining.day4;

class Customers {
	int customerNumber;
	String customerName;
	String contactLastName;
	String contactFirstName;
	int phone;
	String addressLine1;
	String addressLine2;
	String city;
	String state;
	int postalCode;
	String country;
	int salesRepEmployeeNumber;
	int creditLimit;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public String toString() {
		 return "Customers : \nCustomernumber = " +customerNumber+ "\nCustomername = " +customerName+ "\nContactlastname : "+contactLastName+ "\nPhone = " +phone+ "\nAddressline1 = " +addressLine1+ "\nAddressline2 = " +addressLine2+ "\nCity = " +city+ "\nState = " +state+ "/nPostalcode = " +postalCode+ "\nCountry = " +country+ "\n Salesrepemployeenumber = " +salesRepEmployeeNumber+ "\nCreditlimit = " +creditLimit+ " " ;
	}
	
}

public class Customer {
	
	public static void main(String args[]) {
        Customers custom = new Customers();
        custom.setCustomerNumber(12345);
        custom.setCustomerName("David");
        custom.setContactLastName("Billa");
        custom.setContactFirstName("David");
        custom.setPhone(9192939);
        custom.setAddressLine1("Sholinganallur");
        custom.setAddressLine2("Medavakkam high road");
        custom.setCity("Chennai");
        custom.setState("Tamilnadu");
        custom.setPostalCode(600028);
        custom.setCountry("India");
        custom.setSalesRepEmployeeNumber(98756);
        custom.setCreditLimit(50000);
        
        System.out.println(custom);
		
	}
}
