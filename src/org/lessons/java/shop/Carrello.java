package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Scegli il tuo prodotto");
		System.out.println("Smartphone \n");
		System.out.println("Televisore \n");
		System.out.println("Cuffie \n");
		
		String sceltaUtente = s.next();
		
		System.out.println("\n" + sceltaUtente);

		switch (sceltaUtente) {
		case "smartphone":
			
			Smartphone telefono = new Smartphone();
			telefono.setNome(s.next());
			s.nextLine();
			telefono.setDescrizione(s.nextLine());
			telefono.setImei(s.nextLong());
			telefono.setMemoriaInterna(s.nextInt());
			s.nextLine();
			telefono.setPrezzo(s.nextDouble());
			
			 System.out.println(telefono.toString());
			 break;
		case "cuffie":
			
			Cuffie modello = new Cuffie();
			modello.setNome(s.next());
			s.nextLine();
			modello.setDescrizione(s.nextLine());
			modello.setColore(s.next());
			modello.setWireless(s.nextBoolean());
			s.nextLine();
			modello.setPrezzo(s.nextDouble());
			
			 System.out.println(modello.toString());
			 break;
			 
		case "televisore":
			
			Televisori asus = new Televisori();
			System.out.println("Inserisci il nome del prodotto");
			asus.setNome(s.next());
			s.nextLine();
			System.out.println("Inserisci descrizione del prodotto");
			asus.setDescrizione(s.nextLine());
			System.out.println("Inserisci i pollici  del televisore");
			asus.setPolliciTv(s.nextInt());
			System.out.println("smart false\true");
			asus.setSmart(s.nextBoolean());
			System.out.println("Inserisci il prezzo del televisore");
			s.nextLine();
			asus.setPrezzo(s.nextDouble());
			
			 System.out.println(asus.toString());
			 break;
		}
	}

}
