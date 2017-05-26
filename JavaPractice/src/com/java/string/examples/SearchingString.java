package com.java.string.examples;


//Searchig a string using indexof
public class SearchingString {
	
	public static void main(String[] args) {
		String  str = "HAI world Hello World";
		int indexOf = str.indexOf("Hello");
		if(indexOf == -1){
			System.out.println("Hello is not found");
		}else{
			System.out.println("Hello found at index "+indexOf);
			
			int postnStr = str.indexOf("Hello", 11);
			
			System.out.println("Indesx of  Hello after 11 is "+postnStr);
			
			int lastIndex = str.lastIndexOf("Hello");
			System.out.println("Last index of Hello is "+lastIndex);
			
			System.out.println(str.hashCode());
			
			System.out.println(str.charAt(indexOf));
			
			System.out.println(str.indexOf("H", 11));
			
			
			System.out.println("CodePoint of "+str.codePointAt(10));
			System.out.println(str.codePointCount(9,20 ));
			
			
		}
		
	}

}