package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementedAs {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();// unsorted, unordered
		map.put("Apple", 3);
		map.put("Banana", 5);
		map.put("Grape", 6);
		map.put("Apricot", 2);
		System.out.println(map);
		// output: {Apple=3, Grape=6, Apricot=2, Banana=5}

		Map<String, Integer> linkedHashmap = new LinkedHashMap<>();// unsorted, ordered
		linkedHashmap.put("Apple", 3);
		linkedHashmap.put("Banana", 5);
		linkedHashmap.put("Grape", 6);
		linkedHashmap.put("Apricot", 2);
		System.out.println(linkedHashmap);
		// output: {Apple=3, Banana=5, Grape=6, Apricot=2}

		Map<String, Integer> treeHashmap = new TreeMap<>();// sorted, unordered.
		treeHashmap.put("Apple", 3);
		treeHashmap.put("Banana", 5);
		treeHashmap.put("Grape", 6);
		treeHashmap.put("Apricot", 2);
		System.out.println(treeHashmap);
		// output:{Apple=3, Apricot=2, Banana=5, Grape=6}
	}
}
