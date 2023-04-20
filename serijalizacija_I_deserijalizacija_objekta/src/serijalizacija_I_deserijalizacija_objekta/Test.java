package serijalizacija_I_deserijalizacija_objekta;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Polumaratonci> listaPolumaratonacaF = new ArrayList<Polumaratonci>();

		listaPolumaratonacaF.add(new Polumaratonci("F", "1", "6998", "Muli Lucy Mawia", "KEN", "01:11:56"));
		listaPolumaratonacaF.add(new Polumaratonci("F", "2", "6997", "Lelei Lilian Jepkemboi", "KEN", "01:16:54"));
		listaPolumaratonacaF.add(new Polumaratonci("F", "3", "6873", "Teodora Simovic", "SRB", "01:20:51"));

		Serijalizacija se = new Serijalizacija();
		se.serijalizuj(listaPolumaratonacaF, "RangLista.txt"); // Kreiranje fajla RangLista unutar foldera projekta

		Deserijalizacija de = new Deserijalizacija();

		System.out.println("Rang Lista Ženskih Polumaratonaca 2022: ");
		System.out.println(de.deserijalizuj("Ranglista.txt"));

	}

	/*
	 * Napomena: kod serijalizacije i deserijalizacije mogu se javiti izuzeci koje
	 * je potrebno obraditi, kao što su 'FileNotFoundException', 'IOException' ili
	 * 'ClassNotFoundException'.
	 */

}
