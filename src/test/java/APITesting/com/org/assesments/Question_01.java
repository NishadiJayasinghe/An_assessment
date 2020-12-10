package APITesting.com.org.assesments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question_01 {

	public static void main(String[] args) {
		
		/*Remove duplicate characters from a string
		-Accept a string from the user
		-Remove any duplicate characters in the String
		-Print the result in string
		*/
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a astring");
			String value = sc.nextLine();
			String arrString[] = new String[value.length()];
			
			for(int i=0; i<value.length(); i++) {
				arrString[i] = String.valueOf(value.charAt(i));
			}
			
			List valuesList = Arrays.asList(arrString);
			Set<String>uniqueValues = new HashSet<>(valuesList);
			
			for(String unique : uniqueValues) {
				System.out.print(unique);
			}
	
	}
}
