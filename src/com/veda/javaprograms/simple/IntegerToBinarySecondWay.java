package com.veda.javaprograms.simple;

import java.util.Scanner;

public class IntegerToBinarySecondWay {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();

			System.out.println("The binary form of given number is: " + Integer.toBinaryString(number));
		}
	}

}
