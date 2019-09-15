package codeing_challenge;

import java.util.Scanner;

public class FizzBuzz_04_2 {

	public static void main(String[] args) {
		int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number from");
int getOne = sc.nextInt();
System.out.println("Enter Number to");
int getTwo = sc.nextInt();

for (i=getOne; i<=getTwo; i++)
		if ((i%3==0) && (i%5==0)) {System.out.println("FizzBuzz");}	
		else if(i%3==0) {System.out.println("Fizz");}
		else if (i%5==0) {System.out.println("Buzz");}
		//else if ((i%3==0) && (i%5==0)) {System.out.println("FizzBuzz");}
		else {System.out.println(i);}

	sc.close();
	}

}
