package com.veda.javaprograms.simple;

import java.util.Scanner;

public class DuckNumberChecker {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			boolean isDuck=false;

			while (num != 0) {
				if(num%10==0) {
					isDuck=true;
					break;
				}
				num = num / 10;
			}
			if(isDuck==true) {
				System.out.println("Duck Number");
			}else {
				System.out.println("Not a duck number");
			}
			
		}
	}
}
