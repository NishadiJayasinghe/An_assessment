package APITesting.com.org.assesments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Find the highest occurring character in a string
		 -accept string
		 -fins the character which is occurring the maximum number of times
		 -print the character and the number of occurrences
		 */
		String value = "bbhgsklllll";
		
		String arrString[] = new String[value.length()];
		
		for(int i=0; i<value.length();i++) {
			arrString[i] = String.valueOf(value.charAt(i));
		}
		
		List<String> valuesList = Arrays.asList(arrString);
		Map<String, Integer> finalMap = new HashMap<>();
		
		for(String unique : valuesList) {
			finalMap.put(unique, Collections.frequency(valuesList,  unique));
		}
		
		System.out.println("Max value and count: " + finalMap.entrySet().toArray());
	}

}

