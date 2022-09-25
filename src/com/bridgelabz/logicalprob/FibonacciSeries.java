package com.bridgelabz.logicalprob;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Fibonacci series is a special type of series in which the next term is the
		 * sum of the previous two terms.
		 */
		int firstTerm = 0;
		int secondTerm = 1;

		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter the number you want to print for fibonacci series : ");
		int term = sc.nextInt();
		System.out.println("Fibonacci series till " + term + " is : ");
		for (int i = 1; i <= term; i++) {
			System.out.println(firstTerm);
			int nextTerm = firstTerm + secondTerm; // computation logic for fibonacci series
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
