package udemy;

import java.util.List;

public class SumUsingFunctionalProgramming {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sum = numbers.stream().filter(element -> element % 2 == 0).reduce(0, (num1, num2) -> num1 + num2);

		System.out.println(sum);
		fpSum(numbers);
	}

	private static int fpSum(List<Integer> num) {
		return num.stream().reduce(0, (num1, num2) -> {
			System.out.println(num1 + " - " + num2);
			return num1 + num2;
		});
	}
}
