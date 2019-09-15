package batmancode;

public class J003_Reverse_a_String_WO_stringFunction {

	public static void main(String[] args) {
		String V = "Vishnu Kumar";
		V = V.replaceAll(" ", "");
		
		char[] VK = V.toCharArray();
		
		for(int i=VK.length-1;i>=0;i--) {
			
		System.out.print(VK[i]);			

		}		
	}
}
