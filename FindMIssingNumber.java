package udemy;

public class FindMIssingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int num = missing(arr);
		if (num == -1) {
			System.out.println("No missing number is found.");
		} else {
			System.out.println(num + " is missing...");
		}
	}

	private static int missing(int[] arr) {
		int missing = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				return arr[i] + 1;
			} else {
				missing = -1;
			}
		}
		return missing;
	}
}
