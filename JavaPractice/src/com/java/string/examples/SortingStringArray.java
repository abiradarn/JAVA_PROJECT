package com.java.string.examples;

import java.util.Arrays;

public class SortingStringArray {
	
	public static void main(String[] args) {
		stringSorting();
		
		
	}
	
	
	public  static void stringSorting(){
		String str = "My first school name is Sharanbasaveshwar Recidential ";
		
		String[] strArry = str.split(" ");
		
		Arrays.sort(strArry);
		System.out.println("String array sorted (case sensitive)");
		/*StringBuffer strArry1  = new StringBuffer();
		for (int i = 0; i < strArry.length; i++) {
			String  str3 =  strArry[i].toUpperCase();
			strArry1.append(str3).append("");
		}*/
		
		
		Arrays.sort(strArry);
		for (int i = 0; i < strArry.length; i++) {
			System.out.println(strArry[i]);
		}
		
		
		
		
		
	}

}
