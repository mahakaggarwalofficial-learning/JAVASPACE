package com.loops.whileLoop;

import java.util.Scanner;

public class printnumtoN {

	public static void main(String[] args) {

		
		
		///Print numbers from 1 to N (N is user input).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		
		int j = 1; 
		while(j<=i)
		{
			System.out.println(j);
			j++;
		}
		
		

	}

}
