package com.veda.javaprograms.simple;

import java.util.Scanner;

public class StringReversor {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int temp, num = scanner.nextInt(), result = 0;

			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				result = result * 10 + temp;
			}
			System.out.println("The reversed result is: " + result);
		}
	}

}
