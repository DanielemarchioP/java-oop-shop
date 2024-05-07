package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private Double prezzo;
	private Float iva;
	
		public Prodotto (String nome, String descrizione, Double prezzo) {
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
			this.iva = 0.22F;
			this.codice= codiceRandom();
		}
		
		private int codiceRandom() {
			Random numRandom = new Random();
			 return numRandom.nextInt(1000);
		}
		
		
		
		public Double calcoloIva() {
			return prezzo + (prezzo*iva);
		}
		
		
		public void nomeEsteso() {
			System.out.println("Il nome esteso del prodotto e " + codice + " " + nome);
		}
		
		
		
		
		public int getCodice() {
			return codice;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public Double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(Double prezzo) {
			this.prezzo = prezzo;
		}

		public Float getIva() {
			return iva;
		}

		public void setIva(Float iva) {
			this.iva = iva;
		}
		
}
