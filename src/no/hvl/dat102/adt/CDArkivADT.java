package no.hvl.dat102.adt;

import no.hvl.dat102.CD;
import no.hvl.dat102.Sjanger;

public interface CDArkivADT {

	// Returnerer en tabell av CD'er
	CD[] hentCdTabell();
	
	// Legger til en ny CD
	void leggTilCd(CD nyCd);
	
	// Sletter en CD hvis den allerede finnes
	boolean slettCd(int nummer);
	
	// Søker og henter CD'er med en gitt delstreng
	CD[] sokTittel(String substring);
	
	// Søker og henter artister med en gitt delstreng
	CD[] sokArtist(String substring);
	
	// Henter antall CD'er i en gitt sjanger
	int antallSjanger(Sjanger sjanger);
	
	// Returnerer antall CD'er
	int antall();
	
}
