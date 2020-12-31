package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		int[] arr1 = { 0, 7, 2, 4, 6, 1, 8, 10 };
		int[] arr2 = { 37, 38, 39, 310, 311, 312 };

		Arrays.sort(arr1);
		System.out.println("Sorted: " + Arrays.toString(arr1));

		// Defining and initializing a list.
		List<Integer> L1 = Arrays.asList(1, 3, 5, 7, 9, 11);
		List<Integer> L2 = Arrays.asList(0, 2, 4, 6, 8, 10);

		// define a third list to merge the above two
		List<Integer> L = new ArrayList<>();

		// add L1 to L
		L.addAll(L1);

		System.out.println(L);

		// add L2 to L
		L.addAll(L2);
		System.out.println(L);

		// sort them
		Collections.sort(L);
		System.out.println(L);

		// add array elements(of arr2) into a list (L)
		for (int elements : arr2) {
			L.add(elements);
		}
		System.out.println(L);
	}
}
