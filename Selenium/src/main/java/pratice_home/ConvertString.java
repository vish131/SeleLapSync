package pratice_home;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		int i=0,j;char arr;
		
		//get the input String
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		
		
		//get the length of the string
		int length = input.length();
		//System.out.println("length of the string:"+length);
		//get an array
		//char array[]=new char[length];
		
		while(i<length) {
			//System.out.println("value i"+i);
			int count = 1;
			arr=input.charAt(i);
			
			System.out.println("value arr:"+arr);
			for(j=i+1;j<length;j++) {
				//System.out.println("value j:"+j);
				if(arr==input.charAt(j)) {
					count++;
					////System.out.println("in if loop ,count:"+count);
				}
				else {
					System.out.println(arr+""+count);
					i=j;
					//System.out.println("revising i's value with help of j"+i);
					
					break;
				}
			}
			//System.out.println(arr);
			
		}

		sc.close();
		
		//ERROR:LAST CHARACTER IS NOT TAKEN AND C LOOP IS GOING INFINITE. 
	}

}
