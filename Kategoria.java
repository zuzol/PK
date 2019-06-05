import java.util.Arrays;

public class Kategoria {//public dostêp w ka¿dej klasie, private w konkretnej
	String nazwa;
	Produkt[] lista_Produktow;
	int ile_Produktow;
	
public Kategoria(String n) {
	nazwa = n;
	lista_Produktow = new Produkt[5];
	ile_Produktow = 0;
}

public String getNazwa() {
	return nazwa;
}

public void dodajProdukt(Produkt u) {
	if (u == null){
		System.err.println(nazwa+ ": Nie mo¿na dodaæ Produktu o pustej nazwie");
		return;
	}
	if (ile_Produktow >= lista_Produktow.length) {
		System.err.println(nazwa+ ": Nie mo¿na dodaæ wiêcej Produktow");
		return;
	}
	lista_Produktow[ile_Produktow++] = u; 
}
public void wyswietlProdukty() {
	if (ile_Produktow==0){
		System.out.println(nazwa+ ": Brak Produktow na liscie");
		return;	
	}
	System.out.println(nazwa +" - lista Produktow:");
	for (int i = 0; i< ile_Produktow; i++){
	System.out.println(i + 1 + " . "+lista_Produktow[i].toString());
	}
}
public Produkt Produkt(int nr_Produktu) {
	if (nr_Produktu < 0 || nr_Produktu > ile_Produktow){
		System.err.println(nazwa+ ": Nie ma takiego Produktu na liscie");
		return null;
	}
	return lista_Produktow[nr_Produktu -1]; // bo od 0
	}
public Produkt usunProdukt(int nr_Produktu) {
	if (nr_Produktu < 0 || nr_Produktu > ile_Produktow){
		System.err.println(nazwa+ ": Nie ma takiego Produktu na liscie");
		return null;
	}
	Produkt Produkt = lista_Produktow[nr_Produktu-1];
	lista_Produktow[nr_Produktu-1] = null;
	ile_Produktow--;
	for (int i = nr_Produktu-1; i<ile_Produktow; i++) {
		lista_Produktow[i] = lista_Produktow[i+1];
		
	}
	return Produkt;
	
	}
public void posortujProdukty() {
	Arrays.sort(lista_Produktow, 0, ile_Produktow);
}

}


	


