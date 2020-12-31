package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 19, 11, 45, 12);

		List<Integer> L = new ArrayList<>(list);
		System.out.println(L);
		Collections.sort(L);
		System.out.println(L);
		L.add(17);
		System.out.println(L);
	}

	// Write a program that automatically sorts an added element to an existing list

}
