package UUP; 
import java.util.Scanner;
public class Kocka { public static void main(String[] args) { 
	Scanner input = new Scanner(System.in); 
	System.out.print("Unesite a: "); 
	double a = input.nextDouble(); 
	double P = 6 * Math.pow(a, 2); 
	double V = Math.pow(a, 3); 
	System.out.println("P = " + P + "\nV = " + V); 
	} 
}
