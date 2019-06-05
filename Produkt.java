
public class Produkt implements Comparable { 
	private String nazwa;


			public Produkt (String t) {
				nazwa = t;

			}
			public String getNazwa() {
				return nazwa;
			}

			public String toString() {
				return getNazwa();
			}
			@Override
			public int compareTo(Object o) {
				Produkt u = (Produkt) o;
				return this.getNazwa().compareTo(u.getNazwa());
			}
			

}
