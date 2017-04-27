package JavaPatterns;

import java.util.Scanner;

public class Pattern1 {
	static int k=5;
	static int l= 5;
	
	public static int rows = 0;
	
	public static int getRow(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many rows you want in this pattern");
		int rows = scanner.nextInt();
		System.out.println("Rows" +rows);
		return rows;
	}
	public static void patternSimple(){
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many rows you want	in this pattern");
		
		int rows = scanner.nextInt();*/
		
		 rows =getRow();
		System.out.println("Here  is your pattern..");
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print("*" +" ");
				
			}
			System.out.println();
			
			
		}
	}
	
	
	
	public static void patternSimple1(){
		
		rows =getRow();
		for (int i = rows; i >= 0 ; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print("*" +" ");
				
			}
			System.out.println();
			
			
		}
	}
	
public static void patternSimple3(){
		
		rows =getRow();
		for (int i = rows; i >= 0 ; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*" +" ");
				
			}
			System.out.println();
			
			
		}
	}
	
	
	
	public static void patternSimple2(){
		
		rows =getRow();
		for (int i = 0; i<= rows ; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*" +" ");				
			}
			System.out.println();		
			
		}
	}
	
public static void patternSimple4(){
		
		rows =getRow();
		for (int i = 0; i<= rows ; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*" +" ");				
			}
			System.out.println();		
			
		}
		
		
		for (int i = rows-1; i >= 0; i--) {
			
			for (int j = 0; j <= i ; j++) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
			
		}
	}
	


public static void patternSimple5(){
	
	rows =getRow();
	
for (int i = rows; i>= 0 ; i--) {
		
		for (int j = 0; j <= i ; j++) {
			
			System.out.print(" ");	
		
		}
		
		for (int j = i; j <= rows; j++) {
			System.out.print("*");
			
		}
		System.out.println();		
		
	}
	for (int i = 0; i<= rows ; i++) {
		
		for (int j = 1; j <=i ; j++) {
			System.out.print(" ");
			
		}
		for (int j = i; j <= rows; j++) {
			System.out.print("*");
			
		}
		System.out.println();		
		
	}
}
	
	
	public static void main(String[] args) {
		
		//patternSimple();
		//patternSimple3();
		//patternSimple2();
		//patternSimple4();
		patternSimple5();
		
		
		
	}

}
