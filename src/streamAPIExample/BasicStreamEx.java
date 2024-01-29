package streamAPIExample;

import java.util.*;

public class BasicStreamEx {
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(1,4,7,9,13);
		
		//print all the numbers in the list using foreach
		num.stream().forEach(System.out::println);
				
	}
}
