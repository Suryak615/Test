package com.dnpass.corejavatraining.day3;

import java.util.Scanner;

public class MiddleCharacterOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a String : ");
        String str = sc.nextLine();
        System.out.println("Middle Character of the String is : " +middle(str)+ "\n");
        sc.close();
	}
	
    public static String middle(String str) {
    	int position;
        int length;
        if(str.length()%2==0)
        {
        	position = str.length()/2-1;
        	length = 2;
        }
        else
        {
        	position = str.length()/2;
        	length = 1;
        }
        return str.substring(position, position + length);
       
    }

}
