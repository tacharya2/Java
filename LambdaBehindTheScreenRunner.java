package udemy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 1;
	}
}

class ConsumerImplement implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);

	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {

		return t * t;
	}

}

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		list.stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println("1:" + e));

		list.stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println("2:" + e));

		list.stream().filter(new EvenNumberPredicate()).forEach(new ConsumerImplement());

		list.stream().filter(new EvenNumberPredicate()).map(n -> n * n).forEach(new ConsumerImplement());

		list.stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(new ConsumerImplement());

	}
}
