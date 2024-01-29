package streamAPIExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapElementExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,4,7);
		
		//map elements to its square
		List<Integer> squareValues = numbers.stream().map(num-> num*num).collect(Collectors.toList());
		System.out.println("Square of the elements are :"+ squareValues);
	}
}
