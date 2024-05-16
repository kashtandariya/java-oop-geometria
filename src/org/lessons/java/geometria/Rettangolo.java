package org.lessons.java.geometria;

public class Rettangolo {
	private int base;
	private int altezza;

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
	
	/*per disegnare il rettangolo, si fa un ciclo for innestato in un altro ciclo for.
	Partiamo dall'altezza, nel senso che la prendiamo come punto di partenza e per
	ogni punto orizzontale dell'altezza all'indice 1 che stiamo seguendo
	disegniamo un segno deciso da noi per la base oppure inseriamo uno spazio.
	Mano a mano che andiamo avanti, finiti i punti della base nella riga all'altezza indice 1, andremo alla riga 
	all'altezza indice 2 e così via fino alla fine.
	
	Mettiamo quindi delle condizioni if/else ecc in questi cicli for
	*/
	public void disegna () {
		for (int i = 1; i <= this.altezza; i++) {
			
			for (int y = 1; y <= this.base; y++) {
				
				if (i == 1 || i == this.altezza) {
					System.out.print("* ");
					
				} else if (y == 1 || y == this.base) {
					System.out.print("* ");
					
				} else {
					System.out.print("  ");
				}
				
				if (y == this.base) {
					System.out.print("\n");
				}
			}
		}
	}
}
