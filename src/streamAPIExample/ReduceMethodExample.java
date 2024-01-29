package streamAPIExample;

import java.util.*;

public class ReduceMethodExample {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		
		
		//finding sum using the reduce method
		Integer sum = numbers.stream().reduce(Integer::sum).orElse(0);
		System.out.println("Sum is = "+sum);
	}
}
