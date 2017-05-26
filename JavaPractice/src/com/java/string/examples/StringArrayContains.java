package com.java.string.examples;

import java.util.Arrays;

public class StringArrayContains {

	public static void main(String[] args) {
		String[] month ={"JAN","FEB","MARCH","APRIL","MAY","JULY","AUGUST","SEP","OCT","NOV","JUNE"};
		
		
		String str1 = "MARCH";
		String str2 = "April";
		boolean contains =false;
		for (int i = 0; i < month.length; i++) {
			if (month[i].equals(str2)) {
				contains = true;
				break;
			}
		}
		if (contains) {
			System.out.println("String array contains "+str2);
		}else {
			System.out.println("String array does not contains "+str2);
		}
		
		
		contains = Arrays.asList(month).contains(str1);
		
		System.out.println("Does String array contain " + str1 + "? " +contains);
        
        contains = Arrays.asList(month).contains(str2);

        System.out.println("Does String array contain " + str2 + "? " +contains);

	}
}
