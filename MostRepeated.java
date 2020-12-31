package udemy;

import java.util.Arrays;

public class MostRepeated {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 4, 2, 1, 3, 9, 9, 9, 9, 10, 4, 5, 4, 5, 1, 4, 3, 2, 2, 2 };
		int n = arr.length;

		System.out.println("Most frequent digit: " + mostRepeated(arr, n));
	}

	public static int mostRepeated(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int maxCount = 1;
		int result = arr[0];
		int count = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				count++;
			else {
				if (count > maxCount) {
					maxCount = count;
					result = arr[i - 1];

				}
				count = 1;
			}
		}
		// if the number is the last digit
		if (count > maxCount) {
			maxCount = count;
			result = arr[n - 1];
		}
		return result;

	}
}
