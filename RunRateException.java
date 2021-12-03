package com.dnpass.corejavatraining.day7;

import java.util.Scanner;

public class RunRateException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	System.out.print("Enter the total runs scored :");
	int totalRun=Integer.parseInt(sc.next());
	System.out.print("Enter the total overs faced :");
	int totalOvers=Integer.parseInt(sc.next());
	int runRate= totalRun/totalOvers;
	System.out.println(runRate);
	}
	catch(NumberFormatException|ArithmeticException   e) {
		System.out.println(e);
	}
	sc.close();
 }
}
