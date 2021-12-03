package com.dnpass.corejavatraining.day5;

import java.util.Scanner;

public class SearchAnArray {

	public static void main(String[] args) {
		
		int n,x,flag = 0,i= 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter all the elements:");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter elements want to search: ");
		x = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i] == x) {
				flag = 1;
				break;
			}
			else 
			{
				flag = 0;
			}
		}
		if(flag ==1) {
			System.out.println("Elements found at position:" +(i+1));
		}
		else {
			System.out.println("Elements not found");
		}
		sc.close();

	}

}
