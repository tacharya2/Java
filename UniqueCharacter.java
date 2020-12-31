package udemy;

//Write a java program to sort a unique character in sorted order
//for eg. list of 'E','A', 'B', 'A', 'C' would give A, B, C, E

//Idea use treeset
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class UniqueCharacter {

	public static void main(String[] args) {
		List<Character> abc = List.of('E', 'D', 'A', 'B', 'C', 'D', 'E', 'A', 'C', 'F');

		Set<Character> set = new TreeSet<>(abc);

		System.out.println(set);

		// How about the way it was inserted?
		// Use LinkedHashSet

		// When you don't need to worry about the order, use any of the above or use
		// HashSet to randomize

	}

}
