package com.dnpass.corejavatraining.day6;

public abstract class Shape {
      String name;
     
     public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	 }

	 public void setName(String name) {
		this.name = name;
	 }
    
	 public abstract  float calculateArea(); 
		
	
}
