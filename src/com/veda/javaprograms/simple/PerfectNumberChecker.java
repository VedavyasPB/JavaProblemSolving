package com.veda.javaprograms.simple;

import java.util.Scanner;

public class PerfectNumberChecker {
	public static int isPerfectNumber(int num) {
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			System.out.println(isPerfectNumber(num) == num ? "Perfect Number" : "Not a perfect number");
		}

	}
}
