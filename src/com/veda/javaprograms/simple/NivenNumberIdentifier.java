package com.veda.javaprograms.simple;

import java.util.Scanner;

public class NivenNumberIdentifier {
	public static int sum(int num) {
		int temp, sum = 0;
		while (num != 0) {
			temp = num % 10;
			num = num / 10;
			sum += temp;
		}
		return sum;
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int value = scanner.nextInt();
			System.out.println(value % sum(value) == 0 ? "Niven number" : "Not a Niven number");

		}
	}
}
