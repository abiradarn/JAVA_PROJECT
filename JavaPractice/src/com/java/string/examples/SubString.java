package com.java.string.examples;

public class SubString {

	
	public static void main(String[] args) {
		
		
		String str  = "Java is Programming language";
		
		System.out.println(str.substring(0));
		
		System.out.println(str.substring(0, 10));
		
		
		System.out.println();
		
		char reverse=' ' ;
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			 reverse  += str.charAt(str.length()-1);
			
			//System.out.println(reverse);
			
		}
		
		System.out.println(reverse);
	}
	
	
	
}
