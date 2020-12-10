package APITesting.com.org.assesments;

public class Question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Check prime number
		 -accept an integer
		 -check if the number is prime
		 -print the result-if the number is prime
		 */
		int number = 3;
		boolean conditionSelect = false;
		
		for(int i = 2; i<=number; i++) {
			
			if(number %i == 0) {
				conditionSelect = true;
				break;
				
			}
		}
		
		if(!conditionSelect) {
			System.out.println("number is prime :" + number);
		}
	
	}

}
