package com.controlStatement.condition.ifstatement;

import java.util.Scanner;

public class ifElseCondition {

	public static void main(String[] args) {
		
		System.out.println("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		System.out.println("Enter the Gender (M/F): ");
		String gen = sc.next();
		
		if ((age >= 18 && gen.equalsIgnoreCase("F")) || (age >= 21 && gen.equalsIgnoreCase("M"))) {
			System.out.println("You are eligible for marriage.");
		} else {
			System.out.println("You are not eligible for marriage.");
		}
		
		sc.close(); // Always a good practice to close Scanner
	}
}
