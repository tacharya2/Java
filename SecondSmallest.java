package udemy;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] list = { 10, 11, 14, 16, 19, 21, 26 };
		System.out.println(secondSmallest(list));

	}

	public static int secondSmallest(int[] list) {

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < list.length; i++) {
				if (list[i] < firstSmallest) {
					secondSmallest = firstSmallest;
					firstSmallest = list[i];

			} else if (list[i] < secondSmallest) {
				secondSmallest = list[i];
			}
		}

		return secondSmallest;

	}

}
