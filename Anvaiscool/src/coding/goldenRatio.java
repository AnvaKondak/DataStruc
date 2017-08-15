package coding;

public class goldenRatio {
	
	public static double gRatio(int n) { 
		if (n==0) 
			return 1; 
		else if (n>0) { 
			double ratio = 1 + (1/gRatio(n-1)); 
			return ratio;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		System.out.print(gRatio(5));

	}

}
