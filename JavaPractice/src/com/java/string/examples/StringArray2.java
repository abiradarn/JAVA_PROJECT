package com.java.string.examples;

public class StringArray2 {
	
	public static void main(String[] args) {
		 
		
		String[] firstArray = new String[]{"Abhi","Lekha","Biradar"};	
		
		String[] secondArray = new String[3];
		
		secondArray[0]="Abhi";
		secondArray[1]="Lekha";
		secondArray[2]="Biradar";
		
		System.out.println("second indesx of firsrtaray is "+firstArray[0]);
		
		for (int i = 0; i < secondArray.length; i++) {
			System.out.println(secondArray[i]);
			
		}
	}

}
