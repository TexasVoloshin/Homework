package osoby;

public class Dyrektor extends Osoba  {
	
	String szko�a;
	String przedmiot
	private int pensja;
	
	public Dyrektor(String imie, String nazwisko, String szko�a,String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.szko�a = szko�a;
		this.przedmiot = przedmiot;
		this.pensja = pensja;
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem szko�y : " + szko�a+ " i nauczam przemiot: " + przedmiot);
	}

}
