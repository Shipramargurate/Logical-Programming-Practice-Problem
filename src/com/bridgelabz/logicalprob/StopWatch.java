package com.bridgelabz.logicalprob;

import java.util.Scanner;

//Simulate Stop watch Program

public class StopWatch {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); //This method returns the current value of the system timer in nanoseconds
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to start : ");
		int start = sc.nextInt();

		long endTime = System.nanoTime();
		System.out.println("Enter any number to stop : ");
		int end = sc.nextInt();

		System.out.println("stop wtach time toook " + (startTime - endTime / 1000000000) + " seconds to finish");

	}

}
