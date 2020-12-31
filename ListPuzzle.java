package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPuzzle {

	public static void main(String[] args) {

		// treat mixed elements as Object return type
		List<Object> values = Arrays.asList("A", 'A', 1, 1.2);
		System.out.println((values));

		// How to access each elements
		Object n = values.get(1);
		System.out.println(n);

		// Getting an instance of an mixed list
		boolean instance = values.get(1) instanceof Character;// Float, Integer, String, Double
		System.out.println(instance);

		// Copying into another List (object)
		List<Object> objects = new ArrayList<>(values);
		System.out.println(objects);
		System.out.println(objects.indexOf("A"));

		Object removed = objects.remove(2);
		System.out.println(removed);


	}

}