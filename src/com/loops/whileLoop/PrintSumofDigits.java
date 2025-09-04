package com.loops.whileLoop;

import java.util.Scanner;

public class PrintSumofDigits {

	public static void main(String[] args) {


		//Find the sum of digits in a number.

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		
		int n = Math.abs(number);
		int sum =0; 
		
		
		
		while (n > 0) {
            int digit = n % 10;    // Get the last digit
            sum += digit;          // Add it to sum
            n = n / 10;            // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
	}

}
