package com.veda.javaprograms.simple;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a credit score: ");
			int creditScore = scanner.nextInt();

//		if (creditScore >= 400 && creditScore <= 600) {
//			System.out.println("Silver Card");
//		} else if (creditScore >= 600 && creditScore <= 800) {
//			System.out.println("Gold Card");
//		} else if (creditScore >= 800 && creditScore <= 850) {
//			System.out.println("Platinum Card");
//		} else {
//			throw new IllegalArgumentException("Invalid credit score");
//		}

			if (creditScore < 400 || creditScore > 850) {
				throw new IllegalArgumentException("Invalid credit score");
			} else if (creditScore >= 400 && creditScore <= 600) {
				System.out.println("Silver Card");
			} else if (creditScore >= 600 && creditScore <= 800) {
				System.out.println("Gold Card");
			} else {
				System.out.println("Platinum card");
			}
		}

	}

}
