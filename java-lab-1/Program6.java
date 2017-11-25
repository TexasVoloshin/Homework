import java.util.Scanner;

public class Program6 {
   public static void main(String[] args) {
	  String k;
	   Scanner input = new Scanner(System.in);
	   //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   do {
		   System.out.println("Podaj dowolny znak.");
		   System.out.println("(Aby wyjsc z petli napisz quite):");
		   k = input.nextLine();
	   } 
	   while (k != 'quite');
   }
}

/*
 * Cwiczenia:
 * 1. Zmien warunek zakonczenia programu na "quit"
 */