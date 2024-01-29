package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,50,20,40,70,50,20);
		
		
		// find duplicate
		List<Integer> findDuplicate = numbers.stream().filter(i-> Collections.frequency(numbers, i)>1).collect(Collectors.toList());
		System.out.println(findDuplicate);
	}
}
