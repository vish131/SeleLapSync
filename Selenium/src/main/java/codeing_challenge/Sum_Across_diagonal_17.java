package codeing_challenge;

import java.sql.Array;
import java.util.Scanner;

import org.apache.poi.util.ArrayUtil;

public class Sum_Across_diagonal_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count for N*N cross matrix");
		int rowCount = sc.nextInt();
		int matrix [][] = new int [rowCount][rowCount];

		int arraySize = ((rowCount * rowCount)-rowCount)/2;

		int upperDiagonal[] = new int [arraySize];
		int lowerDiagonal [] = new int [arraySize];
		int i,j;
		for(i=0; i<rowCount; i++) {
			for (j=0; j<rowCount; j++) {
				System.out.println("Enter a["+i+"]["+j+"] :");
				matrix[i][j] = sc.nextInt();
			} 
		}
		for (i=0; i<rowCount; i++) {
			for(j=0; j<rowCount; j++) {
				System.out.print(matrix[i][j]+" ");
			} System.out.println();

		}

int pos1 = 0;
int pos2 = rowCount-1;
int k=0, l=0, upperSum=0, lowerSum=0;

	for (i=0; i<rowCount; i++) {
		for (j=0; j<rowCount; j++) {
			if (matrix[i][j]!= matrix[pos1][pos2]) {
				if(j<pos2) {
					upperDiagonal[k]= matrix [i][j]; k++;
					upperSum = upperSum + matrix [i][j];
				} else {
					lowerDiagonal[l]= matrix[i][j]; l++;
					lowerSum = lowerSum + matrix[i][j];					
				}
			}
		} pos1++; pos2--;
	} System.out.println("Upper Sum is :"+upperSum);
	System.out.println("Lower Sum is :"+lowerSum);
	if(upperSum<lowerSum)	
	{for(i=0; i<=arraySize; i++)
	{System.out.println(lowerDiagonal[i]);}}
	else{for(i=0; i<=arraySize; i++) {System.out.println(upperDiagonal[i]);}
	}}
	}
	
