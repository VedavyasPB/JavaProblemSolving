package com.veda.javaprograms.strings;

import java.util.Scanner;

public class WordCounterSecondWay {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a String: ");
			String input = scanner.nextLine();
			System.out.println("count: " + (input.split(" ").length));
		}

	}
}
