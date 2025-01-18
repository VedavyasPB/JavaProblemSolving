package com.veda.javaprograms.simple;

import java.util.Scanner;

public class FibonacciSeriesGenerator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt(), num1 = 0, num2 = 1, num3;
			System.out.print(num1 + " " + num2);
			for (int i = 2; i < number; i++) {
				num3 = num1 + num2;
				System.out.print(" " + num3);
				num1 = num2;
				num2 = num3;

			}
		}
	}

}
