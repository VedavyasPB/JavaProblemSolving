package com.veda.javaprograms.strings;

import java.util.Scanner;

public class StringEndCheckerSecondWay {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first word: ");
			String s1 = scanner.next();
			System.out.println("Enter second word: ");
			String s2 = scanner.next();
			System.out.println(s1.endsWith(s2) ? "s1 ends with s2" : "s1 doesn't end with s2");
		}
	}

}
