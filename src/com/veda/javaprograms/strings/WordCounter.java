package com.veda.javaprograms.strings;

import java.util.Scanner;
import javax.print.DocFlavor.INPUT_STREAM;

public class WordCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		System.out.println("The number of words in the given string is: " + (count + 1));

	}

}
