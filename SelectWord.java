package udemy;

//Logic syntax using functional programming
import java.util.List;

public class SelectWord {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Dog", "Cat");
		printWithoutFunctionalProgramming(list);
		printWithFunctionalProgramming(list);

	}

	// Normal way
	private static void printWithoutFunctionalProgramming(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println("Normal way: " + string);
			}
		}
	}

	private static void printWithFunctionalProgramming(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}
}
