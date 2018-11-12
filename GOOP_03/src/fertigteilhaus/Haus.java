package fertigteilhaus;

public class Haus {
	private final int id;
	private String name;
	private String bauherr;
	private double laenge, breite, hoehe;

	public static int zaehler = 650;

	// Standardhaus
	public Haus() {
		this.name = "Modul 1";
		this.laenge = 10;
		this.breite = 8;
		this.hoehe = 7.65;
		this.bauherr = "";
		this.id = Haus.zaehler;
		Haus.zaehler++;
	}

	// Spezialhaus
	public Haus(String nameInp, double laengeInp, double breiteInp, double hoeheInp) {
		this.name = nameInp;
		this.id = Haus.zaehler;
		Haus.zaehler++;
		this.laenge = laengeInp;
		this.breite = breiteInp;
		this.hoehe = hoeheInp;
		this.bauherr = "";

	}

	public String print() {
		return "[" + this.id + ", " + this.name + ", " + this.bauherr + ", " + this.laenge + ", " + this.hoehe + ", "
				+ this.breite + ", " +

				"]";
	}

	public double getFlaeche() {
		double flaeche = this.laenge * this.breite;
		return flaeche;
	}

	public double getUmfang() {
		double umfang = this.laenge + this.breite;
		umfang = 2 * umfang;
		return umfang;
	}

	public double getRauminhalt() {
		double volumen = this.laenge * this.breite * this.hoehe;
		return volumen;
	}
}