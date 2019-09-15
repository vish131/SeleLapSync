package codeing_challenge;

public class SecondMaxNumber_08 {

	public static void main(String[] args) {
int i, j;
		int[] intArray = {20,340,21,879,92,21,474,83647,-200};
		int arrSize = intArray.length;
		for (i=0;i<arrSize; i++) {
			for (j=i+1; j<arrSize; j++) {
				if(intArray[i]>intArray[j]) {
					int temp = intArray[i];
					intArray[i]= intArray[j];
					intArray[j]=temp;
					
				}
			}
		}
		
		
		/*Arrays.sort(intArray);
		int arrSize = intArray.length;*/
		
		System.out.println("second largest number:"+intArray[arrSize-2]);	//second largest number
		
		
		for (i=0; i<arrSize; i++) {
			System.out.println(intArray[i]);}

	}

}
