package codeing_challenge;

import java.util.Scanner;

public class Percentage_character_11 {

	public static void main(String[] args) {
		int i;
		int countupper, countlower, countdigit, countspecial;
		countupper= countlower = countdigit = countspecial = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String validstring = sc.nextLine();
		sc.close();
		float size = validstring.length();
		for(i=0; i<size; i++) {
			char ch = validstring.charAt(i);
			if(Character.isUpperCase(ch)) {countupper++;}
			else if (Character.isLowerCase(ch)) {countlower++;}
			else if (Character.isDigit(ch)) {countdigit++;}
			else {countspecial++;}
		}
			System.out.println("The number of uppercase is "+countupper+". So the percentage is "+ ((countupper/size)*100)+"%");
			System.out.println("The number of lowercase is "+countlower+". So the percentage is "+ ((countlower/size)*100)+"%");
			System.out.println("The number of digits is "+countdigit+". So the percentage is "+ ((countdigit/size)*100)+"%");
			System.out.println("The number of special character is "+countspecial+". So the percentage is "+ ((countspecial/size)*100)+"%");
	}

}
