package sec01;

public class VarArgsDemo {

	public static void main(String[] args) {
		printSum("+", 1, 2, 3, 4, 5);
		printSum("-", 10, 20, 30);
		System.out.println(String.format("My score is %.1f", 99.8));
		System.out.println(String.join(",", "one", "two", "three"));

	}

	public static void printSum(String op, int... v) {
		int sum = 0;
		for (int i : v) {
			if (op.equals("+"))
				sum += i;
			else {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
