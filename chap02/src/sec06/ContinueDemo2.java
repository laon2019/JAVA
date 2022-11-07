package sec06;

public class ContinueDemo2 {

	public static void main(String[] args) {
		int num;
		int count = 0;

		for (num = 1; num <= 1000; num++) {
			if (((num % 5 != 0) || (num % 7 != 0))) {
				continue;
			} else {
				count++;
				System.out.printf("%d\n", num);

			}
		}
		System.out.printf("%d", count);

	}

}
