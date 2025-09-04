package com.scanner;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {

		
		System.out.println("Start of main method");
		System.out.println("Start of scanner class");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Addition of two numbers");
			System.out.println("Enter first number");
			
			int num1 = sc.nextInt();
			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			
			int num3 = num1 +num2; 
			
			
			System.out.println(" Additon of " + num1 + " and " + num2 + " = " + (num3));
		} 

		

		
		

	
		
	}

}
