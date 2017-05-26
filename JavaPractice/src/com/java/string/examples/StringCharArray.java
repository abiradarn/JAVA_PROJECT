package com.java.string.examples;

public class StringCharArray {

	public static void main(String[] args) {
		
		
		String str = "Convering String to Char array";
		
		char[] arrayChar = str.toCharArray();
		
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println(arrayChar[i]);
		}
	}
}
