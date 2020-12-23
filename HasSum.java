package udemy;

import java.util.Arrays;
import java.util.HashSet;

public class HasSum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, -8 };
		int k = 2;
		int arrSize = arr.length;
		boolean result = hasPairToSum(arr, arrSize, k);

		if (result == true) {
			System.out.println("The pair exists;");
		} else {
			System.out.println("The pair does not exists...");
		}
		findpairs(arr, k);

	}

	public static boolean hasPairToSum(int[] arr, int arrSize, int k) {

		// sort
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		int lower = 0;
		int upper = arr.length - 1;

		while (lower < upper) {
			if (arr[lower] + arr[upper] == k) {
				return true;
			} else if (arr[lower] + arr[upper] < k) {
				lower++;

			} else { // (arr[lower] + arr[upper] > k)
				upper--;
			}
		}
		return false;
	}

	// finding two numbers in an array that sums up to a given target number.
	// Uses HashSet.
	static void findpairs(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int first = sum - arr[i];
			if (set.contains(first)) {
				System.out.println("The number " + first + " and " + arr[i] + " sums up to make " + sum);

			}
			set.add(arr[i]);
		}
	}
}

