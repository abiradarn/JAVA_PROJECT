package com.java.string.examples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


//http://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html
public class StringReversing {
	
	public static void main(String[] args) {
		//declare orinial string
		
		String original = "Hello String";
		
		System.out.println("Original String "+original);
		
		
		//1.Using String buffer and reverse method
	    /*
	    The easiest way to reverse a given string is to use reverse()
	    method of java StringBuffer class.
	    reverse() method returns the StringBuffer object so we need to
	    cast it back to String using toString() method of StringBuffer
	    */
		
		
		StringBuffer sb = new StringBuffer(original);
		String reversed = sb.reverse().toString();
		
		System.out.println("Reversed string "+reversed);
		
		
		
		//2.Using algorithm to reverse string.
		
		
		int length= original.length();
		String revStr = "";
		
		for (int i = length-1; i >= 0; i--) {
			
			revStr += original.charAt(i);
			
		}
		
		System.out.println("Without using reverse method "+revStr);
		
		//3.Reverse using recursion no loop or inbuilt method 
		
		String reverseStr = reverse(original);
		System.out.println(reverseStr);
		
		reverseTemp(original);
		
		reverseList(original);
		
		reverseByte(original);
		
		
		
		
		

	}
	
	//3.Reverse using recursion no loop or inbuilt method 
	
	/*https://www.quora.com
		/How-do-I-reverse-a-String-in-Java-without-using-any-loop-or-inbuilt-methods*/
	
	
			public static String reverse(String string){
				if (string.length() == 0) {
					
					return "";
					
				}
				System.out.println(string +"  " +string.length());
				return string.charAt(string.length()-1) + reverse(string.substring(0,string.length()-1));
			}

			
			
			//4.using temp
			
			public static String reverseTemp(String  str){
				
				char[] input = str.toCharArray();
				
				int left,right =0;
				right = input.length-1;
				
				for (left=0; left < right ; left++ ,right--)
			    {
			     // Swap values of left and right 
			     char temp = input[left];
			     input[left] = input[right];
			     input[right]=temp;
			    }
			    for (char c : input)
			     System.out.print(c);
			    System.out.println();
			    
			    return "";
			}
			
			
			
		//5. Using Collections
			
			public static void reverseList(String str){
				char[] hello=str.toCharArray();
			     List<Character> trial1= new LinkedList<>();
			     for(char c: hello)
			     trial1.add(c);
			     Collections.reverse(trial1);
			     ListIterator li = trial1.listIterator();  
			     while(li.hasNext())
			    {System.out.print(li.next());}  
				
			}
			
		//6.The last method is converting string into bytes 
			
			
			public static void reverseByte(String str){
				 byte [] strAsByteArray = str.getBytes();
				  byte [] result = new byte [strAsByteArray.length];
				   
				  for(int i = 0; i<strAsByteArray.length; i++){
				  result[i] = strAsByteArray[strAsByteArray.length-i-1];
				  }
				  System.out.println( new String(result));
			}
}
