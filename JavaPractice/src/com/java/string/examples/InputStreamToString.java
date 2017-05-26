package com.java.string.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamToString {

	public static void main(String[] args) {
		try {
			//InputStream  stream = new FileInputStream("../data.txt");
			InputStream  stream = new FileInputStream("F:/GIT_REPO_LOCAL/JAVA_PROJECT/JavaPractice/data.txt");
			
			String strContent;
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			StringBuffer sb =  new StringBuffer();
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				sb.append(line);
				
			}
			
			strContent = sb.toString();
			
			System.out.println("Another way ");
			
			/*strContent = new Scanner(stream).useDelimiter("\\A").next();
			System.out.println(strContent);
			*/
			
			System.out.println(strContent);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
