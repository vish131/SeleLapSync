package batmancode;

public class J006_Fibonacci {

	public static void main(String[] args) {

		int N1=0, N2=1, N3, count=10;
		System.out.println(N1);
		System.out.println(N2);
		
		for(int i=2; i<=count; i++) {
			N3 = N1+N2;
			System.out.println(N3);
			N1=N2;
			N2=N3;
			
		}
		
		
	}

}
