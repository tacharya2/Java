package udemy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list1 = new MyCustomList<>();
		list1.addElement("Element 1");
		list1.addElement("Element 2");

		String value = list1.get(0);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(25));
		list2.addElement(Integer.valueOf(24));
		Integer number = list2.get(0);

		System.out.println(list1);
		System.out.println(list2);

		System.out.println(value);
		System.out.println(number);

		String value2 = doubleValue(new String());
		Integer value3 = doubleValue(Integer.valueOf(5));
		ArrayList<Integer> value4 = doubleValue(new ArrayList<>());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
		duplicateList(numbers);
		System.out.println(numbers);

		// Works the same way with the LinkedList
		LinkedList<Integer> linkednumbers = new LinkedList<>(List.of(1, 2, 3, 4));
		duplicateList(linkednumbers);
		System.out.println(linkednumbers);

	}

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicateList(X list) {
		list.addAll(list);
	}
}
