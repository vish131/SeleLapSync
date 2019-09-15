package pratice_home;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="alpha beta gamma";
		/*char[] arr=new char[25];
		for(int i=0;i!='\0';i++) {
		arr[i]=input.split(" ");	
		}
		*/

		/*System.out.println(Arrays.toString(input.split(" ")));
		String string = Arrays.toString(input.split(" "));
		
		System.out.println("l:"+string.length());
		*/
		/*for(int i=string.length()-1;i>=0;i--) {
			System.out.println(string);
		}*/	
		
		//String[] words = input.split(" ");
		/*String firstWord = words[0];
		System.out.println("words"+firstWord);*/
		
		String[] words = input.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
