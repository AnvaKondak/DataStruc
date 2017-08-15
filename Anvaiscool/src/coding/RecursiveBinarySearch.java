package coding;

import java.util.Scanner;

public class RecursiveBinarySearch {
/** This oprogram demonstrates the recursive binary search */ 
	public static void main(String[] args) {
		int searchValue; //value to search for 
		int result; //resrch result 
		String input; //a line of input 
		char again; //to hold a single character
		
 //The values in the following array are distributed 
		//in ascending order. 
		int numbers[] = {101, 142, 147, 189, 199, 207, 222, 
				234, 289, 296, 310, 319, 388, 394, 417, 429, 447, 
				521, 536, 600};  
		
		//Create a scanner object for keyboard input. 
		Scanner keyboard = new Scanner(System.in); 
		
		do { 
			//get a value to search for 
			System.out.print("Enter a value to search for");
        searchValue = keyboard.nextInt(); 
        
        //search for the value 
        result = binarySearch(numbers, 0, (numbers.length-1), searchValue); 
        
        //display results 
        if (result == -1) { 
        	System.out.println(searchValue + " was not found");
        }
        else 
        { System.out.println(searchValue + " was found at " +
        "element " + result); 
        }
        
       System.out.print("Do you want to search again? " +
       "(Y or N): "); 
       
       //consume remaining newline 
           keyboard.nextLine(); 
		
       input = keyboard.nextLine(); }
		while (input.charAt(0)=='y' ||
				input.charAt(0) == 'Y'); 
	}
		/** binarySearch method performs a  binary search on an integer array.
		 * @param array The array to search '
		 * @param first The first element in the search range.  
		 * @param last The last element in the search range 
		 * @param value The value to search for 
		 * @return The subscript of the value if found, 
		 * otherwise -1.  
		 * */ 
		 public static int binarySearch (int[] array, int first, 
				 int last, int value) { 
			 int middle; // middle point of search 
			 //test for the base case 
			 //where the value is not found. 
			 if (first> last) 
				 return -1; 
				 
				 //calculate the middle position 
				 middle = (first + last)/2; 
				 
				 //search for the value 
				 if (array[middle] == value) 
					 return middle; 
				 else if (array[middle] < value) 
					 return binarySearch(array, middle +1, last, value);
				 else return binarySearch(array, first, middle-1, value); 
			 }
			 
        
	

}
