package pratice_home;

public class LengthOfName {

	public static void main(String[] args) {
 //Name input
		int i;
	String[] personName = {"Ram", "Ramana", "Tamil", "English", "India", "Praveen"};
	for (String string : personName) {
		System.out.println(string.length());
		
	}

		//System.out.println(personName.length);
	//To find length of name	
	
	for (i=0; i<5; i++)
	{
		System.out.println(personName[i].length());
	}
	
	/*System.out.println(personName[0].length());
	System.out.println(personName[1].length());
	System.out.println(personName[2].length());
	System.out.println(personName[3].length());
	System.out.println(personName[4].length());
	*/
	
	}

}
