package com.dnpass.corejavatraining.day8.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

          TreeSet<String> tree_set=new TreeSet<String>();
          tree_set.add("Red");
          tree_set.add("Green");
          tree_set.add("Orange");
          tree_set.add("White");
          tree_set.add("Black");
          System.out.println("Tree set:");
          System.out.println(tree_set);
          
         
          for(String element:tree_set) {
        	  System.out.println(element);
          }
          
          TreeSet<String> tree_set2=new TreeSet<String>();
          tree_set2.add("Pink");
          tree_set2.add("White");
          tree_set2.add("Black");
          System.out.println("Tree set:"+tree_set2);
          
         
          
          tree_set.addAll(tree_set2);
          System.out.println(tree_set);
          
          Iterator it=tree_set.descendingIterator();
         
          System.out.println("Elements in reverse order");
          
          while(it.hasNext()) {
        	    System.out.println(it.next());
          }
          
          
          String first_element=tree_set.first();
          System.out.println("First Element is:"+first_element);
          
          String last_element=tree_set.last();
          System.out.println("last Element is:"+last_element);
          
          
       
         System.out.println("cloned tree list"+tree_set);
          
         System.out.println("size of the tree set"+tree_set.size());
         
         TreeSet<Integer>tree_num=new TreeSet<Integer>();
         TreeSet<Integer>treeheadset=new TreeSet<Integer>();
         
         tree_num.add(1);
         tree_num.add(2);
         tree_num.add(3);
         tree_num.add(5);
         tree_num.add(6);
         tree_num.add(7);
         tree_num.add(8);
         tree_num.add(9);
         tree_num.add(10);
         
         
         treeheadset=(TreeSet)tree_num.headSet(7);
         
         
         Iterator iterator;
         iterator=treeheadset.iterator();
         
         
         System.out.println("tree set data");
         while(iterator.hasNext()) {
        	 System.out.println(iterator.next()+" ");
         }
         
         
         System.out.println("greater than or equal to 86:"+tree_num.ceiling(86));
         System.out.println("greater than or equal to 29:"+tree_num.ceiling(29));
         
         System.out.println("less than or equal to 86:"+tree_num.floor(86));
         System.out.println("less than or equal to 29:"+tree_num.floor(29));
         
         System.out.println("strictly greater than 76:"+tree_num.higher(76));
         System.out.println("strictly greater than 31:"+tree_num.higher(31));
         
         System.out.println("strictly less than 69:"+tree_num.lower(69));
         System.out.println("strictly less than 12:"+tree_num.lower(12));
         
         System.out.println("remove the first element:"+tree_num.pollFirst());
         System.out.println("tree set after removing element"+tree_num);
         
         System.out.println("remove the last element:"+tree_num.pollLast());
         System.out.println("tree set after removing element"+tree_num);
         

         System.out.println("remove 70 last element:"+tree_num.remove(70));
         System.out.println("tree set after removing element"+tree_num);      

	}

}
