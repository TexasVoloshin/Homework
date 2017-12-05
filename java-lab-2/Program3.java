import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			int x, y;
			System.out.println("Podaj liczbe wierszy macierzy: ");
			x = Integer.parseInt(in.readLine());
			System.out.println("Podaj liczbe kolumn macierzy: ");
			y = Integer.parseInt(in.readLine());
			int[][] m = new int[x][y];

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.println("Podaj element [" + i + "][" + j + "]: ");
					m[i][j] = Integer.parseInt(in.readLine());
				}
			}
			int min[] = new int[x];

			for (int i = 0; i < x; i++) {
				int min_x = Integer.MAX_VALUE;

				for (int j = 0; j < y; j++) {
					if (min_x > m[i][j]) {
						min_x = m[i][j];
					}
				}
				min[i] = min_x;
				System.out.println("Najmniejszy element w w wierszu [" + i + "] wynosi : " + min_x);

			}

			System.out.println(" �rednia minimow wierszy wynosi: " + srednia(min));

			// System.out.println("Najmniejszy element znajduje sie w wierszu nr"+(min_x)+" i kolumnie nr "+(min_y)+ " a jego wartosc wynosi "+m[min_x][min_y]);
		} catch (IOException e) {
		}
	}

	public static double srednia(int[] min) {
		double suma = 0;
		for (int i = 0; i < min.length; i++) {
			suma += min[i];
		}
		double srednia = suma / min.length;

		return srednia;
	}

}

/*
 * Cwiczenia: 1. Znajdz najwieksze z minimow poszczegolnych wierszy. 2. Policz
 * srednia minimow wierszy.
 */