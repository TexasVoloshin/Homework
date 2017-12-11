package osoby;

public class Nauczyciel extends Osoba {
	String przedmiot;
	private int pensja;
	
	public Nauczyciel(String imie, String nazwisko, String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.przedmiot = przedmiot;
		this.setPensja(pensja);
	}
	@Override
	public void opis() {
		super.opis();
		System.out.println("Jestem nauczycielem, moj przedmiot to " + przedmiot);
	}
	

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}
	public String toString() {
		return "Nauczyciel " + super.toString() +"Uczy przedmiotu " + przedmiot+ " Zarabia " + pensja;
	}
}
