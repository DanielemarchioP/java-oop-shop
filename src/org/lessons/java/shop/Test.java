package org.lessons.java.shop;

public class Test {

	public static void main(String[] args) {
		
		Prodotto televisore = new Prodotto("Samsung G44", "Schermo lcd 44 pollici", 100.00);
		
		televisore.nomeEsteso();
		
		System.out.println(televisore.getCodice()); 
		
		System.out.println(televisore.calcoloIva());
	}

}
