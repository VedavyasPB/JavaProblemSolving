package com.veda.javaprograms.simple;

import java.util.Scanner;

public class PrimeNumberPrinter {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a start: ");
			int start = scanner.nextInt();
			System.out.println("Enter an end: ");
			int end = scanner.nextInt();

			boolean isPrime = true;

			for (int i = start; i <= end; i++) {
				isPrime = true;
				if (i > 1) {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							isPrime = false;
							break;
						}

					}
					if (isPrime == true) {
						System.out.print(i + " ");
					}
				}

			}

		}
	}
}
