package com.dnpass.corejavatraining.day4;

class Product {
	 
	int productCode;
	String productName;
	String productLine;
	String productScale;
	String productVendor;
	String productDescription;
	String quantityInStock;
	String buyPrice;
	String Msrp;
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getProductScale() {
		return productScale;
	}
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(String quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public String getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getMsrp() {
		return Msrp;
	}
	public void setMsrp(String msrp) {
		Msrp = msrp;
	}
	
	public String toString() {
		
		return " Product : \n Productcode = " +productCode+ "\n Productname = " +productName+ "\n Productline = " +productLine+ "\n Productscale = " +productScale+ "\n Productvendor = " +productVendor+ "\n Productdescription = " +productDescription+ "\n Quantityinstock = " +quantityInStock+ "\n BuyPrice = " +buyPrice+ "\n MSRP = " +Msrp+ " " ;
	}
		
	
}

public class ProductCode {
	
	public static void main(String[] args) {
		
		Product prod = new Product();
		prod.setProductCode(23456);
		prod.setProductName("Rasgulla");
		prod.setProductLine("Buy one Get one Free!!");
		prod.setProductScale("Good");
		prod.setProductVendor("ABC Sweets");
		prod.setProductDescription("Enjoy the Sweetest Rasgulla");
		prod.setQuantityInStock("1Kg");
		prod.setBuyPrice("Rs.300");
		prod.setMsrp("Rs.280");
        
		System.out.println(prod);
	}

}
