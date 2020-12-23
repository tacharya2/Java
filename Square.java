package udemy;

public class Square {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3 };

		System.out.println(mean(list));
		float sum = topSquareSum(list);
		System.out.println(sum);
	}

	public static float mean(int[] list) {
		float mean = 0;
		float sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];

			mean = sum / list.length;
		}

		return mean;
	}

	private static float topSquareSum(int[] list) {

		float topSum = 0;

		float mean = mean(list);
		for (int i = 0; i < list.length; i++) {
			topSum += ((list[i] - mean) * (list[i] - mean));
		}
		return topSum;
	}

}