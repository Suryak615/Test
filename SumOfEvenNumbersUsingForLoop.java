package com.dnpass.corejavatraining.day3;

public class SumOfEvenNumbersUsingForLoop {

	public static void main(String[] args) {
		
		int num = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				num = num + i;
			}
		}
		
		System.out.println(num);

	}

}
