package batmancode;

import java.util.Arrays;

public class J004_Anagram_String {

	public static void main(String[] args) {

		String A = "army";
		String B = "mary";
		
		char[] chA = A.toCharArray();
		char[] chB = B.toCharArray();

		Arrays.sort(chA);
		Arrays.sort(chB);
		
		String sa = new String(chA);
		String sb = new String(chB);
		
		if (sa.contains(sb)) {
System.out.println("true");			
		} else {
			System.out.println("false");
		}
	}
}
