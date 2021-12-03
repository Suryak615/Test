package com.dnpass.corejavatraining.day6;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n)
	{
		int sum=0,i=1;
		while(n!=0 && i<=n)
		{
			if(n%i==0)
			{
				sum += i; 
			}
			i++;
		}
		return sum;
	}
}

public class InterfaceJava {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("I implemented : AdvancedArithmetic");
		System.out.print(calc.divisor_sum(n) + "\n");
		sc.close();
	}
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for(int i=0;i<theInterfaces.length;i++) {
			String interfaceName = theInterfaces[i].getName();	
			System.out.println(interfaceName);
		}
	}

}
