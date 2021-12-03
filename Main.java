package com.dnpass.corejavatraining.day6;

public class Main {
      public static void main(String[] args) {
    	  
    	  //Circle
    	  int radius = 25;
    	  Shape circle = new Circle("Circle",radius);
    	  System.out.println("Area of circle : " +circle.calculateArea());
    	  
    	  //Square
    	  int side = 8;
    	  Shape square = new Square("Square",side);
    	  System.out.println("Area of Square : "  +square.calculateArea());
    	  
    	  //Rectangle
    	  int length = 7;
    	  int bredth = 4;
    	  Shape rectangle = new Reactangle("Rectangle",length,bredth);
    	  System.out.println("Area of rectangle : " +rectangle.calculateArea());
    	  
      }
}
