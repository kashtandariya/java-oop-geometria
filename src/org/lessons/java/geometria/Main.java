package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo:");
		int base = scan.nextInt();
		
		System.out.println("Inserisci l'altezza del rettangolo:");
		int altezza = scan.nextInt();
		
		//istanza della classe rettangolo
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		//calcolo finale invocando i metodi
		System.out.println("L'area del rettangolo corrisponde a" + rettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo corrisponde a" + rettangolo.calcolaPerimetro());		
		
		scan.close();
	}
}
