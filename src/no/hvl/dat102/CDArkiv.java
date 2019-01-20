package no.hvl.dat102;

import no.hvl.dat102.adt.CDArkivADT;

public class CDArkiv implements CDArkivADT {

	// Objektvariabler
	private CD[] cdTabell;
	private int antall;
	private int lengde;
	
	// Konstruktør
	public CDArkiv(int antall) {
		cdTabell = new CD[lengde];
		this.antall = antall;
		
	}

	// Getters/Setters
	public CD[] getCdTabell() {
		return cdTabell;
	}

	public void setCdTabell(CD[] cdTabell) {
		this.cdTabell = cdTabell;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}


	//Metoder
	
	//
	@Override
	public CD[] hentCdTabell() {
		return cdTabell;
	}
	
	// Legger til CD i tabell
	@Override
	public void leggTilCd(CD nyCd) {
		this.antall = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i] == null) {
				cdTabell[i] = nyCd;
			}
			antall++;
		}
	}
	
	// Sletter CD gitt ved nummer på CD'en
	@Override
	public boolean slettCd(int nummer) {
		boolean slettet = false;
		for (int i = nummer; i < antall() - 1 ; i++) {
			cdTabell[i] = cdTabell[i + 1];
		}
		cdTabell[antall() - 1] = null;
		slettet = true;
		
		return slettet;			
	}

	// Returnerer CD'er med en gitt tittel
	@Override
	public CD[] sokTittel(String substring) {
		// Finner størrelse på tabell med resultater
		int newSize = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i].getTittel() == substring) {
				newSize++;
			}
		}
		// Lager resultattabell og legger inn resultater
		int index = 0;
		CD[] sokTittelTabell = new CD[newSize];
			for (int i = 0; i < cdTabell.length; i++) {
				if (cdTabell[i].getTittel() == substring) {
					cdTabell[i] = sokTittelTabell[index];
					index++;
				}
			}
			return sokTittelTabell;
	}
	
	// Returnerer CD'er av en gitt artist
	@Override
	public CD[] sokArtist(String substring) {
		// Finner størrelse på tabell med resultater
		int newSize = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i].getArtist() == substring) {
				newSize++;
			}
		}
		// Lager resultattabell og legger inn resultater
		int index = 0;
		CD[] sokArtistTabell = new CD[newSize];
			for (int i = 0; i < cdTabell.length; i++) {
				if (cdTabell[i].getArtist() == substring) {
					cdTabell[i] = sokArtistTabell[index];
					index++;
				}
			}
			return sokArtistTabell;
	}
	
	// Returnerer antall CD'er av en gitt sjanger
	@Override
	public int antallSjanger(Sjanger sjanger) {
		int antallCD = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i].getSjanger() == sjanger) {
				antallCD++;
			}
		}
		return antallCD;
	}
	
	// Returnerer antall CD'er i tabellen
	@Override
	public int antall() {
		int antallCD = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i] != null) {
				antallCD++;
			}
		}
		return antallCD;
	}
}
