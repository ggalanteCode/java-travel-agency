package com.soprasteria.javatravelagency.vacanza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Vacanza {
	
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	public Vacanza(String destinazione) throws Exception {
		super();
		if(destinazione.equals(null)) {
			throw new Exception("la destinazione non può essere nulla!");
		} else {
			this.destinazione = destinazione;
		}
	}

	public String getDestinazione() {
		return destinazione;
	}
	
	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) throws Exception {
		if(dataInizio == null) {
			throw new Exception("la data di inizio non può essere nulla!");
		} else if(dataInizio.isBefore(LocalDate.now())) {
			throw new Exception("la data di inizio è già passata!");
		} else {
			this.dataInizio = dataInizio;
		}
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine)  throws Exception {
		if(dataFine == null) {
			throw new Exception("la data di fine non può essere nulla!");
		} else if(dataFine.isBefore(this.dataInizio)) {
			throw new Exception("la data di fine è prima della data d'inizio!");
		} else {
			this.dataFine = dataFine;
		}
	}
	
	private long durataInGiorniVacanza() {
		return ChronoUnit.DAYS.between(this.dataInizio, this.dataFine);
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Hai prenotato una vacanza di " + durataInGiorniVacanza() + 
				" giorni a " + getDestinazione() + " dal " + 
				getDataInizio().format(dtf) + " al " + getDataFine().format(dtf);
	}

}
