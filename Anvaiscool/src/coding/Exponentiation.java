package coding;
import java.util.Scanner;

public class Exponentiation {
	public static int exponent(int x, int m) { 
		int total = x; 
		if (m>0) {
			total = x*total; 
			exponent(x, m-1);
			return total;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
    System.out.print("Enter a base number."); 
    int base = keyboard.nextInt();  
    System.out.print("Enter the exponent");
    int exp = keyboard.nextInt(); 
		int result = exponent(base,exp);
		System.out.print(result);
	}
}
