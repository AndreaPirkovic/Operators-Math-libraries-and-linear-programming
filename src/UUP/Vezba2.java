package UUP;
 import java.io.*; 
 import java.text.DecimalFormat; 
 public class Vezba2 { public static void main(String[] args) throws Exception { // Deklarisanje podataka 
	 boolean x;
	boolean y; 
	 DecimalFormat df = new DecimalFormat("#.##");   
	 BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));   // Unos podataka 
	 System.out.print("Unesite vrednost za x: "); 
	 x = Boolean.parseBoolean(ulaz.readLine()); 
	 System.out.print("Unesite vrednost za y: "); 
	 y = Boolean.parseBoolean(ulaz.readLine()); 
	 
	 boolean z =  !(x || y) && (x || y);   
	 System.out.println("Vrednost funkcije z je " + z); } }
