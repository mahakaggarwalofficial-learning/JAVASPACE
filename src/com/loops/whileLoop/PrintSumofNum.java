package com.loops.whileLoop;

public class PrintSumofNum {

	public static void main(String[] args) {

		
		//Print the sum of numbers from 1 to 100.
		
		int i = 1; 
		int sum =0; 
		
		while(i<=100)
		{
			sum += i;
            i++;
		}

		System.out.println("The sum of numbers from 1 to 100 is: " + sum);
	}

}
