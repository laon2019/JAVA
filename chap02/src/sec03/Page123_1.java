package sec03;

import java.util.Scanner;

public class Page123_1 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = inScanner.nextInt();
		System.out.println(factorial(x));
	}

	static int factorial(int n) {
		switch (n) {
		case 2:
			n = 2;
			break;
		default:
			n = n * factorial(n - 1);
		}
		return n;
	}
}
