package codeing_challenge;

import java.util.Scanner;

public class ArithmeticOperation_03 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter First number");
 int inputOne = sc.nextInt();
 System.out.println("Enter Second number");
 int inputTwo = sc.nextInt();
 System.out.println("Enter operation to be done(addition/subration/multiply/division)");
 String operation = sc.next();
 int a=inputOne;
 int b=inputTwo;
 
 switch(operation){
	 case "addition" :
	 System.out.println("addition value is"+(a+b));
	 break;
	 case "subration" :
		 System.out.println("subration value is"+(a-b));
	 break;
	 case "multiplication" :
		 System.out.println("multiplication value is"+(a*b));
	 break;
	 case "division" :
		 System.out.println("division value is"+(a/b));
	 break;
	 
 }
  sc.close();

	}

}
