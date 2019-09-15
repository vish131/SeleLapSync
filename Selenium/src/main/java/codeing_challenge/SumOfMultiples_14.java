package codeing_challenge;

import java.util.Scanner;

public class SumOfMultiples_14 {

	public static void main(String[] args) {
		int i, sum = 0;
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number:");
int number = sc.nextInt();
sc.close();

	for (i=0; i<number; i++) {
		if((i%3==0)||(i%5==0)) { sum = sum + i;}
	}
	System.out.println("The sum of multiples of 3 and 5 are "+sum);
	}
}
