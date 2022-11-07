package sec04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		String[] fruits = { "바나나", "사과", "키위", "포도", "사과" };
		List<String> list = Arrays.asList(fruits);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);
	}
}
