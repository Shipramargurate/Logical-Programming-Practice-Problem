package com.bridgelabz.logicalprob;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		int number = 0;
		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter any number : "); //  eg : 4/4=0
		int num = sc.nextInt();
		for (int i = 1; i < number; i++) { // logic for prime number starts from here
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("PRIME NUMBER");
		else
			System.out.println("NOT A PRIME NUMBER");

	}

}
