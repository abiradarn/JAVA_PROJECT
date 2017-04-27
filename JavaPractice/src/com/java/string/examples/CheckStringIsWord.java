package com.java.string.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckStringIsWord {

	
	public CheckStringIsWord() throws IOException {
		// TODO Auto-generated constructor stub
		
		Path path1 = Paths.get("words.txt");
		 Path path = Paths.get("words.txt");
	        byte[] readBytes = Files.readAllBytes(path);
	        String wordListContents = new String(readBytes, "UTF-8");
	        String[] words = wordListContents.split("\n");
	        Set wordsSet = new HashSet<>();
	        Collections.addAll(wordsSet, words);		
				
	}
	
	
	
	public static boolean check_for_word(String word) {
        // System.out.println(word);
        try {
            BufferedReader in = new BufferedReader(new FileReader(
                "/usr/share/dict/american-english"));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.indexOf(word) != -1) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
        }

        return false;
    }

	
	public static void main(String[] args) {
		System.out.println("Hai");
		
		String input;
        try {
            System.out.println("Enter the input");
            Scanner s = new  Scanner(System.in);

            input = s.next();
            if(input.matches(".*\\d.*")){
                System.out.println(" Contains digit only");
            } else{
                System.out.println(" Only String/words found");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		
	}
}
