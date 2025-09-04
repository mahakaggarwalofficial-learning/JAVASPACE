package com.loops.whileLoop;

import java.util.Scanner;

public class PrintCountDigit {

	public static void main(String[] args) {


	//	Count the number of digits in a number.
		
		System.out.println("Enter the digit");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		
		int count =0 ;
		int n = Math.abs(digit);
		
		if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
		

	}

}
