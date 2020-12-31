package udemy;

import java.util.HashSet;
import java.util.Set;

//Popular set interface is HashSet
//set interface extends Collection interface
//Unique elements-no duplicates allowed.
//No positional access[no indexing]
public class SetInterface {

	public static void main(String[] args) {
		Set<String> set = Set.of("Apple", "Banana", "Cat");
		Set<String> hashset = new HashSet<>(set);
		hashset.add("Apples");
		System.out.println(hashset);

	}

}
