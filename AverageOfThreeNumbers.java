package com.dnpass.corejavatraining.day1;

import java.util.Scanner;


public class AverageOfThreeNumbers {
     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		float num;
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		num2 = sc.nextInt();
		System.out.println("Enter Third number : ");
		num3 = sc.nextInt();
		num = (num1+num2+num3)/3;
		System.out.println("Average Of Three Numbers is : " +num);
		sc.close();

	}

}
