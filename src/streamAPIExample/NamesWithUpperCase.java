package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class NamesWithUpperCase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("apple","Banana","manGO","licHi");
		
		//convert names with upper case
		List<String> newNames = names.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(newNames);
		
		
		
		
		// to lower case
		names.stream().map(name-> name.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);
	
	
	}
}
