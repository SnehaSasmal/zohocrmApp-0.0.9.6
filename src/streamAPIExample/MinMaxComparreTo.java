package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class MinMaxComparreTo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,80,30,50,10,20,80);
		
		
		//MAX
		Integer max = numbers.stream().max((num1,num2)-> num1.compareTo(num2)).orElse(0);
		System.out.println(max);
		
		
		
		
		
		//MIN
		Integer min = numbers.stream().min((num1,num2)-> num1.compareTo(num2)).orElse(0);
		System.out.println(min);
	}
}
