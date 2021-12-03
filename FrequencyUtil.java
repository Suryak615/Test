package com.dnpass.corejavatraining.day8.Collections;

import java.util.HashMap;

import java.util.Map;

public class FrequencyUtil {

	public static void main(String[] args) {
	       String[] words= {"if","it","is","to","be","it","is","up","to","me","to","delegate"};
	       Map<String,Integer> m=new HashMap<String,Integer>();
	       
	       for(String a:words) {
	    	   Integer freq=m.get(a);
	    	   m.put(a, (freq==null)?1:freq+1);
	    	   
	       }
      System.out.println(m.size()+" distinct words:");
      System.out.println(m);
	}

}