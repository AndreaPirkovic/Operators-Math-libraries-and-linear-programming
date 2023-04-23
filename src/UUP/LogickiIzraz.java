package UUP; 
import java.util.Scanner; 
public class LogickiIzraz { public static void main(String[] args) { 
	Scanner input = new Scanner(System.in); 
 
	boolean x = true; 
	 
	boolean y = false; 
	
	boolean z = !(x & y) | !(x & y); 
	System.out.println("z = " + z); 
	} 
}