import java.io.*;

public class Program2 {

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
   public static int maximum(int[] tablica, int rozmiar) {
	      int max = tablica[0];
	      for ( int i = 1; i < rozmiar; i++ )
	         if ( tablica[i] > max )
	            max = tablica[i];
	      return max;
   }
 public static double srednia(int[] tablica, int rozmiar) {
		     
		      double suma = suma(tablica, rozmiar);
		      double sr = suma/(double)rozmiar;
		      return sr;      
	       
   }
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe: ");
         tablica[i] = Integer.parseInt(in.readLine());
      }
   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
      try{
    	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          int r;
          System.out.println("Podaj rozmiar: ");
          r = Integer.parseInt(in.readLine());
          int[] t = new int[r];
          wczytaj_tablice(t, r);
          
          System.out.println("Podales nastepujace liczby:");
          wypisz_tablice(t, r);
         
         
         int min = minimum(t,r);
         System.out.println("Najmniejsza z liczb to:" + min);
         
         int max = maximum(t,r);
         System.out.println("Najwieksza z liczb to:" + max);
         int sum = suma(t,r);
         System.out.println("Suma wszystkich liczb w tablicy to:" + sum);
    	
         
         double srednia = srednia(t,r);
         System.out.println("Srednia z wszystkich liczb w tablicy wynosi: " + srednia); 
    	  
      } catch(IOException e) {
      
      }
   }
}

/*
 * Cwiczenia:
 * 1. Z pomoca zaproponowanych funkcji napisz programy podajace 
 * odpowiednio sume i minimum podanych przez uzytkownika (lub wygenerowanych) liczb.
 * 2. Napisz funkcje obliczajaca srednia dla podanego (lub 
 * wygenerowanego) ciagu liczb.
 */
