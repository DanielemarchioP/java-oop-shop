package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	String colore;
	boolean wireless;
	
	
	public Cuffie(String nome, String descrizione, Double prezzo, String colore, boolean  wireless) {
		
		super(nome, descrizione, prezzo);
			
			this.colore = colore;
			this.wireless = wireless;
		
	}

}
