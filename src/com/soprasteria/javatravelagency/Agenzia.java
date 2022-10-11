package com.soprasteria.javatravelagency;

import java.time.LocalDate;
import java.util.Scanner;

import com.soprasteria.javatravelagency.vacanza.Vacanza;

public class Agenzia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String destinazione;
		int giorno, mese, anno;
		boolean altraDestinazione;
		Vacanza v;
		
		do {
			System.out.print("Vuoi inserire un'altra destinazione?: ");
			altraDestinazione = s.nextBoolean();s.nextLine();
			if(!altraDestinazione) {
				break;
			} else {
				try {
					System.out.print("Inserire la destinazione: ");
					destinazione = s.nextLine();
					if(destinazione.equals("")) {
						destinazione = null;
					}
					v = new Vacanza(destinazione);
					System.out.println("Data d'inizio: ");
					System.out.print("Giorno: ");
					giorno = s.nextInt();s.nextLine();
					System.out.print("Mese: ");
					mese = s.nextInt();s.nextLine();
					System.out.print("Anno: ");
					anno = s.nextInt();s.nextLine();
					v.setDataInizio(LocalDate.of(anno, mese, giorno));
					System.out.println("Data di fine: ");
					System.out.print("Giorno: ");
					giorno = s.nextInt();s.nextLine();
					System.out.print("Mese: ");
					mese = s.nextInt();s.nextLine();
					System.out.print("Anno: ");
					anno = s.nextInt();s.nextLine();
					v.setDataFine(LocalDate.of(anno, mese, giorno));
					System.out.println(v);
				} catch(Exception e) {
					System.err.println(e.getMessage());
					System.err.println("Ripetere l'inserimento...\n");
				} 
			}
		} while(true);
		
		s.close();
	}

}
