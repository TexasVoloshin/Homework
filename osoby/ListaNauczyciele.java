package osoby;
import java.util.ArrayList;


import osoby.Nauczyciel;

public class ListaNauczyciele {
	
	private ArrayList<Nauczyciel> osoby;
	public ListaNauczyciele() {
		osoby = new ArrayList<Nauczyciel>();
	}
	
	public void dodaj(Nauczyciel n) {
		osoby.add(n);
	}
	
	public void  couczy(String[] przedmiot)
	{
	    
		przedmiot[0]="polski";
		przedmiot[1]="matematyka";
		przedmiot[2]="fizyka";
		przedmiot[3]="biologia";
		przedmiot[4]="chemia";
		
		
	}

	
	public static void main(String[] args) {
	
	}
}
