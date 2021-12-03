package com.dnpass.corejavatraining.day8.Collections;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		
		values.add(31);
		values.add(21);
		values.add(41);
		values.add(11);
		values.add(61);
		values.add(51);
		
		for(int i : values) {
		     System.out.println(i);
		}
	}

}
