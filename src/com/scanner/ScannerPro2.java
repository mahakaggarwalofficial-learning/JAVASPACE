package com.scanner;

import java.util.Scanner;

public class ScannerPro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input: Three test scores
        System.out.print("Enter score 1: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter score 2: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter score 3: ");
        int score3 = scanner.nextInt();

        // Calculate average
        double average = (score1 + score2 + score3) / 3.0;

        // Output
        System.out.println("\nName: " + name);
        System.out.printf("Average: %.2f\n", average);

        if (average >= 40) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        scanner.close();
    }
}
