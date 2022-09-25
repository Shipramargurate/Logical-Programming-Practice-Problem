package com.bridgelabz.logicalprob;

import java.util.Scanner;

public class ReverseNumber {

	// program to reverse a number

	public static void main(String[] args) {
		int rev = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to reverse : ");
		int num = sc.nextInt();

		while (num > 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println("Reverse Number is : " + rev);
		sc.close();
	}

}
