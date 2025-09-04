package com.controlStatement.condition.ifstatement;

import java.util.Scanner;

public class ifCondition {

	public static void main(String[] args) {

		
		
		System.out.println("Enter the age : ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Welcome to the world");
		}
		
		System.out.println("Thanks for your time"); 
		
		
	}

}
