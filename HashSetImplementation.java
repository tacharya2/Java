package udemy;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSetImplementation {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();// New empty HashSet is created
		numbers.add(4);
		numbers.add(44);
		numbers.add(64);
		numbers.remove(4);
		numbers.add(100);

		System.out.println(numbers.contains(4));
		
		System.out.println(numbers);// Prints randomly

		Set<Integer> linkedNumbers = new LinkedHashSet<>();// New empty Linked HashSet is created

		linkedNumbers.add(54);
		linkedNumbers.add(14);
		linkedNumbers.add(24);
		linkedNumbers.add(34);

		System.out.println(linkedNumbers);// Prints in the order they were added. No duplicates

		Set<Integer> treeNumbers = new TreeSet<>();// New empty Linked HashSet is created.No duplicates
		treeNumbers.add(54);
		treeNumbers.add(34);
		treeNumbers.add(24);
		treeNumbers.add(14);
		treeNumbers.add(44);
		treeNumbers.add(1);
		treeNumbers.add(64);
		System.out.println(treeNumbers);// prints in sorted order.No duplicates
	}
}
