package com.dnpass.corejavatraining.day6;

public class Reactangle extends Shape{
       
	 int length;
	 int bredth;
	
	public Reactangle(String name,int length, int bredth) {
		super(name);
		this.name = name;
		this.length = length;
		this.bredth = bredth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
	@Override
	public float calculateArea() {
		return length * bredth;
	}
	
	
	
}
