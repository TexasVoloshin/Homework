package osoby;

public class Dyrektor extends Osoba  {
	
	String szko³a;
	String przedmiot;
	private int pensja;
	
	public Dyrektor(String imie, String nazwisko, String szko³a,String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.szko³a = szko³a;
		this.przedmiot = przedmiot;
		this.setPensja(pensja);
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem szko³y : " + szko³a+ " i nauczam przemiot: " + przedmiot);
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

}
