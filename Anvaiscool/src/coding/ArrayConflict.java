package coding;

public class ArrayConflict {

	public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    int num=3; 
    search(arr, num); 

    System.out.println("The number " + num + " is " + search(arr,num) +
    		" in the array."); 
	}
	public static boolean search(int[] x, int n) { 
		for (int i=0; i<x.length; i++){
		if (x[i]==n) 
			return true; }
		return false; 
	}

}
