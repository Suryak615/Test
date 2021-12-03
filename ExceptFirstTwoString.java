package com.dnpass.corejavatraining.day5;

import java.util.Scanner;

public class ExceptFirstTwoString {
    
	public static String getString(String stng) {
		int len =  stng.length();
		String temp = "";
		for(int i=0;i<len;i++)
		{
			if(i==0&&stng.charAt(i)=='k')
			{
				temp +='k';
			}
			else if (i==1&&stng.charAt(i)=='b')
			{
				temp += 'b';
			}
			else if(i>1)
			{
				temp += stng.charAt(i);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ExceptFirstTwoString str = new ExceptFirstTwoString();
		String str1 = sc.next();
		System.out.println("The given String: " +str1);
		System.out.println("The new String: " +str.getString(str1));
        sc.close();
	}

}
