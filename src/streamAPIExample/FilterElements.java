package streamAPIExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterElements {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sneha","Adidti","Boomika","Shraboni");
		
		//filter names starts with 'S'
		names.stream().filter(i-> i.startsWith("S")).collect(Collectors.toList()).forEach(System.out::println);
	}

}
