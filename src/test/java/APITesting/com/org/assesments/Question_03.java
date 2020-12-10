package APITesting.com.org.assesments;

import java.util.Arrays;

public class Question_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] array = {3,4,1,5,9};
		int temp;
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int value : array) {
			System.out.println(value);
		}
			
	}

}
