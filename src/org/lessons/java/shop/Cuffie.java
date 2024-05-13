package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	String colore;
	boolean wireless;
	
	
	public Cuffie(String nome, String descrizione, Double prezzo, String colore, boolean  wireless) {
		
		super(nome, descrizione, prezzo);
			
			this.colore = colore;
			this.wireless = wireless;
		
	}


	public Cuffie() {
		super();
		colore = null;
		wireless = true;
	}


	public String getColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}


	public boolean isWireless() {
		return wireless;
	}


	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}


	@Override
	public String toString() {
		return super.toString() + "Cuffie [colore=" + colore + ", wireless=" + wireless + "]";
	}

}
