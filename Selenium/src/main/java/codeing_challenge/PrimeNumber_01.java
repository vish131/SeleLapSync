package codeing_challenge;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber_01 {

	public static void main(String[] args) throws IOException {
		
	int i, j, n, flag;
	System.out.println("enter the number :");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
		//System.out.println("the n is"+n);
		for (i=2; i<=n; i++)						//initial number (2)
		{ //System.out.println("n value"+n);
			
			flag=0;
			for(j=2; j<i; j++)
				
			{
				if((i%j)==0)
					{flag++; break;}
			}
			
			if(flag==0)System.out.println(i);

		} sc.close();		
	}	
	}



