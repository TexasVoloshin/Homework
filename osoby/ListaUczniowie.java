package osoby;
import java.util.ArrayList;
import osoby.Uczen;

public class ListaUczniowie {
	

	
		
		private ArrayList<Osoba> osoby;
		
		public ListaUczniowie() {
			osoby = new ArrayList<Osoba>();
		}
		
		public void dodaj(Osoba u) {
			osoby.add(u);
		}
		
		
		
		public String toString() {
			String wynik = "--- Lista Uczniów ---\n";
			for(Osoba u : osoby) {
				wynik += u + "\n";
			}
			
			wynik += "-----------";
			return wynik;
		}
		

		
		public static void main(String[] args) {

			Uczen u1 = new Uczen("Ola", "Hulka", "3a", 4.5);
			Uczen u2 = new Uczen("Krystian", "Gawe³", "4a", 3.5);
			Uczen u3 = new Uczen("Katarzyna", "Frysztak", "3b", 5.1);

			ListaNauczyciele lu = new ListaNauczyciele();
			lu.dodaj(u1);
			lu.dodaj(u2);
			lu.dodaj(u3);

			System.out.println(lu);

		
			
			
		
		}
	}



