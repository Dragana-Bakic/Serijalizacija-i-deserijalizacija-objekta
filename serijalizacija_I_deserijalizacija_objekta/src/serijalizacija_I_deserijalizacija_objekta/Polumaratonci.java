package serijalizacija_I_deserijalizacija_objekta;

/*
 * Serijalizacija je proces konvertovanja objekata u stream ili tok podataka.
 * Deserijalizacija je proces rekonstruisanja objekata koji su već serijalizovani iz binarnih podataka.

 * Ovi procesi, odnosno prevođenje objekta u niz bajtova (koji uključuju kako podatke objekta, 
 * tako i informaciju o tipu objekta i tipu podataka smeštenih u objektu) se radi kako bi objekat mogao biti sačuvan u fajlu,
 * memoriji ili prenet preko mreže kako bi mogao kasnije da se vrati u prvobitni oblik (sa izvornim vrednostima i stanjem), odnosno iz
 * toka pročitati i deserijalizovati.
 */

import java.io.Serializable;

public class Polumaratonci implements Serializable {

	/*
	 * Interfejs Serializable je deo Java standardne biblioteke i koristi se za
	 * podršku serijalizacije i deserijalizacije objekata. Da bi se omogućila
	 * serijalizacija objekata, klasa kojoj objekti pripadaju mora implementirati
	 * `Serializable` interfejs. To se postiže dodavanjem `implements Serializable`
	 * u deklaraciju klase. Interfejs Serializable nema metode, nema polja, njegova
	 * jedina svrha je da identifikuje klasu koja treba da bude serijalizovana.
	 */

	private static final long serialVersionUID = -2544174007510145576L;

	/*
	 * `serialVersionUID` je statičko finalno polje koje se koristi prilikom
	 * serijalizacije i deserijalizacije objekata. Ono služi kao verzija klase i
	 * koristi se kako bi se kontrolisalo kako se objekti serijaliziraju i
	 * deserijaliziraju, i kako bi se osigurala kompatibilnost između različitih
	 * verzija klase prilikom tih operacija.
	 * 
	 * Ako se npr. promeni klasa, recimo dodavanjem novih varijabli ili metoda, a da
	 * se ne ažurira `serialVersionUID`, javi će se upozorenje tokom procesa
	 * kompajliranja i deserijalizacija će se neuspešno završiti.
	 */

	private String gender, rank, bib, name, country, time;

	public Polumaratonci(String gender, String rank, String bib, String name, String country, String time) {
		this.gender = gender;
		this.rank = rank;
		this.bib = bib;
		this.name = name;
		this.country = country;
		this.time = time;
	}

	public String toString() {

		return gender + "\t" + rank + "\t" + bib + "\t" + name + "\t" + country + "\t" + time + "\n";

	}
}
