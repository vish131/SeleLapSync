package codeing_challenge;

import java.util.HashSet;

public class RepeatedNumbers_06 {

	public static void main(String[] args) {
		
int Array[] = {13,65,15,67,88,65,13,99,67,13,65,87,13};
	HashSet setOne = new HashSet();
	HashSet setTwo = new HashSet();
	
	for (int a : Array ){
		if(!setOne.add(a)) {
			setTwo.add(a);
		}
	}
	System.out.print("The Repeated Numbers are : ");
	for(Object reptd : setTwo )
	System.out.print(reptd+" ");
	
	}

}
