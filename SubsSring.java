package com.dnpass.corejavatraining.day5;

import java.util.Scanner;

public class SubsSring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(S.substring(Start, end));
		sc.close();

	}

}
