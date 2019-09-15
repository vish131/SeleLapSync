package batmancode;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class J010_Palindrome_String {

	public static void main(String[] args) {
		
		String M = "malayalam";
		
		StringBuilder sb = new StringBuilder(M);
		
		String rev1 = sb.reverse().toString();
		String rev2 = sb.toString();
		
		if(rev1.equals(rev2)) {
			System.out.println("its a palendrome");
		} else {
			System.out.println("its not a palendrome");
		}
		

		/*char[] ch = M.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			ArrayList<E>*/
			
		}

	}

