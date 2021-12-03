package com.dnpass.corejavatraining.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			int int1=sc.nextInt(),int2=sc.nextInt();
			System.out.println(int1/int2);
		}
		catch(InputMismatchException e){
			System.out.println(" type miss match");
		}
		catch(ArithmeticException e) {
			System.out.println(" Cannot divide by zero");	
		}
		sc.close();
	}

}

