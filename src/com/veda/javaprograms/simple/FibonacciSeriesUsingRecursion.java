package com.veda.javaprograms.simple;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	public int fibonacciMethod(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacciMethod(n - 1) + fibonacciMethod(n - 2);
	}

	public static void main(String[] args) {
		FibonacciSeriesUsingRecursion fibo = new FibonacciSeriesUsingRecursion();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(fibo.fibonacciMethod(i) + " ");
		}
	}

}
