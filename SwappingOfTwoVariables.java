package com.dnpass.corejavatraining.day1;

import java.util.Scanner;

public class SwappingOfTwoVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		sc.close();

	}

}
