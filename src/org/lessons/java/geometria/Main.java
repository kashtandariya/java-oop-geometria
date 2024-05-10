package org.lessons.java.geometria;

import java.util.Scanner;

import 

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo:");
		String baseRettangolo = scan.nextLine();
		
		System.out.println("Inserisci l'altezza del rettangolo:");
		String altezzaRettangolo = scan.nextLine();
		
		scan.close();
	}
}
