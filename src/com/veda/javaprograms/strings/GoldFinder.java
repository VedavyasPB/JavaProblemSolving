package com.veda.javaprograms.strings;

import java.util.Scanner;

public class GoldFinder {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a line: ");
			String s1 = scanner.nextLine();
			String s2 = "gold";
			boolean found = false;

			s1 = s1.toLowerCase();

			for (int i = 0; i < s1.length(); i++) {
				int k = i, j = 0;
				for (j = 0; j < s2.length(); j++) {
					if (s1.charAt(k) != s2.charAt(j)) {
						break;
					}
					k++;
				}
				if (j == s2.length()) {
					found = true;
				}
			}
			System.out.println(found == true ? "Gold is found" : "gold not found");

		}
	}
}
