package udemy;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = { -1, -12, 2, 3, 4, 5, 16, 6, 7, 8, 9, 12, 21 };
		System.out.println(smallestEl(arr));
		System.out.println(lergestEl(arr));


	}

	private static int smallestEl(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}

	private static int lergestEl(int[] arr) {
		int largest = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}


}
