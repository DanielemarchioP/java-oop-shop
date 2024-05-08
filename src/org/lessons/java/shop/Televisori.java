package org.lessons.java.shop;

public class Televisori extends Prodotto {

	int polliciTv;
	boolean smart;
	
	public Televisori(String nome, String descrizione, Double prezzo, int polliciTv, boolean smart) {
	super(nome, descrizione, prezzo);
	
	this.polliciTv= polliciTv;
	this.smar = smart;
	}
}
