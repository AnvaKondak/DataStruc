/** This hw assignment will be used to implement the bubble sort algorithm */ 
import java.util.Random; 

public class KondakciuAnvaHW5 {

	public static void bubbleSort (int[] array) {
		 int lastE; //last element being compared
		 int i; 
		 int temp; //useful when swapping elements  
		 
		 for (lastE = array.length-1; lastE >= 0; lastE-- ) {
			  for (i = 0; i <= lastE-1; i++) {
				  if (array[i] > array[i+1]) {
					  temp = array[i]; 
					  array[i] = array[i+1]; 
					  array[i+1] = temp; 
				  }
			  }
		 }
		 
	}
	
	public static void main (String[] args) { 
		Random rand = new Random (); 
		int[] n = new int[10]; 
		for (int j = 0; j <10; j ++){
		int num = rand.nextInt(2000 );
		n[j] = num; 
		//System.out.println(n[j]); 
	}
		System.out.println("Not sorted list");
		for (int e : n)
			System.out.print(e + " ");
		System.out.println();
		KondakciuAnvaHW5.bubbleSort(n); 
		System.out.println("Sorted list");
		for (int e: n) 
			System.out.print(e + " ");
		
		
		
		
		
	}
}
