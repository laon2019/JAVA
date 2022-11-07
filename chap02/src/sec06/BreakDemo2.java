package sec06;

public class BreakDemo2 {

	public static void main(String[] args) {
		int num = 1;
		int count = 0;
		for (num = 1; num < 10000; num++) {
			if (((num % 5 == 0) && (num % 7 == 0))) {
				System.out.println(num);
				count++;
			}
			if (count >= 5) {
				break;
			}

		}

	}

}
