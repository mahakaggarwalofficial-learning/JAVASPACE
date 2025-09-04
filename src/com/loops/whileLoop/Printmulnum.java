package com.loops.whileLoop;

public class Printmulnum {

	public static void main(String[] args) {

		
		//Print the product (multiplication) of numbers from 1 to 10
		
		int i =1 ;
		int product = 1 ; 
		
		while(i<=10)
		
		{
			product *= i;
			i++;
		}
		System.out.println("The multi of numbers from 1 to 10 is: " + product);
	}

}
