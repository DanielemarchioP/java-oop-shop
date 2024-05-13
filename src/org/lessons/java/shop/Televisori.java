package org.lessons.java.shop;

public class Televisori extends Prodotto {

	int polliciTv;
	boolean smart;
	
	public Televisori(String nome, String descrizione, Double prezzo, int polliciTv, boolean smart) {
	super(nome, descrizione, prezzo);
	
	this.polliciTv= polliciTv;
	this.smart = smart;
	}

	public int getPolliciTv() {
		return polliciTv;
	}

	public void setPolliciTv(int polliciTv) {
		this.polliciTv = polliciTv;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public Televisori() {
		super();
	}

	@Override
	public String toString() {
		  return super.toString() +  "Televisori [polliciTv=" + polliciTv + ", smart=" + smart + "]";
	}
	
}
