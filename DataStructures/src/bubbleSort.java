
public class bubbleSort {
 
public static void  bubblesort(String[] arr){ 
 //int length = arr.length; 
 String temp = ""; 
 
 for (int i =0; i<arr.length-1;i++){
  for (int j=i+1; j<arr.length;j++){
   //swap 
    if(arr[j].compareTo(arr[i])<0){
   temp = arr[i]; 
   arr[i]=arr[j]; 
   arr[j]=temp; 
  }
  }}
}


public static void main(String[] args){ 
 System.out.println("Previous order: ");
 String[] arr= {"zanva", "cats","no", "islostinspace", "aerialsilks", "hoop", "skillsbrah", "zimbabwe"};
   for (int i=0; i<arr.length; i++){ 
    System.out.print(" "+ arr[i] + " "); 
   }
   System.out.println(); 
   System.out.println("Alphabetical order");
 bubblesort(arr); 
 for(int i=0; i<arr.length; i++){ 
  System.out.print( arr[i]+ " ");
 }
}
}
