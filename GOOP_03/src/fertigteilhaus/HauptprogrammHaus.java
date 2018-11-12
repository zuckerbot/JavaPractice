package fertigteilhaus;

import java.util.Scanner;

public class HauptprogrammHaus {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Standardhaus
		Haus h1, h2;
		h1 = new Haus();
		h2 = new Haus();

		// Spezialhaus

		System.out.println("Bitte Namen für 1. Spezialhaus angeben:");
		String nameInp = s.nextLine();
		System.out.println("Länge in meter?");
		double laengeInp = s.nextDouble();
		System.out.println("Breite in meter?");
		double breiteInp = s.nextDouble();
		System.out.println("Höhe in meter?");
		double hoeheInp = s.nextDouble();
		Haus sh1 = new Haus(nameInp, laengeInp, breiteInp, hoeheInp);
		System.out.println();

		System.out.println("Bitte Namen für 2. Spezialhaus angeben:");
		nameInp = s.next();
		System.out.println("Länge in meter?");
		laengeInp = s.nextDouble();
		System.out.println("Breite in meter?");
		breiteInp = s.nextDouble();
		System.out.println("Höhe in meter?");
		hoeheInp = s.nextDouble();
		Haus sh2 = new Haus(nameInp, laengeInp, breiteInp, hoeheInp);

		// Anzeige
		System.out.println(h1.print());
		System.out.println(h2.print());
		System.out.println(sh1.print());
		System.out.println(sh2.print());

		// Rechenoperationen
		System.out.println("Haus 1: Fläche = " + h1.getFlaeche());
		System.out.println("Haus 1: Umfang = " + h1.getUmfang());
		System.out.println("Haus 1: Volumen = " + h1.getRauminhalt());

		s.close();

	}

}