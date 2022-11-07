package sec03;

import java.util.Scanner;

public class Test123_5_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("a값을 입력하시오 : \n");
		int a = in.nextInt();
		System.out.printf("b값을 입력하시오 : \n");
		int b = in.nextInt();
		System.out.printf("c값을 입력하시오 : \n");
		int c = in.nextInt();

		if (a * a + b * b == c * c) {
			System.out.printf("%d, %d, %d", a, b, c);
		} else {
			System.out.println("X");
		}

	}
}
