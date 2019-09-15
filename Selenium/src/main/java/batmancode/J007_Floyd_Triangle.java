package batmancode;

public class J007_Floyd_Triangle {

	public static void main(String[] args) {
		//Floyd's triangle is a right-angled triangular array of natural numbers, used in computer science education. It is named after Robert Floyd.
		int K=0;
		for (int i=1;i<6;i++) {
		
		for(int j=i;j>=1;j--) {
			K=K+1;	
			System.out.print(K);
		} 
		System.out.println();
		
		}
	}

}
