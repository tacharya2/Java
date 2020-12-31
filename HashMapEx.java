package udemy;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 25);
		map.put("b", 50);
		map.put("c", 75);
		map.put("d", 100);
		System.out.println("Original Map: " + map);
		map.remove("d", 100); // rarely used
		System.out.println("Removing 'd': " + map);
		map.put("e", 100);
		System.out.println("Adding 'e': " + map);
		map.remove("c"); // a pair will get removed
		System.out.println("Removing Key 'c': " + map);
		boolean what = map.containsKey("c");
		System.out.println(what);
		boolean value = map.containsValue(50);
		System.out.println(value);
		int a = map.get("a");
		System.out.println(a);
		System.out.println("entrySet(): " + map.entrySet());// returns the set
		map.replace("e", 100, 125);
		System.out.println(map);
		System.out.println(map.values());


	}
}
