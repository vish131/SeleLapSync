package pratice_home;

import java.util.Scanner;

public class NumToWord {

	public static void main(String[] args) {
		String units[]= {"","one","two","three","four","five","six","seven","eight","nine","ten"};
		String  two[]= {"","eleven","twelve","thriteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[]= {"","","twenty","thrity","fourty","fifty","sixty","seventy","eighty","ninety"};
		
		//get the number
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number==0) {
			System.out.println("Zero");
		}
		else if(number>0 && number<11) {
			System.out.println(units[number]);
		}
		else if(number>10 && number<20) {
			System.out.println(two[number%10]);
		}
		else if(number>20 && number<1000) {
			int temp=number;
			int count=0;
			
			while(temp!=0) {
				temp=temp/10;
				count++;
			}
			
			if(count==2) {
				System.out.print(tens[number/10]+" ");
				System.out.print(units[number%10]);
			}
			if(count==3) {
				System.out.print(units[number/100]+" "+"hundred"+" ");
				number=number-((number/100)*100);
				System.out.print(tens[number/10]+" ");
				System.out.print(units[number%10]);
			
			}
		}
		sc.close();
	}

}
