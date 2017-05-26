package com.java.string.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLetters {
	
	private static void linecount(String fName, BufferedReader in) throws IOException{
		// System.out.println("Enter a Sentence\n:");
		//Scanner Sentence=new Scanner(System.in);
		long numChar = 0;
		long numLine=0;
		long numWords = 0;
		String line;


		do{

		line = in.readLine();
		if (line != null){
		numChar += line.length();
		numWords += wordcount(line);
		numLine++;
		}
		}while(line != null);
		System.out.println("File Name: " + fName);
		System.out.println("Number of characters: " + numChar);
		System.out.println("Number of words: " + numWords);
		System.out.println("Number of Lines: " + numLine);
		}
		private static void linecount(String fileName){
		BufferedReader in = null;
		try{
		FileReader fileReader = new FileReader(fileName);
		in = new BufferedReader(fileReader);
		linecount(fileName,in);
		}
		catch(IOException e){
		e.printStackTrace();
		}
		}
		private static long wordcount(String line){
		long numWords = 0;
		int index = 0;
		boolean prevWhiteSpace = true;
		while(index < line.length()){
		char c = line.charAt(index++);
		boolean currWhiteSpace = Character.isWhitespace(c);
		if(prevWhiteSpace && !currWhiteSpace){
		numWords++;
		}
		prevWhiteSpace = currWhiteSpace;
		}
		return numWords;
		}
		public static void main(String[] args){
			countWord();
			//System.out.println(wordcount("Nisha is a best buddy and she is very generous"));
		/*long numChar = 0;
		long numLine=0;
		String line;
		try{
		if (args.length == 0)
		{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		line = in.readLine();
		numChar = line.length();
		if (numChar != 0){
		numLine=1;
		}
		//System.out.println("Number of characters: " + numChar);
		System.out.println("Number of words: " + wordcount(line));
		System.out.println("Number of lines: " + numLine);
		}else{
		for(int i = 0; i < args.length; i++){
		linecount(args[i]);
		}
		}
		}
		catch(IOException e){
		e.printStackTrace();


		}*/}
		
		public static void countWordWithoutsplit(){
			
		}
		
		public static void countWord(){
			
			String CurrentString = "Thank you it was exactly what i needed  ";
		    String[] separated = CurrentString.split(" ");
		    String sResultString="";
		    int iWordCount = separated.length;
		    System.out.println("Count of words "+iWordCount);
		    sResultString = iWordCount +" words";
		    for(int i=0;i<separated.length;i++)
		    {
		    	//System.out.println("^^^^^^^^^");
		    String s = separated[i];
		    System.out.println(s +": " +s.length());
		    sResultString = sResultString + s.length() + " letters ";
		    }
		}

}
