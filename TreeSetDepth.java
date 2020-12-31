package udemy;

import java.util.Set;
import java.util.TreeSet;

//TreeSet are special as they implement Set and NavigableSet.
// That is they do not accept duplicates and 
public class TreeSetDepth {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>(Set.of(25, 36, 45, 39, 61, 99, 46));// no duplicates allowed
		System.out.println(numbers);// Already sorted
		// Output: [25, 36, 39, 45, 46, 61, 99]

		// returns the same object
		Object num = numbers.floor(39); // <=
		System.out.println(num);

		Object num2 = numbers.lower(39); // <. The other is higher that returns the opposite to lower.
		System.out.println(num2);

		Object num3 = numbers.ceiling(40); // >=
		System.out.println(num3);

		Object nums = numbers.subSet(2, 45);// All between
		System.out.println(nums);// Lower limit inclusive.

		// To make both the limits inclusive
		Object nums_inclusive = numbers.subSet(25, true, 45, true);// All between
		System.out.println(nums_inclusive);// Lower limit inclusive.

		Object numHead = numbers.headSet(50);
		System.out.println(numHead);

		Object numTail = numbers.tailSet(50);
		System.out.println(numTail);

		// How about the navigable interface? ==> All above

	}

}
