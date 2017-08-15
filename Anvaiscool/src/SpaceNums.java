import java.util.Scanner; 
import java.util.HashSet;
import java.math.*;
public class SpaceNums {
/** 123456 
 * get it, /100000%10
 * print it, not ln add space 
 */
	public static void main(String[] args){ 
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter a six digit number.");
		int num = keyboard.nextInt();
		separateNum(num);
        //Take three numbers from the user and print the greatest number. 
		System.out.println("Input first number");
		int num1 = keyboard.nextInt(); 
		System.out.println("Input second number");
		int num2 = keyboard.nextInt(); 
		System.out.println("Input third number");
		int num3 = keyboard.nextInt(); 
		findMax(num1, num2, num3); 
		
		//Write a Java program to reverse an integer number. 
		//enter num up to 6 digits. add the /100 %10. make the strings print reverse order 
		System.out.println("Enter an integer number up to 6 digits");
		int num4 = keyboard.nextInt(); 
		reverseInt(num4); 
		
	//Write a Java program to count the absolute distinct value in an array. 
      System.out.println("Kindly insert the number of items you want in your set");
      int setNum = keyboard.nextInt(); 
      int disNum = absArray(setNum); 
      System.out.println("The amount of absolute distinct values in your array is " + disNum); 
      
      //ask if user wants a pic of a flag 
      //if no, return, if yes ignore case, and link to method printing flag. print here you go! 
//      System.out.println("Wanna see a coded flag?");
//      String answer = keyboard.nextLine();
//      if (answer.equalsIgnoreCase("YES")){
//    	  System.out.println("Here you go!");
    	  printFlag();  
    	  } 
	
	public static void separateNum(int n){
		int s = n/100000%10; //1.23456 w remainder 1
		int t = n/10000%10; //rem 2
		int u = n/1000%10;//rem 3
		int v = n/100%10; //rem4
		int w = n/10%10;//rem5
		int x = n%10; //rem6 
		System.out.println(s + " " + t + " " + u + " " + v+ 
				" " + w + " " + x);
	}
	
	public static void findMax(int n, int m, int l){
//		1  4  5
//if 1 > 4 , else 
//4 is greatest 
//if 5 >4, 5 is greatest. Else, 4 is greatest
int max; 
if (n>m) 
	max = n; 
else
	max = m;
if (l>max)
	max = l;
System.out.println("The maximum value is " + max);
	}
	
	public static void reverseInt(int n){
		int s = n/100000%10; //1.23456 w remainder 1
		int t = n/10000%10; //rem 2
		int u = n/1000%10;//rem 3
		int v = n/100%10; //rem4
		int w = n/10%10;//rem5
		int x = n%10; //rem6 
		
		System.out.println(x+" " + w+" " +v +" "+u + " " + t + " "+ s); 
	}
	
	//WRITE DOWN NUMBER Of items you want in set 
			//with that number, create for method and if the num is not already in set add it 
			//print out count 
	public static int absArray(int numSet) { 
		int count = 0; 
		HashSet<Integer>set = new HashSet <Integer>();
		Scanner keyboard = new Scanner(System.in); 
		for (int i=0; i<numSet; i++){
			System.out.println("Enter number " + (i+1) + " to insert ");
			int n = keyboard.nextInt(); 
			
			int ab = Math.abs(n);
			
			if (!set.contains(ab)){
				set.add(ab);
			count++;}
		}
		return count;
	}
	
	public static void printFlag(){
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Wanna see a coded flag?");
//	      String answer = keyboard.nextLine();
//	      if (answer.equalsIgnoreCase("YES")){
	    	  System.out.println("Here you go!");
		String a = "* * * * * *   ====================";
		String b= "* * * * * * * ====================";
		String c ="=================================="; 
		for (int i=0; i<3; i++){
			System.out.println(a); 
			System.out.println(b); 
		}
		for (int i = 0; i <5;i++){ 
			System.out.println(c);
	}	
}
}