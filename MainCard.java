package com.dnpass.corejavatraining.day6;

import java.util.Scanner;

public class MainCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Card \n1.Payback Card \n2.Membership Card");
		int Number = sc.nextInt();
		sc.nextLine();
		String[] in = new String[3];
		
		System.out.println("Enter the Card Details: \n");
		in = sc.nextLine().split("\\|");	
		
		String alpha = in[0];
		String beta = in[1];
		String gamma = in[2];
		
		if(Number==1)
		{
			System.out.println("Enter the points in card: \n");
			int num = sc.nextInt();
			System.out.println("Enter the Amount: \n");
			double num1 = sc.nextDouble();
			System.out.println("User's Payback Card Details:");
			PaybackCard pay = new PaybackCard(alpha,beta,gamma,num,num1);
			
			pay.show();
			
			
			
		}
		else if(Number==2)
		{
			System.out.println("Enter the Rating:\n");
			int Rating = sc.nextInt();
			MemebershipCard mem = new MemebershipCard(alpha,beta,gamma,Rating);
			mem.show();
		}
		sc.close();
	}

}
