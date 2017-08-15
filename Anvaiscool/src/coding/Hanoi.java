package coding;
 

import java.util.Scanner;

public class Hanoi {

	public void solve(int n, String start, String auxiliary, String end) {
  if (n==1) { 
	 // System.out.println(start + "->" + end);\
	  System.out.println("u reached the first disc" + start + auxiliary + end);
  }
  else {
	  solve(n-1, start, end, auxiliary); 
	  //System.out.println(start + "->" + end);
	  System.out.println("first call" + start + end + auxiliary);
      solve(n-1, auxiliary, start, end );  
      System.out.println("second call " + auxiliary + start + end);
  }
	}

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi(); 
		System.out.print("Enter number of discs: "); 
		Scanner keyboard = new Scanner(System.in); 
		int discs = keyboard.nextInt();
		hanoi.solve(discs, "A", "B", "C");

	}

}
