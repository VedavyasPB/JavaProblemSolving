package com.veda.javaprograms.simple;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class PalindromeCheckerSecondWay {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			String number = scanner.next();

			StringBuffer sb = new StringBuffer(number);
			String reversed = sb.reverse().toString();
			System.out.println(number.equalsIgnoreCase(reversed) ? "It is palindrome" : "Not a palindrome");
		}

	}
}
