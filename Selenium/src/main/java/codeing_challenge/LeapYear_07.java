package codeing_challenge;

import java.util.Scanner;

public class LeapYear_07 {

	public static void main(String[] args) {
System.out.println("Enter the Year to find wheather its a leap year ain't");
Scanner sc = new Scanner(System.in);
int getYear = sc.nextInt();

if((getYear%4 ==0 && getYear%100 !=0)||(getYear%400 ==0)) {
	System.out.println("it's a Leap Year");}
else {System.out.println("it's not a Leap Year");}
sc.close();
}
	}