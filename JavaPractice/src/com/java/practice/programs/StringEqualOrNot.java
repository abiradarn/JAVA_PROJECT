package com.java.practice.programs;

public class StringEqualOrNot {

	public static void main(String[] args) {
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = str1;
		boolean b = (str1 == str2);
		System.out.println("\n str1 == str2 : " + str1 == str3);
		System.out.println(" Str1 ==   str2 : "+ b);
		//System.out.println("\n str1.equals(str2) " +str1.equals(str2));
	}
}
