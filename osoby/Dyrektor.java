package osoby;

public class Dyrektor extends Osoba  {
	
	String szko�a;
	String przedmiot;
	private int pensja;
	
	public Dyrektor(String imie, String nazwisko, String szko�a,String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.szko�a = szko�a;
		this.przedmiot = przedmiot;
		this.setPensja(pensja);
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem szko�y : " + szko�a+ " i nauczam przemiot: " + przedmiot);
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

}
