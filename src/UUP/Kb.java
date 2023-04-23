package UUP;

	 import java.util.Scanner;
	 public class Kb { public static void main(String[] args) 
	 { // TODO Auto-generated method stub 
		 Scanner input = new Scanner (System.in); 
		 System.out.println("Unesite kilobajte: "); 
		 double g = input.nextDouble();
		 System.out.println("To je bajtova: " + (g * 1024)); 
		 input.close(); 
		

	}

}
