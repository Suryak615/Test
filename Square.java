package com.dnpass.corejavatraining.day6;

public  class Square extends Shape{
        
	int side;
	
	
	
	public Square(String name,int side) {
		super(name);
		this.name = name;
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public float calculateArea() {
		
		return side * side;
	}
	
}
