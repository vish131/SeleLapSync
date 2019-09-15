package batmancode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class J001_Unique_Number {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,4,5,6,7,5,6,7,8,9};

		ArrayList<Integer> ar = new ArrayList<Integer>();
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

		for(int i=0; i<(a.length); i++){
			if(ar.contains(a[i])){} else {ar.add(a[i]);		

			int K=0;
			for(int j=0; j<(a.length);j++) {

				if(a[i]==a[j]) {
					K++;
				}
			}
			System.out.println(a[i]+"is repeated for"+K);
			
			//mp.add(a[i],K);  Need to work for sorting highest unique number contribution
			}
		}
		
		
		
		
		
	}
}
