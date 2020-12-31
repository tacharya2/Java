package udemy;

//All about continuous dot syntax
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = sum(arr);
		System.out.println("Normal: " + total);// No idea why it couldn't print the sum
		/*-------------------------------------------*/
		List<Integer> list = List.of(3, 5, 3, 213, 46, 4, 7, 213, 10);

		// sorted to sort
		list.stream().sorted().forEach(e -> System.out.println(e));

		// distinct elements if repeated
		list.stream().distinct().forEach(e -> System.out.println(e));

		// distinct and sorted
		list.stream().distinct().sorted().forEach(e -> System.out.println(e));

		// square each element and print
		list.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));

		// square and sort
		list.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));

		// Print the squares of first 10 integers; clue-IntStream.range(0,10)
		IntStream.range(0, 10).map(e -> e * e).forEach(p -> System.out.println(p));

		// List.of("Apple", "Ant", "Bat").stream();
		// Map all these to lower case and print them
		List.of("Apple", "Ant", "Bat").stream().map(f -> f.toLowerCase()).forEach(e -> System.out.println(e));

		// List.of("Apple", "Bat", "Ant").stream();
		// Print the length of each element
		List.of("Apple", "Bat", "Ant").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	
		// Sum up the first 10 integers
		int sum1 = IntStream.range(1, 11).reduce(0, (e, f) -> e + f);
		System.out.println(sum1);

		// Find the max of the list
		int maxi = list.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();// can use min same way
		System.out.println(maxi);

		// Print the odd numbers
		list.stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println("Filtered: " + e));// even

		// Convert the above into a list
		List<Integer> lst = list.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());// even
		System.out.println(lst);

		// Create a list of squares of first 10 integers
		List<Integer> list2 = IntStream.range(1, 11).map(i -> i * i).boxed().collect(Collectors.toList());
		System.out.println(list2);

		// write a functional program that return max of odd number.
		int x = list.stream().filter(e -> e % 2 == 1).max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(x);

		boolean x2 = list.stream().filter(e -> e % 2 == 1).max((n1, n2) -> Integer.compare(n1, n2)).isPresent();
		System.out.println(x2);

		int x3 = list.stream().filter(e -> e % 9 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(45);
		System.out.println(x3);
	}

	private static int sum(int[] arr) {
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];

		}
		return tot;
	}
}