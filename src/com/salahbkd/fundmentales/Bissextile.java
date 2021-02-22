package com.salahbkd.fundmentales;

import java.util.Scanner;

public class Bissextile {
	public static void main(String[] args) {
		
		int year;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("entrer une année: ");
			year = scanner.nextInt();
			
			if(year < 0 || year == 0) 
				System.out.println("l'année n'est pas valide !!");
			else {
				if(isBissextile(year))
					System.out.println("l'année est bissextile");
				else {
					System.out.println("l'année n'est pas bissextile");
				}
			}
		}
		
	}

	private static boolean isBissextile(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
 		} else {
 			return false;
 		}
	}
}