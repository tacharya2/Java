package udemy;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<>();
		System.out.println(q);
		q.add("Apple");
		q.add("Mango");
		q.add("Aprocot");
		q.add("Amla");
		q.add("Papaya");
		q.remove("Amla");
		System.out.println(q);
		System.out.println(q.peek());// First element entered the queue is seen
		q.addAll(List.of("Zebra", "Giraffe", "Mongoose", "Panda"));

		System.out.println(q);
		System.out.println(q.poll());// The first element is polled out => works as remove() but no return
		System.out.println(q);
	}
}
