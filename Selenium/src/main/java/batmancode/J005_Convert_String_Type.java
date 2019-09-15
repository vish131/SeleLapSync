package batmancode;

public class J005_Convert_String_Type {

	public static void main(String[] args) {

		String S = "12345";
		int I = 12345;
		
		int SV =Integer.parseInt(S); //String to Value
		String IS = String.valueOf(I); //Int to String
		
		System.out.println(SV);
		System.out.println(IS);
		
	}

}
