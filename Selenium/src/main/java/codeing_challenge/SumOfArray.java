package codeing_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");

		int arrSize = sc.nextInt();

		int Array[] = new int[arrSize];

		System.out.println("Enter the value for sum");

		for (i = 0; i < arrSize; i++) {
			Array[i] = sc.nextInt();
		}

		int Sum = 0;
		for (i = 0; i < arrSize; i++) {
			Sum = Sum + Array[i];
		}
		System.out.println("The Sum of Array Number is:" + Sum);

		// sort
		Arrays.sort(Array);

		// printing sorted array
		for (i = 0; i < arrSize; i++) {
			System.out.println(Array[i]);
		}

		// 1st
		System.out.println(Array[0]);

		// 3rd
		System.out.println(Array[arrSize - 3]);
		// nth
		System.out.println(Array[arrSize - 1]);

		sc.close();
	} 
}
