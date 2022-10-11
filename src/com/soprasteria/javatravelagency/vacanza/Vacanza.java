package com.soprasteria.javatravelagency.vacanza;

import java.time.LocalDate;

public class Vacanza {
	
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	public Vacanza(String destinazione) {
		super();
		if(destinazione.equals("")) {
			throw new NullPointerException("la destinazione non può essere nulla!");
		} else {
			this.destinazione = destinazione;
		}
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		if(destinazione.equals("")) {
			throw new NullPointerException("la destinazione non può essere nulla!");
		} else {
			this.destinazione = destinazione;
		}
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		if(dataInizio == null) {
			throw new NullPointerException("la data di inizio non può essere nulla!");
		} else {
			this.dataInizio = dataInizio;
		}
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		if(dataFine == null) {
			throw new NullPointerException("la data di fine non può essere nulla!");
		} else {
			this.dataFine = dataFine;
		}
	}

}
