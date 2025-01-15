package com.veda.javaprograms.simple;

import java.util.Scanner;

public class SumOfEvenDigits {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int temp, sum = 0, num = scanner.nextInt();

			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				if (temp % 2 == 0) {
					sum += temp;
				}
			}
			System.out.println("Sum of the digts is: " + sum);
		}
	}
}
