package codeing_challenge;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i,  R;
		for(i=100; i<=200; i++)
		{
			int n = 0, NewNumber = 0;
			n = i;
		while(n!=0)
		{
			R = (n%10);
			NewNumber = NewNumber+(R*R*R);
			n=(n/10);
		}


		if (NewNumber==i)
		{System.out.println(i);}
		}
	}

}
