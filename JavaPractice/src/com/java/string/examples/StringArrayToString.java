package com.java.string.examples;

import java.util.Arrays;

public class StringArrayToString {
	public static void main(String[] args) {
		String[] str =new String[] {"Java", "String", "Array", "To", "String", "Example"};
		
		//1.Using Arraays.toString() Method
		String str1 = Arrays.toString(str);
		System.out.println(str1.substring(1, str1.length()-1).replaceAll(",", ""));
		
		
		//2.Arrays.asList() followed by toString()
		String str2 = Arrays.asList(str).toString();
		System.out.println(str2.substring(1, str2.length()-1).replaceAll(",", ""));
		
		
		//3.Using string buffer append
		
		StringBuffer sb = new StringBuffer();
		
		if (str.length > 0) {
			for (int i = 0; i < str.length; i++) {
				sb.append(str[i]).append(" ");
			}
			
			System.out.println(sb.toString());
		}
	}

}
