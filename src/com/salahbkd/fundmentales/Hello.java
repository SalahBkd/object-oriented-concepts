package com.salahbkd.fundmentales;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
//		int add, sub, mul, div, mod;
		int num1 = 5, num2 = 8;
//		
//		add = num1 + num2;
//		sub = num1 - num2;
//		mul = num1 * num2;
//		div = num1 / num2;
//		mod = num1 % num2;
//		
//		System.out.println("addition num1+num2: " + add);
//		System.out.println("substraction num1-num2: " + sub);
//		System.out.println("multiplication num1+num2: " + mul);
//		System.out.println("division num1+num2: " + div);
//		System.out.println("modulus num1+num2: " + mod);
//		
//		int a = 5;
//		int b = 3;
//		int c = a * b++;
//		int d = a * ++b;
//		System.out.println(c + " " + d);
//		
//		System.out.println("the value returned when num1 != num2 is checked " + (num1 != num2));
		
//		Scanner scanner = new Scanner(System.in);
//		String cours;
//		String etudiant;
//		
//		System.out.println("nom etudiant: ");
//		System.out.println("nom du cours: ");
//		
//		etudiant = scanner.next();
//		cours = scanner.next();
//		
//		if(etudiant.equals("salah") && cours.equals(("java"))) 
//			System.out.println("inscription reussite !!");
//		else
//			System.err.println("les valeures sont invalides"); 
//		
//		System.out.println("nom etudiant: ");
//		System.out.println("nom du cours: ");
//		
//		etudiant = scanner.next();
//		cours = scanner.next();
//		
//		if(etudiant.equals("toto") || cours.equals(("Python"))) 
//			System.out.println("inscription en cours !!");
//		else
//			System.err.println("les valeures sont invalides"); 
		
//		num1 += 5;
//		System.out.println("num1 -= 5 = " + num1);
//		num1 -= 5;		
//		System.out.println("num1 -= 5 = " + num1);
		
		
		// implicit vs explicit casting
//		byte b = 1;
//		b++;
//		b = (byte)(b + 1);
//		System.out.println(b);
		
		//exercice 1
		Scanner scanner = new Scanner(System.in);
		float rayon;
		float perimetreResult;
		float surfaceResult;
		
		while(true) {
			System.out.println("quel est le rayon du cercle ?");
			rayon = scanner.nextFloat();
			perimetreResult = (float) (2 * 3.14 * rayon);
			surfaceResult = (float)(3.14*(rayon*2));
			
			System.out.println("le périmetre du cercle de rayon " + rayon + " est " + perimetreResult + " sont surface: " + surfaceResult);
		}
	
		
		
		
	}

}
