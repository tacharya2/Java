package udemy;

public class Max {

	public static void main(String[] args) {
		int[] list = { 2, 3, 1, 6, 7, 10, 11 };
		System.out.println("Max: " + findMax(list));
		System.out.println("Min:" + findMin(list));
		System.out.println("Mean:" + mean(list));
		int min = findMin(list);
		int max = findMax(list);
		System.out.println("Mode: " + (max - min));
		System.out.println("Standard Deviation: " + standardDeviation(list));

	}

	private static int findMin(int[] list) {
		int minSoFar = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (minSoFar > list[i]) {
				minSoFar = list[i];
			}
		}
		return minSoFar;
	}

	private static int findMax(int[] list) {
		int maxSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (maxSoFar < list[i]) {
				maxSoFar = list[i];
			}
		}
		return maxSoFar;
	}

	public static float mean(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		return (float) sum / list.length;
	}

	public static float standardDeviation(int[] list) {

		float std = 0;
		int topSquareSum = 0;
		float mean = mean(list);
		for (int i = 0; i < list.length; i++) {

			float topSquare = (list[i] - mean) * (list[i] - mean);

			topSquareSum += topSquare;

			std = (float) Math.sqrt(topSquareSum / list.length);
		}

		return std;
	}
}
