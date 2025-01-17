package com.veda.javaprograms.simple;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int temp, num = scanner.nextInt(), result = 0;
			int actualNumber = num;

			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				result = result * 10 + temp;
			}
			if (actualNumber == result) {
				System.out.println("Given number is palindrome");
			} else {
				System.out.println("Not a palindrome");
			}
		}
	}

}
