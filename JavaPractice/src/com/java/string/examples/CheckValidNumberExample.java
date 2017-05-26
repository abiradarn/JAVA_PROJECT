package com.java.string.examples;

public class CheckValidNumberExample {

	public static void main(String[] args) {
		String[]  str = new String[] {"847843","10.invalid","3748.87","123bhfd","ioruiur.899","..9999"};
		
		for (int i = 0; i < str.length; i++) {
			
			if(str[i].indexOf(".")>0){
				try {
					
					Double.parseDouble(str[i]);
					System.out.println(str[i] +" is valid decimal number");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(str[i] +" is not valid decimal number");
				}
				
					
			}
			else
			{
				try {
					Integer.parseInt(str[i]);
					System.out.println(str[i] +" is valid integer");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(str[i] +" is not valid integer");
				}
			}
		}
	}
}
