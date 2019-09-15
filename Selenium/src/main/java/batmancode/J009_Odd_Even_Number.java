package batmancode;

import java.util.Scanner;

public class J009_Odd_Even_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Type the NUmber--------");
		int nextInt = sc.nextInt();
		int oddeven = nextInt%2;
		
		if(oddeven==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
