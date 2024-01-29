package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(10,20,40,50,60,20,40,10);
		
		
		//remove duplicate
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
