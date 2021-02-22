package com.salahbkd.fundmentales;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		fizzBuzz();
	}

	private static void fizzBuzz() {
		int value = 0;
		int attempt = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("entrer une valeur entre 1-100: ");
		value = scanner.nextInt();
		
		while (value > 100 || value <= 0) {
			if(attempt == 2)
				return;
			System.out.println("entrer une valeur entre 1-100: ");
			value = scanner.nextInt();
			attempt++;
		}

		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " - FizzBuzz");
			} else if (i % 5 == 0)
				System.out.println(i + " - Buzz");
			else if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " - FizzBuzz");
			}
		}

	}

}
