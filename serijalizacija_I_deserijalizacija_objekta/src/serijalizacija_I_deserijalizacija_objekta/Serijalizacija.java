package serijalizacija_I_deserijalizacija_objekta;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serijalizacija {

	public void serijalizuj(List<Polumaratonci> listaPolumaratonaca, String RangLista) {

		try {

			/*
			 * Za serijalizaciju objekata u tok bajtova koriste se klase: ObjectOutputStream
			 * - ona konvertuje java objekte u sekvencu bajtova i zapisuje ih pomoću
			 * FileOutputStream FileOutputStream – smešta sekvencu bajtova unutar fajla
			 * (zapis binarnih podataka u fajl).
			 */

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RangLista));

			/*
			 * Serijalizacija objekta se obavlja pozivom metode `writeObject()` na objektu
			 * klase `ObjectOutputStream` koji je otvoren na izlaznom toku, koji može biti
			 * datoteka, mrežni tok ili neki drugi izlazni tok.
			 */

			oos.writeObject(listaPolumaratonaca);
			oos.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
