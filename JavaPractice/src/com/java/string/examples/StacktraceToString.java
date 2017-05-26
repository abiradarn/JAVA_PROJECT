package com.java.string.examples;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StacktraceToString {

	
	public static void main(String[] args) {
		try {
			
			
			int parseInt = Integer.parseInt("One");
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Exception");
			
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			e.printStackTrace(printWriter);
			//System.out.println();
			String str = stringWriter.toString();
			System.out.println("Stacktrace is converted to string "+str);
		}
	}
}
