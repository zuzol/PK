import java.util.Scanner;

public class ZarzadzanieKategoriami {

	
		
		private Kategoria nabial;
		private Kategoria mieso;
		private Kategoria reszta;
		
		private Scanner sc;
		
		public ZarzadzanieKategoriami() {
			nabial = new Kategoria("nabia�");
			mieso = new Kategoria("mi�so");
			reszta = new Kategoria("reszta");
			
			sc = new Scanner(System.in);
			
			init();
		}
		private void init(){
	
		Kategoria nabial = new Kategoria("nabia�");
		Kategoria mieso = new Kategoria("mi�so"); // tak jak scanner scanner sc = new scanner(nazwa)
		Kategoria reszta = new Kategoria("reszta");
		
	this.nabial.dodajProdukt(new Produkt("mleko"));
	this.nabial.dodajProdukt(new Produkt("jogurt"));
	this.nabial.dodajProdukt(new Produkt("mas�o"));
	this.nabial.dodajProdukt(new Produkt("�mietana"));
	this.nabial.dodajProdukt(new Produkt("serek wiejski"));
	
	this.mieso.dodajProdukt(new Produkt("szynka"));
	this.mieso.dodajProdukt(new Produkt("boczek"));
	this.mieso.dodajProdukt(new Produkt("karkowka"));
	this.mieso.dodajProdukt(new Produkt("mielone"));
	this.mieso.dodajProdukt(new Produkt("schabowe"));
	
	this.reszta.dodajProdukt(new Produkt("cos1"));
	this.reszta.dodajProdukt(new Produkt("cos2"));
	this.reszta.dodajProdukt(new Produkt("cos3"));
	this.reszta.dodajProdukt(new Produkt("cos4"));
	this.reszta.dodajProdukt(new Produkt("cos5"));

		}
	public void wlacz() 
	{
		Kategoria p;
		while (true) {
			System.out.println("Co chcesz zrobi�? Wybierz opcj�:");
			System.out.println("\t(1) Pokaza� zawarto�� lod�wki");
			System.out.println("\t(2) Doda� nowy Produkt");
			System.out.println("\t(3) Wyj�� Produkt z lod�wki");
			System.out.println("\t(9) Zako�cz program");
			
					byte o = sc.nextByte(); sc.nextLine();
					switch (o) {
					case 1 :
						p = wybierzKategorie();
						if (p!=null) {
							p.wyswietlProdukty();
						}
						break;
					case 2 :
						p = wybierzKategorie();
						if (p!=null) { // zapytaj o dane Produktu
							System.out.print("Podaj nazw� Produktu");
							String nazwa = sc.nextLine();

							p.dodajProdukt(new Produkt(nazwa));
							p.wyswietlProdukty();
						}
					
						break;

					case 3 :
						p = wybierzKategorie();
						if (p!=null) {
							p.wyswietlProdukty(); // zapytaj ktory Produkt przeniesc
							System.out.print("Kt�ry produkt wyj��?");
							byte nr_Produktu = sc.nextByte();
							p.usunProdukt(nr_Produktu);
							
						
							}
							break;
					case 9 :
						return;
					default :
						System.err.println("Nie rozpoznaj� opcji");
						
					}
					}
		}
	
	private Kategoria wybierzKategorie() {
		Kategoria p = null;
		System.out.println("Ktorej kategorii u�y�? wybierz opcj�:");
		System.out.println("\t(1) "+ nabial.getNazwa());
		System.out.println("\t(2) "+ mieso.getNazwa());
		System.out.println("\t(3) "+ reszta.getNazwa());
		System.out.print("?");
		byte nr_p = sc.nextByte(); sc.nextLine();
		switch (nr_p) {
		case 1 :
			p = nabial;
			break;
		case 2 :
			p = mieso;
			break;
		case 3 :
			p = reszta;
			break;
		default :
			System.err.println("Nie ma takiej kategorii!");
		}
		return p;
		
	}
	public static void main(String[] args) {
		ZarzadzanieKategoriami o = new ZarzadzanieKategoriami();
		o.wlacz();
		System.out.println("---KONIEC---");
	}
	}
/*
case 1 :
	p = wybierzKategorie();
	if (p!=null) {
		p.wyswietlProdukty();
	}

	break;
	*/




