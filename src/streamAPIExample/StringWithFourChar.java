package streamAPIExample;

import java.util.*;

public class StringWithFourChar {
	public static void main(String[] args) {
		List<String> names= Arrays.asList("Stallin","Max","Bob","Coll");
		
		// filter   the names more  than 4 char
		names.stream().filter(name-> name.length()>= 4).forEach(System.out::println);
	}
}
