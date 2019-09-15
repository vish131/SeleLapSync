package pratice_home;

import java.util.Scanner;

public class TrainPassingPole {

	public static void main(String[] args) {
		double length_of_train;
		double speed_of_train;
		double time_taken;
		Scanner sc = new Scanner(System.in);
		System.out.println("***To enter the length of the train in kilometer press 1 in meter press 2");
		int length_choice=sc.nextInt();
		System.out.println("Enter the length of th train:");
		
		length_of_train=sc.nextInt();
		if(length_choice==2) {length_of_train=length_of_train*(5/18.0);}
		System.out.println(length_of_train);
		System.out.println("Enter the speed of the train:");
		speed_of_train=sc.nextInt();
		System.out.println("speed"+speed_of_train);
		time_taken=length_of_train/speed_of_train;
		System.out.println("the time taken for the train to pass the pole:"+time_taken);
		

	}

}
