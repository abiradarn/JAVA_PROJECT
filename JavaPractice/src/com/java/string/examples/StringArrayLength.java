package com.java.string.examples;

public class StringArrayLength {

	public static void main(String[] args) {
		String[] month ={"JAN","FEB","MARCH","APRIL","MAY","JULY","AUGUST","SEP","OCT","NOV","JUNE"};
		
		System.out.println("String array  length is "+month.length);
		
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);
		}
	}
}
