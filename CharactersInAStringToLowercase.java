package com.dnpass.corejavatraining.day5;

import java.util.Scanner;

public class CharactersInAStringToLowercase {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Orginal String : " +str);
		String lowerStr = str.toLowerCase();
	    System.out.println("String in lowercase : " +lowerStr);
	    sc.close();

	}

}
