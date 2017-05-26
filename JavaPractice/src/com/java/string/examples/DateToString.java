package com.java.string.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	
	public static void main(String[] args) {
		Date date  = new Date();
		System.out.println(date);
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String strDate  = dateFormat.format(date);
		System.out.println(strDate);
	}
}
