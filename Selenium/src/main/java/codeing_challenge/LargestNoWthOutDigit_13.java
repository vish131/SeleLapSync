package codeing_challenge;

import java.util.Scanner;

public class LargestNoWthOutDigit_13 {

	public static void main(String[] args) {
		//int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int number = sc.nextInt();
System.out.println("Enter the Digits");
int digit = sc.nextInt();
sc.close();

while(Integer.toString(number).contains(Integer.toString(digit))) {number--;}
System.out.println("The Largest Number that doesn't contain digit is "+number);
	
/*for (i=number; i>0; i++) {
	if(Integer.toString(i).contains(Integer.toString(digit))) {}
	else {System.out.println("The Largest Number that doesn't contain digit is "+i); break;}*/
}


	}

