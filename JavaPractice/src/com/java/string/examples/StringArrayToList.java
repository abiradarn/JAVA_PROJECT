package com.java.string.examples;

import java.util.Arrays;
import java.util.List;

public class StringArrayToList {

	public static void main(String[] args) {
		String[] month ={"JAN","FEB","MARCH","APRIL","MAY","JULY","AUGUST","SEP","OCT","NOV","JUNE"};
		
		List list = Arrays.asList(month);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
	}
}
