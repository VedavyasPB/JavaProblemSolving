package com.veda.javaprograms.strings;

import java.util.Scanner;

public class StringEndChecker {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first word: ");
			String s1 = scanner.next();
			System.out.println("Enter second word: ");
			String s2 = scanner.next();
			int count = 0;

			for (int i = s1.length() - 1, j = s2.length() - 1; j >= 0; i--, j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					count++;
				}
			}
			System.out.println(count == s2.length() ? "ends with second" : "doesn't end with second");
		}

	}

}
