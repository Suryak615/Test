package com.dnpass.corejavatraining.day8.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> colors=new LinkedList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("brown");
		colors.add("green");
		
		
		System.out.println("the linked lst:"+colors);
		for(String element:colors) {
			System.out.println(element);
		}
		
		
		Iterator p=colors.listIterator(1);
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		Iterator it=colors.descendingIterator();
		System.out.println("elements in reverse order");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		colors.add(1,"yellow");
		System.out.println("the linkedlist:"+colors);
	}

}
