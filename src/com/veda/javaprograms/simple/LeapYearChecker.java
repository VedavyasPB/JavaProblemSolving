package com.veda.javaprograms.simple;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a year: ");
			int year = scanner.nextInt();

			if (((year % 4) == 0) && ((year % 100) != 0) || year % 400 == 0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not a leap year!");
			}
		}
	}

}
