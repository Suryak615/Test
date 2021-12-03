package com.dnpass.corejavatraining.day8.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 List<String> colors=new ArrayList<String>();
		 colors.add("Red");
		 colors.add("White");
		 colors.add("Black");
		 colors.add("Blue");
		 System.out.println(colors);
		 
		 
		 for(String element:colors) {
			 System.out.println(element);
	     }
		 
		 colors.add(0, "pink");
		 colors.add(5, "Brown");
		 
		 
		 System.out.println(colors);
		 
		
		 String element=colors.get(0);
		 System.out.println(element);
		 element=colors.get(2);
		 System.out.println(element);
		 
		
		 
		 colors.set(2,"Yellow");
		 System.out.println(colors);
		 
		 
		 colors.remove(2);
		 System.out.println(colors);
		 
		
		 if(colors.contains("Red")) {
			 System.out.println("found the element");
		 }
		 else
			 System.out.println("there is no such element");
		 
		 Collections.sort(colors);
		 System.out.println("List after sort"+colors);
		 
		 List<String>list2=new ArrayList<String>();
		 list2.add("A");
		 list2.add("B");
		 list2.add("C");
		 list2.add("D");
		 
		 Collections.copy(colors,list2);
		 System.out.println("copy list to list2,\nAfter copy:");
		 
		 Collections.shuffle(colors);
		 System.out.println("list after shuffling:\n"+colors);
		 
		 Collections.reverse(colors);
		 System.out.println("list after reversing:\n"+colors);
		 
		 List<String> sub_list=colors.subList(0, 3);
		 System.out.println("list of first three elements:"+sub_list);
		 
		 Collections.swap(colors, 0,2);
		 System.out.println("array list after swap");
		 for(String b:colors) {
			 System.out.println(b);
		 }
		 
		 ArrayList<String> c2=new ArrayList<String>();
		 c2.add("Red");
		 c2.add("Green");
		 System.out.println("list of secod array"+c2);
		 
		 colors.removeAll(colors);
		 System.out.println("array list after removung all elements"+colors);
	    
		 
		 c2.trimToSize();
		 System.out.println(colors);
		 
		
		 c2.ensureCapacity(6);
         c2.add("white");
         c2.add("pink");
         c2.add("yellow");
         
         ArrayList<String> color=new ArrayList<String>();
         color.add("red");
         color.add("black");
         
         System.out.println("original array list"+color);
         
         String new_color="white";
         color.set(1, new_color);
         
        int num=color.size();
        System.out.println("replace second element with 'white'.");
        for(int i=0;i<num;i++)
        	System.out.println(color.get(i));
 }
}         
		 
		 
		 
	
