package com.veda.javaprograms.simple;

public class SpecialTwoDigitNumberPrinter {

	public static void main(String[] args) {
		int num = 10;
		int digit1, digit2, result;
		while (num <= 99) {
			digit1 = num % 10;
			digit2 = num / 10;
			result = (digit1 + digit2) + (digit1 * digit2);
			if (result == num) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
