package com.dnpass.corejavatraining.day1;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<num/2;++i) 
		{
			if(num%i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+ " It is a Prime Number");
		}
		else
		{
			System.out.println(num+ " It is not a Prime Number");
		}
    sc.close();
	}

}
