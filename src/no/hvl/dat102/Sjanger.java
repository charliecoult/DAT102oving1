package no.hvl.dat102;

public enum Sjanger {

	POP(1), ROCK(2), OPERA(3), KLASSISK(4);
	private int nr;
	
	private Sjanger(int nr) {
		this.nr = nr;
	}

	public int getNr() {
		return nr;
	}

	public static Sjanger finnSjanger(int nr) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.nr == nr) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}

	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}
}
