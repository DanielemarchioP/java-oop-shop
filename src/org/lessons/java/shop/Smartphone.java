package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	long imei;
	int memoriaInterna;
	
	public Smartphone (String nome, String descrizione, Double prezzo, long imei, int memoriaInterna){
		super (nome,descrizione,prezzo);
		
		this.imei = imei;
		this.memoriaInterna = memoriaInterna;
	}

	public Smartphone() {
		super();
		imei = 0;
		memoriaInterna = 0;
	}
	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}

	@Override
	public String toString() {
		
		return super.toString() + " imei=" + imei + ", memoriaInterna=" + memoriaInterna + "";
	}
	}

