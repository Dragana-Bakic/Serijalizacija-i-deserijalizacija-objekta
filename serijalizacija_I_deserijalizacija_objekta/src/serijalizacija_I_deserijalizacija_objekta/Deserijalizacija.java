package serijalizacija_I_deserijalizacija_objekta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserijalizacija {

	public List<Polumaratonci> deserijalizuj(String RangLista) {

		List<Polumaratonci> listaPolumaratonaca = null;

		try {
			
			/*
			 * Za deserijalizaciju objekata iz toka bajtova koristimo klase:
			 * FileInputStream - vraća podatke iz fajla u sekvencu bajtova 
			 * ObjectInputStream – sekvencu bajtova konvertuje/vraća u objekat.
			 */
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RangLista));
			
			/*
			 * Deserijalizacija objekta se obavlja pozivom metode `readObject()` na objektu klase `ObjectInputStream` 
			 * koji je otvoren na ulaznom toku, koji može biti datoteka, mrežni tok ili neki drugi ulazni tok.
			 * Pomoću ovog metoda čitamo podatke koji su serijalizovani.
			 */
			
			listaPolumaratonaca = (List<Polumaratonci>) ois.readObject();
			ois.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listaPolumaratonaca;

	}

}
