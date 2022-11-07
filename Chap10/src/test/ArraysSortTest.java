package test;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortTest {

	public static void main(String[] args) {
		String[] s = { "K", "o", "r", "e", "a", "n" };
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		Arrays.sort(s, (o1, o2) -> o1.compareToIgnoreCase(o2));
		for (String q : s) {
			System.out.print(q);
		}

	}

}
