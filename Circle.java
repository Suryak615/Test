package com.dnpass.corejavatraining.day6;

public class Circle  extends Shape{
     int radius;
     
     public Circle(String name,int radius) {
    	super(name);
		this.name = name;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public float calculateArea() {
		 
		double area = 3.14*radius*radius;
		
		return (float) area;
	}
     
}
