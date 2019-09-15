package codeing_challenge;

import java.util.Scanner;

public class Floyd_Triangle_09 {

	public static void main(String[] args) {
		int i,j,k = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number(line) for creating Floyd Triangle");
		int n = sc.nextInt();
		for (i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++; }
			System.out.println();
		} sc.close();
	}
}
