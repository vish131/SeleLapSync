package codeing_challenge;

import java.util.Scanner;

public class Unique_Character_18 {

	public static void main(String[] args) {
		String output=""; int i;
		Scanner sc = new Scanner(System.in);
		String getWord = sc.nextLine();
		char input [] = getWord.toLowerCase().replace(" ","").toCharArray();
		int size = input.length;
		for(i=0; i<size;i++) {

			if(output.indexOf(input[i])==-1) {
				output = output + input[i];
			}
		} System.out.println(output);
	}
}
