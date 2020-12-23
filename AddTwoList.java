package udemy;

public class AddTwoList {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] list2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		addTwoNums(list1, list2);
	}

	public static void addTwoNums(int[] L1, int[] L2) {


		for (int i = 0; i < L1.length; i++) {
			int L3 = L1[i] + L2[i];
			System.out.println((L3));
		}


	}

}
