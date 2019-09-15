package batmancode;

import java.util.ArrayList;

public class J002_Unique_String {

	public static void main(String[] args) {
		String a = "hellow world";
		 a = a.replaceAll(" ", "");
		char[] cs = a.toCharArray();
		
	//	List<char> ar = new ArrayList<>();  //How to declar a char array list

		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<cs.length;i++) 
			if(ar.contains(cs[i])) {} else {
			
			int count=0;
			for(int j=0;j<cs.length;j++) {
				
				if(cs[i]==cs[j]) {
					count++;
				}
			}
			System.out.println(cs[i]+" is repeated for "+count);
			//ar.add(cs[i]);
		} 
		}
	
	// Need to work for sorting highest contributed letter to be printed(only) number contribution
	
	}

