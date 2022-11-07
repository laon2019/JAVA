package sec06;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// double remainder = 25 % 2;
		// System.out.println("25 ÷ 2의 나머지는" + remainder + "입니다.");

		// Scanner in = new Scanner(System.in);
		// int x = in.nextInt();
		// remainder = x % 2;
		// System.out.println((remainder == 0) ? "짝수" : "홀수");

		int num1 = 7;
		int num2 = 3;
		double remainder;
		remainder = (double) num1 / (double) num2;

		System.out.printf("%9.7f", remainder);
	}

}
