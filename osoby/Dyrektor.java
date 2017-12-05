package osoby;

public class Dyrektor extends Osoba  {
	
	String szko³a;
	String przedmiot
	private int pensja;
	
	public Dyrektor(String imie, String nazwisko, String szko³a,String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.szko³a = szko³a;
		this.przedmiot = przedmiot;
		this.pensja = pensja;
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem szko³y : " + szko³a+ " i nauczam przemiot: " + przedmiot);
	}

}
