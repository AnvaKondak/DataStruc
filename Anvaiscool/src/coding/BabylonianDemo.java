package coding;
import java.util.Scanner; 
public class BabylonianDemo {

	/**
	* The main method.
	* 
	* @param args the arguments
	*/public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in); 
	double guess;
	int sq; 
	System.out.println("Enter the number you wish to find the square root of."); 
	sq=keyboard.nextInt(); 
	
	System.out.println("Enter your guess."); 
	guess=keyboard.nextDouble(); 
	double sqrt = findSqrt(guess, sq, 4); 
	System.out.println("Square root::"+sqrt);
	
	}

	
	public static double findSqrt(double x, int y, int n) { 
		double newX = x; 
		double avg = 0.0; 
		
		if (n==0)
			return newX; 
		else {
			double div = y/x;
			avg = (x+div)/2; 
			newX = avg; 
			System.out.println("Calculating .."); 
			return findSqrt(newX, y, n-1); 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

