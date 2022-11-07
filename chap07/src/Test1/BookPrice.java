package Test1;

import java.util.Arrays;
import java.util.Comparator;

public class BookPrice {
	public static void main(String[] args) {
		Book[] book = { new Book(15000), new Book(50000), new Book(20000) };
		System.out.println("정렬 전");
		for (Book b : book)
			b.print();
		Arrays.sort(book, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				return o1.price - o2.price;
			}
		});

		System.out.println("정렬 후");
		for (Book b : book)
			b.print();

	}
}
