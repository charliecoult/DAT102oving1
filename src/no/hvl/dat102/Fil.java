package no.hvl.dat102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import no.hvl.dat102.adt.CDArkivADT;

public class Fil {

	private static final String SKILLE = "#";
	
	public static void lesFraFil(CDArkivADT cdarkiv, String filnavn)  {
		CDArkivADT cda = null;
			try {
				// 1 - Sørger for at innlesingen tolkes riktig
				FileReader CDFil = new FileReader(filnavn);
					
				/*
				 *  2 - Definerer en BufferedReader som kobles til FileReader.
				 *  Dette gjør at man kan bruke readLine() for å lese en linje
				 */
				BufferedReader innfil = new BufferedReader(CDFil);
				
				/*
				 * 2 - Leser den første linjen som inneholder
				 * heltall som beskriver antall info-poster
				 */
				String linje = innfil.readLine();
				int n = Integer.parseInt(linje);
				cda = new CDArkiv(n);
				
				// 3 - Leser hele postene, en hel post om gangen
				for (int i = 0; i < n; i++) {
					String post = innfil.readLine();
					String[] felt = post.split(SKILLE);
					int nr = Integer.parseInt(felt[0]);
					String artist = felt[1];
					String tittel = felt[2];
					int aar = Integer.parseInt(felt[3]);
					String sjStr = felt[4];
					Sjanger sj = Sjanger.finnSjanger(sjStr);
					String plselskap = felt[5];

					CD cd = new CD(nr, artist, tittel, aar, sj, plselskap);
					cda.leggTilCd(cd);
				}
				// 4 - Lukker filen
				innfil.close();
				
			} catch (FileNotFoundException unntak) {
				System.out.println("Finner ikke filen " + filnavn);
				System.exit(1);
			
			} catch (IOException e) {
				System.out.println("Feil ved lesing av fil: " + e);
				System.exit(2);
		}	 
	}
	
	public static void skrivTilFil(CDArkivADT cdarkiv, String filnavn)  {
		try {
			/* 1 - FileWriter
			 * Definerer en FileWriter som åpner filen.
			 * Bytestrøm blir opprettet for skriving av bytes til filen.
			 * Tegn blir lagret i standard tegnkodingsformat for plattformen.
			 * Hvis utvid er true, vil filen kunne utvides ved skriving på slutten
			 * av filen. Hvis utvid er false, vil skrivingen starte i begynnnelsen 
			 * av filen. Dersom filen ikke eksisterer, vil den bli opprettet.
			 * Dersom filen ikke kan åpnes, vil metoden kaste et unntak av typen IOException.
			 */
			FileWriter CDFil = new FileWriter(filnavn, false);
			
			/* 2 - 
			 * Definerer enPrintWriter som kobles til FileWriter-objektet.
			 * PrintWriter-objektet leverer tegn til FileWriter-objektet.
			 * FileWriter vil gi riktig koding av tegn i bytes og lagring på fil.
			 */
			PrintWriter utfil = new PrintWriter(CDFil);
			int antall = cdarkiv.antall();
			
			// 3 - Skriver først ut antall cd-info på første linje
			utfil.println(antall);
			
			// 4 - Skriver postene felt for felt
			CD[] tabell = cdarkiv.hentCdTabell();
			for (int i = 0; i < antall; i++) {
				utfil.print(tabell[i].getNummer());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getArtist());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getTittel());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getAar());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getSjanger());
				utfil.print(SKILLE);
				utfil.println(tabell[i].getPlateselskap());
			}
			// 5 - Lukker filen
			utfil.close();
			
		} catch(FileNotFoundException e) {
			System.out.print("feil ved �pning av fil: " + filnavn);
			System.exit(1);
			
		} catch (IOException e) {
			System.out.println("Feil p� skriving til fil: " + e);
			System.exit(2);
		}
	}
}
