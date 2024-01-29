package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class NamesInAscending {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sneha","sita","gita","anu","tuli");
		
		//print the names in ascending order
		List<String> namesAsc = names.stream().sorted().collect(Collectors.toList());
		System.out.println(namesAsc);
		
		
		
		//print the names in descending order
		List<String> descendingName = names.stream().sorted((name1,name2)-> name2.compareTo(name1)).collect(Collectors.toList());
		System.out.println(descendingName);
	}
}
