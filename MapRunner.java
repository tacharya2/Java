//Write a program that counts the number of letters found in a sentences
//For eg. "This is a great thing" => t = 3, h = 2, i = 3, s = 2.....
package udemy;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome ocassion. This has never happened before.";
		Map<Character, Integer> map = new HashMap<>();

		char[] chars = str.toCharArray();
		for (char letters : chars) {
			Integer integer = map.get(letters);
			// System.out.println(integer);
			if (integer == null) {
				map.put(letters, 1);
			} else {
				map.put(letters, integer + 1);
			}
		}
		System.out.println(map);


	Map<String, Integer> stringMap = new HashMap<>();

		String[] words = str.split(" ");
		for (String word : words) {
		Integer integer = stringMap.get(word);
		// System.out.println(integer);
		if (integer == null) {
			stringMap.put(word, 1);
		} else {
			stringMap.put(word, integer + 1);
		}
		}
		System.out.println(stringMap);
	}
}
