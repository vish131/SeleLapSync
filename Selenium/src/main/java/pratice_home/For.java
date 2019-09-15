package pratice_home;

public class For {

	public static void main(String[] args) {
			//simple_for loop
		
		for(int i=0;i<5;i++) {
			
			//if_else
			
			if(i%2==0) {
			System.out.println(i+" hi");
			}
			else {
				System.out.println(i+" hello");
			}		}
		

	int j;
	switch (j = 8)
	{
		case 1: System.out.println("1");
		break;
	case 2: System.out.println("2");
	break;
	case 3: System.out.println("3");
	break;
	
	default: System.out.println("invalid number");
	}
	
	System.out.println("****vz***");
	int number=154,digit=5;
	
	while(Integer.toString(number).contains(Integer.toString(digit))) {number--;}
	System.out.println(number);
	
	
	String input="Good looking";
	String output="";
	char b[]=input.toLowerCase().replace(" ", "").toCharArray();
	for(int i=0;i<b.length;i++) {
		if(output.indexOf(b[i])==-1) {output=output+b[i];}
	}
	System.out.println("output"+output);
}
}