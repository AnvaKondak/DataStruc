package coding;

public class Recursion {
	public static void main(String[] args) { 
		Recursion rTool = new Recursion(); 
		//rTool.drawSquares(6); 
	   System.out.println(rTool.getTriangularNumR(3));
	}
	
	public int getTriangularNumR( int number) {
		//System.out.println("Method " + number);
		
		if (number == 1) { 
			System.out.println("Returned 1");
			System.out.println("method " + number);
			return 1;
		}
		else { 
			int result = number + getTriangularNumR(number - 1);
            System.out.println("Returned " + result);	
            //System.out.println(" : " + number + " + getTN(" + number + " -1)");
            
            return result; 
           }
	}
 // USED TO DEMONSTRATE TRIANGULAR NUMBERS 
	//DRAWS NUMBER OF SQUARES PASSED IN HORIZONTALLY 
	public void  drawSquares(int howManySquares) {
		for (int i = 0; i < howManySquares; i++) {
			System.out.println(" --  "); }
		
			//System.out.println(x);
	
	for (int i = 0; i < howManySquares; i++) { 
		System.out.print(" | " + howManySquares + " | ");
	}
	}

}
