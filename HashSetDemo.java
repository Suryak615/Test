package com.dnpass.corejavatraining.day8.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> colors=new HashSet<String>();
		
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("white");
		colors.add("Pink");
		colors.add("Yellow");
		
		
		System.out.println("the Hash set"+colors);

		
		System.out.println("size of the hash set"+colors.size());
		System.out.println("checking the above array list is empty or not!"+colors.isEmpty());
	    
	    colors.removeAll(colors);
	    System.out.println("hash set after removing all elements"+colors);
	    System.out.println("checking the above array list is empty or not!"+colors.isEmpty());
	    
         
			 
			    String[] new_array=new String[colors.size()];
			    colors.toArray(new_array);
			    
			    
			    System.out.println("Array elements");
			    for(String element:new_array) {
			    	System.out.println(element);
			    }
			    
			  
			    
			    Set<String> tree_set=new TreeSet<String>(colors);
			    
			    
			    System.out.println("TreeSet elements");
			    for(String element:tree_set) {
			    	System.out.println(element);
			    }
			    
			  //create a List from HashSet elements
			    List<String> list=new ArrayList<String>();
			    
			   
			    System.out.println("ArrayList contains"+list);
			    
			    HashSet<String> h_set2=new HashSet<String>();
			    h_set2.add("Red");
			    h_set2.add("Pink");
			    System.out.println("second HasSet content"+h_set2);
			    colors.retainAll(h_set2);
			    System.out.println("HashSet content");
			    System.out.println(colors);
			    
			    
			  
			    System.out.println("Hashset content"+colors);
			    
			    String[] args1= {"a","a","b","c","d","e","b"};
			    
			    Set<String> uniques=new HashSet<String>();
			    Set<String> dups=new HashSet<String>();
			    
			    for(String a:args1)
			    	if(!uniques.add(a))
			    		dups.add(a);
			    uniques.removeAll(dups);
			    System.out.println("unique words"+uniques);
			    System.out.println("duplicate words"+dups);
			    
			    Set<String> s=new HashSet<String>();
			    for(String a:args1)
			    	s.add(a);
			    System.out.println(s.size()+"distinct words");
			    
				
	}

}