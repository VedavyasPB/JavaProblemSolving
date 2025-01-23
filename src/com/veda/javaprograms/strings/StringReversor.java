package com.veda.javaprograms.strings;

import java.util.Scanner;

public class StringReversor {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a String: ");
			String input = scanner.next(), output = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
			System.out.println(output);
			StringBuffer sb = new StringBuffer(input);
			System.out.println(sb.reverse());
		}
	}

}
