package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class NameWithComma {
	public static void main(String[] args) {
		List<String> fruits= Arrays.asList("Mango","Orange","Banana","Apple","Lemon");
		System.out.println(fruits);
		
		
		//Join the names with comma
		String result = fruits.stream().collect(Collectors.joining(", "));
		System.out.println(result);
	}
}
