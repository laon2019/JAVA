package test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> consumer = t -> System.out.println(t + " " + (t >= 2 ? "apples" : "apple"));
		consumer.accept(3);
		consumer.accept(1);
	}
}
