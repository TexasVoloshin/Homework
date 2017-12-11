package osoby;
import java.util.ArrayList;


import osoby.Nauczyciel;

public class ListaNauczyciele {
	
	private ArrayList<Osoba> osoby;
	
	public ListaNauczyciele() {
		osoby = new ArrayList<Osoba>();
	}
	
	public void dodaj(Osoba n) {
		osoby.add(n);
	}
	
	
	
	public String toString() {
		String wynik = "--- Lista Nauczyciueli ---\n";
		for(Osoba n : osoby) {
			wynik += n + "\n";
		}
		
		wynik += "-----------";
		return wynik;
	}
	

	
	public static void main(String[] args) {

		Nauczyciel n1 = new Nauczyciel("Adam", "Nowak", "matematyka", 2000);
		Nauczyciel n2 = new Nauczyciel("Krystian", "Ziome", "fizyka", 2300);
		Nauczyciel n3 = new Nauczyciel("Anna", "Grygol", "chemia", 2500);

		ListaNauczyciele ln = new ListaNauczyciele();
		ln.dodaj(n1);
		ln.dodaj(n2);
		ln.dodaj(n3);

		System.out.println(ln);

	
		
		
	
	}
}
