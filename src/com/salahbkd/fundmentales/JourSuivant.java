package com.salahbkd.fundmentales;

import java.util.Scanner;

public class JourSuivant {
	
	public static void main(String[] args) {
		int day, month, year;
		int nextDay, nextMonth, nextYear;
		boolean isValide;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter le jour: ");
		day = scanner.nextInt();
		
		System.out.println("enter le mois: ");
		month = scanner.nextInt();
		
		System.out.println("enter l'année: ");
		year = scanner.nextInt();
		
		if(isValid(day, month, year)) {
			System.out.println("oui c valide");
		} else {
			System.out.println("non valide");
		}
	}

	private static boolean isValid(int day, int month, int year) {
		boolean isValid = false;
		if(year < 1582) {
			isValid = false;
		} else {
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					&& (day > 0 && day < 31)) {
				isValid = true;
			} else {
				if((month == 4 || month == 6 || month == 9 || month == 11)
						&& (day > 0 && day < 31)) {
					isValid = true;
				} else {
					if(month == 2) {
						if(isBissextile(year)
							&& (day > 0 && day < 29)) {
							isValid = true;
						} else if(day > 0 && day < 28) {
							isValid = true;
						} else {
							isValid = false;
						}
					}
				}
			}
		}
		return isValid;
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
