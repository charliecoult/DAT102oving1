package no.hvl.dat102;

public class CD {

	// Objektvariabler
	private int nummer;
	private String artist;
	private String tittel;
	private int aar;
	private Sjanger sjanger;
	private String plateselskap;
	
	//Konstruktør
	public CD(int nummer, String artist, String tittel, int aar, Sjanger sjanger, String plateselskap) {
		this.nummer = nummer;
		this.artist = artist;
		this.tittel = tittel;
		this.aar = aar;
		this.sjanger = sjanger;
		this.plateselskap = plateselskap;
	}

	// Getters/Setters
	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	public String getPlateselskap() {
		return plateselskap;
	}
	
	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}
	
}
