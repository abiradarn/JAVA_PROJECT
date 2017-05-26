package com.java.string.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverSingStringArray {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter a sentence");
		
		String str = scanner.nextLine();
		String[] arrStr = str.split(" ");
		
		System.out.println(str);
		List<String> list = Arrays.asList(arrStr);
		Collections.reverse(list);
		System.out.println("String array is reversed");
		String[] arrStr1 = (String[]) list.toArray();
		for (int i = 0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}
		
		/*
		System.out.println("Without using reversing method");
		
		
		for (int i = arrStr.length; i <= arrStr.length; i--) {
			System.out.println("&&&&&&");
			System.out.println(arrStr[i]);
			
		}*/
	}

}
