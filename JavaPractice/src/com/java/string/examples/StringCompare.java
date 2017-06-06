package com.java.string.examples;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		String str2 = "hello world";
		Object strObj = str;
		
		
		System.out.println(str.compareTo(str2));
		
		System.out.println(str.compareToIgnoreCase(str2));
		
		System.out.println(str.compareTo((String) strObj));
		
		
	}

}
	