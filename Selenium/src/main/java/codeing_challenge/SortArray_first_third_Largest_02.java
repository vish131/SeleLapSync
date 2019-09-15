package codeing_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray_first_third_Largest_02 {

	public static void main(String[] args) {
		int i;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter size of array");
 
int arrSize = sc.nextInt();

int Array[] = new int [arrSize];

System.out.println("Enter the value for Array");

for (i=0; i<arrSize; i++)
	{
	Array[i] = sc.nextInt();//get values
	//System.out.println(Array[i]);//to print
	
	}

Arrays.sort(Array);

System.out.println(Array[arrSize-1]);
System.out.println(Array[arrSize-3]);
sc.close();
	}

}
