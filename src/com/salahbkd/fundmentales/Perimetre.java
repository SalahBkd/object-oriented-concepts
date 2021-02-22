package com.salahbkd.fundmentales;

import java.util.Scanner;

public class Perimetre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float rayon;
		float perimetreResult;
		float surfaceResult;
		
		System.out.println("quel est le rayon du cercle ?");
		rayon = scanner.nextFloat();
		perimetreResult = (float) (2 * 3.14 * rayon);
		surfaceResult = (float)(3.14*(rayon*2));
		
		System.out.println("le périmetre du cercle de rayon " + rayon + " est " + perimetreResult + " sont surface: " + surfaceResult);
	}
}
