package codeing_challenge;

import java.util.Scanner;

public class Palindrome_04 {

	public static void main(String[] args) {
		int i;
 String a,b;
 b=""; 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 a = sc.nextLine();
 int stringLength = a.length();
 
 for(i=stringLength-1; i>=0; i--) {
	 b = b+ a.charAt(i);
 }
if (b.equals(a))
{System.out.println("its a Palindrome word");}
else {System.out.println("its not a Palindrome word");}
 
sc.close();
	}

}
