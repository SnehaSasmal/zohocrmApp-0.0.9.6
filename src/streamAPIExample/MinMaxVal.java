package streamAPIExample;

import java.util.*;

public class MinMaxVal {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(5,1,9,44,21);
		
		//finding min and max value
		Integer min = numbers.stream().min(Integer::compare).orElse(0);
		
		Integer max = numbers.stream().max(Integer::compare).orElse(0);
		
		System.out.println("Minimum value is :"+min);
		System.out.println("Maximum value is :"+max);
	}
}
