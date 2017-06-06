package com.java.string.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConcat {

	
	public static void main(String[] args) {
		String str1 ="Hello";
		String str2 = "World";
		
		
		//1,Using Concatenate method concat()
		
		//2.Using + operator
		
		//3.Using StringBuffer
		
		//4.Using StringBuilder
		
		//5.Using StringJoin() method
		
		
		
		/*Best Use:  When concatenating the constant strings.
Worst Use:  When using + operator inside loop.
*/
		System.out.println("Using + operator string concatenating :  " +"\n"+str1+str2);
		
		
		/*Best Use:   When concatenating string objects.
		Worst Use: When using on dynamic objects, if str1 becomes null before concat() method it will throw NullPointerException.

*/
		String str11 ="Hello";
		String str21 = "World";
		System.out.println("Using concat() method for string concatenating :  " +"\n"+str11.concat(str21));
		
		
		/*Best Use:  When concatenating large number of string objects in multithreaded application.
		Worst Use:  When creating StringBuffer object inside loop.*/
		
		
		String str13 ="Hello";
		String str31 = "World";
		
		StringBuffer sb = new StringBuffer();
		
		//String result =sb.append(str13).append(str31).toString();
		
		System.out.println("Using append() method for string concatenating :  " +"\n"+sb.append(str13).append(str31).toString());
		
		
		/*Best Use:   When concatenating large number of string objects in single threaded application.
		Worst Use: When creating StringBuilder object inside loop or using in multithreaded application can lead unexpected result.
		*/
		String str14 ="Hello";
		String str41 = "World";
		
		StringBuilder builder = new StringBuilder();
		
		System.out.println("Using append() method for string concatenating :  " +"\n"+builder.append(str14).append(str41).toString());
		
		
		/*Best Use:  When concatenating strings with delimiter or an array of strings.
		Worst Use:  When concatenating large number of Strings.
*/
		String str15 ="Java";
		String str51 = "World";
		/*StringBuffer sb1 = String.join("",str15,str51);
		System.out.println("Using append() method for string concatenating :  " +"\n"+sb1.toString().j);*/
		
		
		//Without using library functions
		
		stingConcat();
		
		
		
		
	}
	
	
	//String concatenate without using  string methods
	
	public static void stingConcat(){
		
		try {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first String");
		

			String str1 = reader.readLine();
			
			System.out.println("Enter the second string");
			
			String str2 = reader.readLine();
			
			String str3 ="";
			
			for (int i = 0; i < str1.length(); i++) {
				str3 += str1.charAt(i);
			}
			for (int j = 0; j < str2.length(); j++) {
				str3 += str2.charAt(j);
			}
			
			System.out.println("The concatenated string is " +str3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
