package no.hvl.dat102;

import no.hvl.dat102.adt.CDArkivADT;

public class CDArkiv implements CDArkivADT {

	// Objektvariabler
	private CD[] cdTabell;
	private int antall;
	
	// Konstruktør
	public CDArkiv(int antall) {
		cdTabell = new CD[antall];
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
	
	@Override
	public CD[] hentCdTabell() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void leggTilCd(CD nyCd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean slettCd(int nummer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public CD[] sokTittel(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CD[] sokArtist(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int antallSjanger(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
}
