public class Program8 {
   public static void main(String[] args) {
      int n = 16;
      float a = (float)2.5, wynik = 1;
      for (int i = 2; i < n; i=i+2) {
         wynik = wynik * a;
         System.out.println("i = "+i+"; wynik = "+wynik);
      }
      System.out.println("Wynik koncowy: "+wynik);
   }
}

/*
 * Cwiczenia:
 * 1. Zmien petle for w ten sposob, aby i zmienialo sie od 5 do 15 co 2
 */