package com.veda.javaprograms.simple;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int temp, num = scanner.nextInt();

			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				System.out.print(temp + " ");
			}
		}
	}

}
