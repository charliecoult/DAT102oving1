package no.hvl.dat102;

import no.hvl.dat102.adt.CDArkivADT;

public class CDArkivKlient {

	public static void main(String[] args) {
		CDArkivADT cda = new CDArkiv(20);
		Meny meny = new Meny(cda);
	}

}
