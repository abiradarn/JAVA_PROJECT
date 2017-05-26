package com.java.string.examples;

import java.util.Arrays;

public class IntArrayToString {

	public static void main(String[] args) {
		
		
		int[] arryInt = new  int[] {1,4,6,7,11,33,77};
		
		StringBuffer sb = new StringBuffer();
		String separator = " ";
		
		if (arryInt.length >0) {
			
			for (int i = 0; i < arryInt.length; i++) {
				sb.append(arryInt[i]).append(separator);
			}
			
		}
		System.out.println("Int array is converted to String");
		
		System.out.println(sb.toString());
		
		
		System.out.println(" OR it will in another form");
		
		String strNumbers = Arrays.toString(arryInt);
		strNumbers = strNumbers.replaceAll(",", separator).replace("[", "").replace("]", "");
		System.out.println("Final String "+strNumbers);
				
	}
}
