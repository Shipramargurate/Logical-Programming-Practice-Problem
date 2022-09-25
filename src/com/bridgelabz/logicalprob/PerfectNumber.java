package com.bridgelabz.logicalprob;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		/*
		 * When the number is equal to the sum of its positive divisors excluding the
		 * number, it is called a Perfect Number.
		 */
		int sum = 0;
		Scanner sc = new Scanner(System.in); // scanner input
		int number = sc.nextInt();                
		for (int i = 1; i < number; i++) {  // logic for perfect number
			if (number % i == 0)
				sum = sum + i;
		}
		if (number == sum)
			System.out.println("PERFECT NUMBER");
		else
			System.out.println("NOT PERFECT NUMBER");
	}

}
