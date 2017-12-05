public class Program10 {
   public static double pole4(double a, double b) {
      return a * b;
   }
   public static double pitagoras(double a, double b) {
      return Math.sqrt(a*a + b*b);
   }
   public static int silnia(int a) {
	   
		    if (a == 0) 
		      return a;
		    else 
		      return a*silnia(a - 1);
		  }
   public static double poleKola(double a,b,c){
	   double p;
	   p=(a+b+c)/2;
	   return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	  
   }
	      
	      
   public static void main(String[] args) {
	

      System.out.println("Pole czworokata wynosi: "+pole4(2.5, 6));
      System.out.println("Przeciwprostokatna: "+pitagoras(3, 4));  
     

      System.out.println("Silnia dla liczby 6 wynosi "+ Program10.silnia(6));
      System.out.println("Pole trojkata ze wzoru Hornera wynosi"+ Program10.poleKola(4,5,6))); 
   }
}

/*
 * Cwiczenia:
 * 1. Dopisz kolejna metode statyczna i uzyj jej w metodzie main()
 */