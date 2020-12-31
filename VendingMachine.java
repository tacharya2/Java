package udemy;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Write a program that dispense varieties of soda cans from a vending machine that are kept in a line.
//Hint: The soda can be alphabetically rearranged.
public class VendingMachine {

	public static void main(String[] args) {

		List<Object> list = List.of("Pepsi", "Diet-Coke", "Fanta-Orange", "Root-Beer", "Sprite", "Classic");
		Queue<Object> sodas = new PriorityQueue<>(list);
		System.out.println(sodas);
		int soda = sodas.size();
		while (sodas.size() > 0) {
			sodas.poll();
			soda--;
			if (soda == 1) {
				break;
			}
		}
		System.out.println("Wait, we will refill more");

	}

	// The above method is quite not useful as it does not care about preferred type
	// of soda by the customer
	// To customize the variety per customer's choice is still a difficult task
	// But we can improve the above vending method to a better one.

	class StringLegthComparator implements Comparator<String> {

		@Override
		public int compare(String value1, String value2) {
			// return value1.length().compareTo(value2.length());// Cannot return primitive
			// type (int).
			return Integer.compare(value1.length(), value2.length());
		}

		// find a separate class name StringLengthComparator for actual implementation
	}

}
