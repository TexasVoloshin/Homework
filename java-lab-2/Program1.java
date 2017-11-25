import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program1 {

	public static void wczytaj_tablice(double[] tablica, int rozmiar) throws IOException { // tablica
																							// wszedzie
																							// zostala
																							// zmieniona
																							// na
																							// typ
																							// double

		for (int i = 0 ; i < rozmiar; i++) {
			double potega;
			potega = Math.pow(2, i);
			tablica[i] = potega;

			// wypelnia kolejnymi liczbami calkowitymi
			/*
			 * for ( int i = 0; i < rozmiar; i++ ) 
			 * { tablica[i]=i;
			 */
			/*
			 * losuje randomwe liczby z przedzialu 
			 * for ( int i = 0; i < rozmiar;i++ ) 
			 * { int los; 
			 * Random rand = new Random();
			 *  los =rand.nextInt(101);
			 * 
			 * tablica[i] = los; System.out.println("Wylosowano:  "+ tablica[i]); }
			 */
		}
	}

	public static void wypisz_tablice(double[] tablica, int rozmiar) {
		for (int i = 0; i < rozmiar; i++)
			System.out.println("tablica[" + i + "] = " + tablica[i]);
	}

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int r;
			System.out.println("Podaj rozmiar: ");
			r = Integer.parseInt(in.readLine());
			double[] t = new double[r];
			wczytaj_tablice(t, r);

			System.out.println("Podales nastepujace liczby:");
			wypisz_tablice(t, r);

		} catch (IOException e) {
		}
	}
}

/*
 * Cwiczenia: 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu od
 * 0 do 100, a nastepnie do wartosci podanej przez uzytkownika. 2. Zamiast
 * wczytywac elementy tablicy, wypelnij ja kolejnymi liczbami calkowitymi,
 * kolejnymi potegami dwojki itp.
 */
