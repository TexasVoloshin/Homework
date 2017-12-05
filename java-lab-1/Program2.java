import java.io.*;

/**
 * @author student20
 *
 */
public class Program2 {
   public static void main(String[] args) throws IOException {
	  do {
      try {
      
      int x, pole;
     
      System.out.println("Podaj dowolna liczbe calkowita: ");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));      
      x = Integer.parseInt(in.readLine());
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      y=Integer.parseInt(ReadLine());
      pole = y*x;
      System.out.println("Pole prostok¹ta o bokach  "+x+" i "+y+" wynosi: "+pole);
      break;
      } catch (NumberFormatException e){
          System.out.println("To nie byla liczba calkowita, sprobuj jeszcze raz.");
        }
	  } while(true);
	  
   }
}
	  
   

      
	  
   
  


/*
 * Cwiczenia:
 * 1. wczytaj dwie liczby i wyswietl ich iloczyn (pole prostokata);
 * 2. policz i wyswietl obwod prostokata.
 */