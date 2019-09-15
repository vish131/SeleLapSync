package pratice_home;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScisscor {

	public static void main(String[] args) throws IOException {
		char ch;
		int c_count = 0,h_count=0;
		Scanner sc = new Scanner(System.in);
		
	  
		System.out.println("******Rock_Paper_Scisscor******");
		System.out.println("Instruction\n1. For Rock press \'R\'\n2. For Paper press \'P\'\n3. For scisscor press \'S\'");
		for(int i=0;i<3;i++)
		{
		  ch = sc.next().charAt(0);
		//c=(char)System.in.read();
		//int com = 1+(int)Math.random()*((3-1)+1);
		  Random rn = new Random();
		  int com=rn.nextInt(3 - 1 + 1) + 1;

		System.out.println(com);
		
			if(ch=='R'&& com==1)      {System.out.println("Tie");}
			else if(ch=='R'&& com==2) {System.out.println("Computer wins");c_count++;}
			else if(ch=='R'&& com==3) {System.out.println("Human wins");h_count++;}
			
			else if(ch=='P'&& com==1) {System.out.println("Human wins");h_count++;}
			else if(ch=='P'&& com==2) {System.out.println("Tie");}
			else if(ch=='P'&& com==3) {System.out.println("Computer wins");c_count++;}
			
			else if(ch=='S'&& com==1) {System.out.println("Computer wins");c_count++;}
			else if(ch=='S'&& com==2) {System.out.println("Human wins");h_count++;}
			else if(ch=='S'&& com==3) {System.out.println("Tie");}
			
			
			
		}
		if(h_count>c_count) {
			System.out.println("You won!!");
		}
		else if(c_count>h_count){
			System.out.println("Computer won!!");
		}
		else {
			System.out.println("Its a Tie!!");
		}
		
			}
	

}

