package com.dnpass.corejavatraining.day2;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0)
		{
			System.out.println(number+ " Positive number");
		}
		else if(number<0)
		{
			System.out.println(number+ " Negative number");
		}
		else
		{
			System.out.println(number+ " Neither Positive Nor Negative");
		}
        sc.close();
	}

}
