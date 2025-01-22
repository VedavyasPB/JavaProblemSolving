package com.veda.javaprograms.simple;

import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int digit, num = scanner.nextInt();
			int temp = num, sum = 0;
			while (num != 0) {
				digit = num % 10;
				num = num / 10;
				sum += digit * digit * digit;
			}
			System.out.println(sum == temp ? "Armstrong Number" : "Not an armstrong number");
		}
	}

}
