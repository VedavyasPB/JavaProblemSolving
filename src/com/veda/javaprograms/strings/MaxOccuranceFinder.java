package com.veda.javaprograms.strings;

import java.util.Iterator;
import java.util.Scanner;

public class MaxOccuranceFinder {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a line: ");
			String s = scanner.nextLine();
			int arr[] = new int[256];

			for (int i = 0; i < s.length(); i++) {
				arr[(int) s.charAt(i)]++;
			}

			int m = 0;

			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > arr[m]) {
					m = j;
				}
			}
			System.out.println("The max occuring character is: " + (char) m);
		}
	}

}
