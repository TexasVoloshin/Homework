import java.io.*;

public class Program4 {

	public static void babelek(int[] tablica, int rozmiar) {
		
		/*zad 1
		 * int i, j;
		 * int tmp; 
		 * int i, j; 
		 * for ( i = 1; i < rozmiar; i++ ) for ( j = 1;j < rozmiar; j++ ) 
		 * if ( tablica[j-1] > tablica[j] ) 
		 * { tmp =tablica[j-1]; 
		 * tablica[j-1] = tablica[j]; 
		 * tablica[j] = tmp; } }
		 * 
		 */
		
		/*zad 2
		 * Pierwsza optymalizacja. Wewn�trzna p�tla zmniejsza si� o 1, poniewa�
		 * za ka�dym jej przebiegiem najwi�kszy element jest na swojej pozycji.
		 * Nie trzeba z nim zatem por�wnywa� innych liczb.
		 * 
		 * for (int i = 1; i < rozmiar; i++) 
		 * { for (int j = 0; j < rozmiar - i;j++) 
		 * { if (tablica[j] > tablica[j + 1]) 
		 * { int tmp = tablica[i];
		 * tablica[i] = tablica[j]; tablica[j] = tmp; } } }
		 */
		
		
		/*
		* Trzecia optymalizacja. Podobnie jak w drugiej optymalizacji zewn�trzna
		* p�tla zatrzymuje si� gdy w p�tli wewn�trznej nie dokonano ani jednej
		* zamiany. Dodatkowo p�tla wewn�trzna nie sprawdza ostatnich posortowanych
		* element�w nawet je�li jest ich wi�cej ni� wynika�oby to z obieg�w p�tli
		* zewn�trznej.
		*/
		//Arrays.sort(iArr);
		int n = tablica.length - 1;
 
		while (n > 0) {
			int last = 0;
			for (int j = 0; j < n; j++) {
				if (tablica[j] > tablica[j + 1]) {
					swap(tablica, j, j + 1);
					last = j;
				}
			}
			n = last;
		}
	}

	private static void swap(int[] tablica, int i, int j) {
		int temp = tablica[i];
		tablica[i] = tablica[j];
		tablica[j] = temp;
	}
	
	  
   public static int suma(int[] tablica, int rozmiar) {
      int s = 0;
      for ( int i = 0; i < rozmiar; i++ )
         s += tablica[i];
      return s;
   }

   public static int minimum(int[] tablica, int rozmiar) {
      int min = tablica[0];
      for ( int i = 1; i < rozmiar; i++ )
         if ( tablica[i] < min )
            min = tablica[i];
      return min;
   }
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe (tablica["+i+"]): ");
         tablica[i] = Integer.parseInt(in.readLine());
      }
   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r;
         System.out.println("Podaj rozmiar: ");
         r = Integer.parseInt(in.readLine());
         int[] t = new int[r];
         wczytaj_tablice(t, r);
         
         System.out.println("Tablica przed posortowaniem:");
         wypisz_tablice(t, r);

         babelek(t, r);
         System.out.println("Tablica posortowana:");
         wypisz_tablice(t, r);
 
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Zastanow sie jak ulepszyc (zmniejszyc liczbe iteracji) 
 * zaproponowana funkcje sortujaca (tzw. sortowanie babelkowe).
 * 2. Sprobuj wykorzystac biblioteczna metode 
 * java.util.Arrays.sort() do posortowania tablicy. 
 * Jaki algorytm sortowania zaimplementowany jest w tej metodzie?
 */
