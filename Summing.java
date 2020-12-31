package udemy;

public class Summing {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = sum(arr);
		System.out.println(total);

	}

	private static int sum(int[] carr) {
		int tot = 0;
		for (int e : carr) {
			tot += e;
		}
		return tot;
	}

}
