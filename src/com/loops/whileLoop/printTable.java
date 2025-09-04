package com.loops.whileLoop;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {

		
		//Print the table of a number (user input).

		int i =1 ;
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num * i);
			i++;
			
		}
	}

}
