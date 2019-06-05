import java.util.Scanner;

public class ZarzadzaniePlaylistami {

	
		
		private Playlista rock;
		private Playlista pop;
		private Scanner sc;
		
		public ZarzadzaniePlaylistami() {
			rock = new Playlista("Rok");
			pop = new Playlista("Pop");
			
			sc = new Scanner(System.in);
			
			init();
		}
		private void init(){
	
		Playlista rock = new Playlista("Rock");
		Playlista pop = new Playlista("Pop"); // tak jak scanner scanner sc = new scanner(nazwa)
	
	rock.dodajUtwor(new Utwor("Highway to hell", "AC/DC", 1979 ));
	rock.dodajUtwor(new Utwor("Smells like a teen spirit", "Nirvana", 1991));
	rock.dodajUtwor(new Utwor("Piece of my heart","Janis Joplin",1967));
	rock.dodajUtwor(new Utwor("Nothing else matters","Metallica", 1991));
	rock.dodajUtwor(new Utwor("Keine Lust","Ramstein", 2004));
	rock.dodajUtwor(new Utwor("TNT","AC/DC", 1975));
	rock.dodajUtwor(new Utwor("Bohemian Rhapsody","Queen", 1975));
	
	pop.dodajUtwor(new Utwor("Toxic", "Britney Spears", 2003));
	pop.dodajUtwor(new Utwor("Shake if off", "Taylor", 2014));
	pop.dodajUtwor(new Utwor("Barbie girl", "Aqua", 1997));
	pop.dodajUtwor(new Utwor("Every Night", "Mandaryna", 2005));
	pop.dodajUtwor(new Utwor("Baby", "Bieber", 2010));
	pop.dodajUtwor(new Utwor("Like a virgin", "Madonna", 1984));
	pop.dodajUtwor(new Utwor("Waka Waka", "Shakira", 2010));
	pop.dodajUtwor(new Utwor("Take on me", "AHA", 1985));
		}
	public void wlacz() 
	{
		Playlista p;
		while (true) {
			System.out.println("Co chcesz zrobiæ? Wybierz opcjê:");
			System.out.println("\t(1) wyswietlic playliste");
			System.out.println("\t(2) dodac nowy utwor");
			System.out.println("\t(3) przeniesc utwor");
			System.out.println("\t(4) skopiowac utwor");
			System.out.println("\t(5) skasowac utwór");
			System.out.println("\t(9) wylaczyc utwor");
					byte o = sc.nextByte(); sc.nextLine();
					switch (o) {
					case 1 :
						p = wybierzPlayliste();
						if (p!=null) {
							p.wyswietlUtwory();
						}
					
						break;
					case 2 :
						p = wybierzPlayliste();
						if (p!=null) { // zapytaj o dane utworu
							System.out.print("Podaj tytu³ utworu");
							String tytul = sc.nextLine();
							System.out.print("Podaj wykonawcê utworu");
							String wykonawca = sc.nextLine();
							System.out.print("Podaj rok wydania");
							int rok_wydania = sc.nextInt(); // dodaj utwor
							p.dodajUtwor(new Utwor(tytul, wykonawca, rok_wydania));
							p.wyswietlUtwory();
						}
					
						break;
					case 3 :
						p = wybierzPlayliste();
						if (p!=null) {
							p.wyswietlUtwory(); // zapytaj ktory utwor przeniesc
							System.out.print("Który utwór przenieœæ?");
							byte nr_utworu = sc.nextByte();
							Utwor u = p.usunUtwor(nr_utworu);
							if (u!=null) {
								Playlista p_do = p.equals(rock) ? pop : rock ;
								p_do.dodajUtwor(u);
								
							}
						}
							break;
						
					case 4 :
						p = wybierzPlayliste();
						if (p!=null) {
							p.wyswietlUtwory(); // zapytaj ktory utwor przeniesc
							System.out.print("Który utwór skopiowaæ?");
							byte nr_utworu = sc.nextByte();
							Utwor u = p.utwor(nr_utworu);
							if (u!=null) {
								Playlista p_do = p.equals(rock) ? pop : rock ;
								p_do.dodajUtwor(u);
							}
						}
							break;
					
					case 5 :
						p = wybierzPlayliste();
						if (p!=null) {
							p.wyswietlUtwory(); // zapytaj ktory utwor przeniesc
							System.out.print("Który utwór skasowaæ?");
							byte nr_utworu = sc.nextByte();
							p.usunUtwor(nr_utworu);
							
						
							}
							break;
					case 9 :
						return;
					default :
						System.err.println("Nie rozpoznajê opcji");
						
					}
					}
		}
	
	private Playlista wybierzPlayliste() {
		Playlista p = null;
		System.out.println("Ktorej playlisty u¿yæ? wybierz opcjê:");
		System.out.println("\t(1) "+ rock.getNazwa());
		System.out.println("\t(2) "+ pop.getNazwa());
		System.out.print("?");
		byte nr_p = sc.nextByte(); sc.nextLine();
		switch (nr_p) {
		case 1 :
			p = rock;
			break;
		case 2 :
			p = pop;
			break;
		default :
			System.err.println("Nie ma takiej playlisty!");
		}
		return p;
		
	}
	public static void main(String[] args) {
		ZarzadzaniePlaylistami o = new ZarzadzaniePlaylistami();
		o.wlacz();
		System.out.println("---KONIEC---");
	}
	}

	
	



