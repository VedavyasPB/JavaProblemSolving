package com.veda.javaprograms.simple;

import java.util.Scanner;

public class SpecialNumberIdentifier {
//	public static int sum(int num) {
//		int temp, sum = 0;
//		while (num != 0) {
//			temp = num % 10;
//			num = num / 10;
//			sum += temp;
//		}
//		return sum;
//	}
//
//	public static int product(int num) {
//		int temp, product = 1;
//		while (num != 0) {
//			temp = num % 10;
//			num = num / 10;
//			product *= temp;
//		}
//		return product;
//	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int digit1, digit2, value = scanner.nextInt(), result;
			digit1 = value % 10;
			digit2 = value / 10;
			result = (digit1 + digit2) + (digit1 * digit2);
			System.out.println(result == value ? "Special number" : "Not a special number");

		}
	}
}
