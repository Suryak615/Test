package com.dnpass.corejavatraining.day2;

import java.util.Scanner;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(Math.max(num1, num2));
		sc.close();
		

	}

}
