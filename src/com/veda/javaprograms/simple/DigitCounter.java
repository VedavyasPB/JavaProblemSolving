package com.veda.javaprograms.simple;

import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int temp, count = 0, num1 = scanner.nextInt();
			System.out.println("Enter a digit: ");
			int digit = scanner.nextInt();

			while (num1 != 0) {
				temp = num1 % 10;
				num1 = num1 / 10;
				if (temp == digit) {
					count++;
				}
			}
			System.out.println("Number of occurences of provided digit " + digit + " is " + count);
		}
	}
}
