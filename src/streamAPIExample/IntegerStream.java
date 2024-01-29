package streamAPIExample;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,33,47,33,60,77,50,60);
		
		// Even number
		List<Integer> even = numbers.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers are : "+even);
		
		
		// Odd number
		List<Integer> odd = numbers.stream().filter(i-> i%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers are : "+odd);
		
		
		// Find duplicate                                                                   
		List<Integer> findDuplicate = numbers.stream().filter(i-> Collections.frequency(numbers, i)>1).collect(Collectors.toList());
		System.out.println("Dplicate values inside the list : "+findDuplicate);
		
		
		// Remove duplicate
		List<Integer> removeDuplicate = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate);
		
		
		
		// Sort the array in ascending order
		List<Integer> ascOrder = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Array in ascending order is :" + ascOrder);
		
		
		// Sort the array in descending order
		List<Integer> descOrde = numbers.stream().sorted((num1, num2) -> num2.compareTo(num1)).collect(Collectors.toList());
		System.out.println("Array in descending order is :"+ descOrde);
		
		
		
		// Max Value
		Integer max = numbers.stream().max(Integer::compare).orElse(0);
		System.out.println("Maximum value is = "+max);
		Integer maxx = numbers.stream().max((a,b) -> Integer.compare(a, b)).orElse(0);
		System.out.println(maxx);
		
		
		
		// 2nd Max
		Optional<Integer> secondMax = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second max num is : "+ secondMax.get());
		
		
		
		// Min Value
		Integer min = numbers.stream().min(Integer::compare).orElse(0);
		System.out.println("Minimum value is = "+min);
		Integer minn = numbers.stream().min((a,b) -> Integer.compare(a,b)).orElse(0);
		System.out.println(minn);
		
		
		
		// 2nd Min
		Integer secMin = numbers.stream().sorted().skip(1).findFirst().get();
		System.out.println("Second min value is : "+ secMin);
		
		
		
		// Finding the sum of the elements
		Integer sum = numbers.stream().reduce(Integer::sum).orElse(0);
		System.out.println("the sum of the element is : "+sum);
		
		
		
		// Reverse the element
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
		
		
		//  find the num less than 40
		numbers.stream().filter(i-> i<40).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		
		
		// find the number  greater than 40
		numbers.stream().filter(i-> i>40).collect(Collectors.toList()).forEach(System.out::println);
	
		
		
	}
}

