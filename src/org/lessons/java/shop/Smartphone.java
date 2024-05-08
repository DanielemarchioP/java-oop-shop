package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	long imei;
	int memoriaInterna;
	
	public Smartphone (String nome, String descrizione, Double prezzo, long imei, int memoriaInterna){
		super (nome,descrizione,prezzo);
		
		this.imei = imei;
		this.memoriaInterna = memoriaInterna;
	}
	
}
