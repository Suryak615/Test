package com.dnpass.corejavatraining.day4;

class ProductLines {
	
	String productLine;
	String textDescription;
	String htmlDescription;
	String image;
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getHtmlDescription() {
		return htmlDescription;
	}
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String toString() {
		return " Productslines : \n Productline = " +productLine+ "\n Textdescription = " +textDescription+ "\n Htmldescription = " +htmlDescription+ "\n Image = " +image+ " " ;
	}
	
}

public class ProductLine {

	public static void main(String[] args) {
	
            ProductLines pro = new ProductLines();
            pro.setProductLine("Buy One Get One Free!!");
            pro.setTextDescription("Diwali Sweets Rasagulla");
            pro.setHtmlDescription("Enjoy the Diwali with the Sweetest Rasagulla");
            pro.setImage("sweets.jpg");
            
            System.out.println(pro);
	}

}
