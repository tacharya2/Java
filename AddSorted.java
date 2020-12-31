package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a program that automatically sorts an added element to an existing list
public class AddSorted {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 11, 2, 13, 4, 15, 6, 27, 8, 10);

		System.out.println(sortedAdd(list));

	}

	private static List<Integer> sortedAdd(List<Integer> list) {
		List<Integer> list2 = new ArrayList<>(list);

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");


		int num = scan.nextInt();

		list2.add(num);
		scan.close();
		// System.out.println(list2);
		Collections.sort(list2);
		return list2;
	}

}
