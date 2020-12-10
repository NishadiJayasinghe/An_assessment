package APITesting.com.org.assesments;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Running sum
		 -write pseudo code that will calculate a running sum
		 -a user will enter numbers that will the added to the sum and when a negative number is encountered. stop adding numbers
		 -write out the final result
		 */
		
		Scanner sc = new Scanner(System.in);
		int  numbersCount = 3;
		int count = 0;
		
		for(int i=0; i<numbersCount; i++) {
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
			if(num < 0) {
				break;
			}
			count += num;
		}
		
		System.out.println("Total sum is : " + count);
	}

}
