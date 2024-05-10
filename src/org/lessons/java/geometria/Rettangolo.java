package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return 2 * (base+altezza);
	}
}
