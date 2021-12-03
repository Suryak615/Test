package com.dnpass.corejavatraining.day5;

import java.util.Scanner;

public class ReplacingStringCharacterWithAnotherStringCharacter {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String new_str = str.replace('d', 'h');
		System.out.println("Original String : " +str);
		System.out.println("New String : " +new_str);
        sc.close();
	}

}
