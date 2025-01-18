package com.veda.javaprograms.simple;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			int arr[] = new int[10];
			int count = 0;

			while (number != 0) {
				arr[count] = number % 2;
				number = number / 2;
				count++;
			}

			for (int i = count - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
