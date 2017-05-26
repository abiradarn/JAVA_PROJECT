package com.java.string.examples;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CharacterCountEachWord {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		
		//String str  = sc.nextLine();
		//String[] words = str.
       // }

		// - See more at:
		// http://www.java2novice.com/stringtokenizer/multiple-delimiters/#sthash.EmnEO4Zv.dpuf
		// }
		
		
		
		Scanner s = new Scanner(System.in).useDelimiter("\\s");  
		while( s.hasNext() ) {  
			String word = s.next().trim();
			//word  = word.trim();
			if(word.charAt(0) != ' '){
			
			
			
		System.out.println(word +" : " +word.length() );  
			}
		}  
		s.close(); 
	}
}
