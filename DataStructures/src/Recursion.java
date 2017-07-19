
public class Recursion {
//fibonacci sequence 
	public static int FibSeq(int n){
		if (n<=1){ 
	//call and report him 
			System.out.println(n + " less than equal to 1");
		return n; }
		else {
			return FibSeq(n-1) + FibSeq(n-2);
		}
	}
	
	public static void main (String[] args){ 
		new Recursion(); 
	System.out.print(" " +FibSeq(6) + " ");
		
	}
}
 
