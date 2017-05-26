package com.java.string.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToString {

	public static void main(String[] args) {
		List< String> list = new ArrayList<>();
		
		
		list.add("Mumbai");
		list.add("Chennai");
		list.add("Bengaluru");
		list.add("Delhi");
		list.add("Patna");
		list.add("Ranchi");
		list.add("Hydrabad");
		list.add("Bhoopal");
		list.add("Noida");
		
		
		
		Object[]  cities = list.toArray();
		
		String[] cityName = Arrays.copyOf(cities, cities.length, String[].class);
		
		System.out.println("ArrayList is converted to string");
		
		for (int i = 0; i < cityName.length; i++) {
			
			System.out.println(cityName[i]);
			
		}
	}
}
