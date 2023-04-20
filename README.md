# Serijalizacija-i-deserijalizacija-objekta
Java programiranje

**Serijalizacija** je proces pretvaranja objekta u sekvencu bajtova ili drugih binarnih podataka koji se mogu sačuvati ili preneti. **Deserijalizacija** je proces ponovnog kreiranja objekta iz binarnih podataka.

Evo nekoliko razloga zbog kojih se radi serijalizacija i deserijalizacija objekta:
1. **Prenos podataka**: Serijalizacija omogućava prenos objekta između različitih sistema ili aplikacija koje koriste različite programske jezike, ili različite verzije istog programske jezika. Objekti se mogu serijalizovati u binarni format koji se može preneti putem mreže, kao što su JSON, XML ili druge vrste formata.
2. **Čuvanje podataka**: Serijalizacija omogućava trajno čuvanje objekata u datotekama ili bazama podataka. Objekti se mogu serijalizovati u binarni format ili u format koji je čitljiv čoveku, kao što su JSON ili XML, i kasnije deserijalizovati kako bi se obnovili u originalni objekat.
3. **Komunikacija između mikroservisa**: U mikroservisnoj arhitekturi, različiti delovi aplikacije mogu biti implementirani kao odvojeni mikroservisi koji komuniciraju međusobno. Serijalizacija i deserijalizacija omogućavaju prenos objekata između mikroservisa kako bi razmenjivali podatke.
4. **Stanje aplikacije**: Serijalizacija omogućava čuvanje stanja aplikacije, kao što su postavke, konfiguracije ili korisničko stanje, koje se mogu deserijalizovati kako bi se obnovilo stanje aplikacije nakon ponovnog pokretanja ili prekida u radu.
5. **Kloniranje objekta**: Serijalizacija i deserijalizacija omogućavaju kreiranje duboke kopije objekta, odnosno kloniranje objekta i svih njegovih podobjekata. Ovo može biti korisno u situacijama kada je potrebno izraditi kopiju objekta ili ga preneti na drugo mesto u memoriji.
6. **Sigurnost**: Serijalizacija se može koristiti kao deo procesa enkripcije podataka kako bi se zaštitili podaci prilikom prenosa ili čuvanja. Serijalizovani podaci mogu biti enkriptovani, a zatim deserijalizovani samo od strane autorizovane strane.

Ukratko, serijalizacija i deserijalizacija omogućavaju da objekti budu preneseni preko mreže i sačuvani u fajlovima, a da pritom zadrže svoje izvorne vrednosti i stanje.

U Javi se serijalizacija i deserijalizacija obično izvodi putem klasa `java.io.ObjectOutputStream` za serijalizaciju objekata u tok bajtova i `java.io.ObjectInputStream` za deserijalizaciju objekata iz toka bajtova. 

Serijalizacija klase je omogućena implementacijom interfejsa `java.io.Serializable`. Sve potklase ovako definisane klase automatski imaju mogućnost serijalizacije. Ovaj interfejs nema metode ili polja i koristi se samo da bi označio da li određena klasa podleže serijalizaciji ili ne.

![Grafički prikaz](https://user-images.githubusercontent.com/131188396/233495817-f8b8a975-ca1c-4ab1-a50e-bca645e5cfff.png)

_Objekat prevodimo u tok (niz) bajtova, a zatim taj tok upisujemo u fajl, bazu podataka ili memoriju u zavisnosti šta nam treba, a zatim iz fajla možemo izvući taj tok bajtova i pretvoriti ga u objekat kao što je bio na početku (prvobitni oblik)._


