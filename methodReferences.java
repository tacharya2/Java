package udemy;

import java.util.List;
import java.util.stream.Collectors;

public class methodReferences {

	public static void print(Integer num) {
		System.out.println(num);

	}

	public static void main(String[] args) {
		List<String> list = List.of("Ant", "Bat", "Cat", "Dog", "Elephant");
		List<String> x = list.stream().collect(Collectors.toList());
		System.out.println(x);

		List<Integer> lst = list.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(lst);

		list.stream().map(e -> e.length()).forEach(f -> System.out.println(f));

		// Same result above and below <------------------>
		list.stream().map(e -> e.length()).forEach(System.out::println);// Interesting

		list.stream().map(e -> e.length()).forEach(methodReferences::print);// Interesting

		list.stream().map(String::length).forEach(methodReferences::print);// Interesting

		Integer max = List.of(23, 45, 67, 34).stream().filter(methodReferences::isEven).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);
		
		//Use method reference instead of content in the filter and inside the max
		Integer max2 = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max2);
		
		Integer max3 = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((Integer::compare))
				.orElse(0);
		System.out.println(max3);
	}

	public static boolean isEven(Integer number) {

		return number % 2 == 0;
	}


}
