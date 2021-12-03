package com.dnpass.corejavatraining.day3;

import java.util.Scanner;

public class SmallestOfThreeNumbersOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int smallest;
        
        if(num1<num2)
        {
        	if(num3<num1)
        	{
        		smallest = num3;
        	}
        	else 
        	{
        		smallest = num1;
        	}
        }
        else
        {
        	if(num2<num3)
        	{
        		smallest = num2;
        	}
        	else
        	{
        		smallest = num3;
        	}
        }
        System.out.println(smallest+ " is the smallest Number");
        sc.close();
	}

}
