package codeing_challenge;

import java.util.Scanner;

public class Password_Validation_10 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String pwd = sc.nextLine();
if(isValid(pwd)) {System.out.println("The Password is Valid");}
else {System.out.println("The Password is Invalid");}
sc.close(); 
}
	public static boolean isValid (String pwd)
	{ char c; int i;
	int countdigit= 0, countletter= 0, countupper = 0;
	
	int size = pwd.length();
	if (size<10) {System.out.println("Password is too short"); return false;}
	else { 
		for(i=0; i<size; i++) {
		c= pwd.charAt(i);
		if(!Character.isLetterOrDigit(c)) {System.out.println("Password should not contain special character");return false;}
		else {if(Character.isDigit(c)) {countdigit++;}
			else if(Character.isUpperCase(c)) {countupper++; countletter++;}
				else if (Character.isLetter(c)) {countletter++;}
			}
		if (countdigit<2) {System.out.println("The Password should have more than two digit character");return false;}	
		else if (countletter<2) {System.out.println("The Password should have more than two letter character");return false;}
		else if (countupper<1) {System.out.println("The Password should have atleast one uppercase letter character");return false;}
		} 
			} return true;
			
	} 
	
	}
	

