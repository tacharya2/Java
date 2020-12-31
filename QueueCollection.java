package udemy;

import java.util.Collection;
import java.util.Iterator;

public class QueueCollection {
	// Upper level interface
	interface Queue<E> extends Collection<E> {
		@Override
		boolean add(E ParamE);

		boolean offer(E ParamE);

		E remove();

		E poll();

		E peek();
	}

	class PriorityQueue implements Queue { // Sorted all natural

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray(Object[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean add(Object ParamE) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean offer(Object ParamE) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object remove() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object peek() {
			// TODO Auto-generated method stub
			return null;
		}
		//
	}

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue();
		System.out.println(q);
	}
}
