package coding;

public class ArrayGrid {
	 public static void main(String[] args) {
	  int rows = 6; 
	  int columns = 10; 
	  int i,j;
	  char[][] arr = new char[rows][columns]; 
	  
	  for (i=0; i< rows; i++) {
	    for (j = 0; j<columns; j++)
	           { 
	   arr[i][j] = '_'; 
	    System.out.print(arr[i][j] + " ");
	   }
	  
	   System.out.println(" ");
	   }
	  
	  
	 }

	}
