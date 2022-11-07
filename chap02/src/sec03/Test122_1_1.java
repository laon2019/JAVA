package sec03;

import java.util.Scanner;

public class Test122_1_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		System.out.print("양의 정수를 입력하세요 : ");
		int x = in.nextInt();
		do {
			if (x % 2 == 0)
				i += x;
			System.out.print("양의 정수를 입력하세요 : ");
			x = in.nextInt();
		} while (x > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 : " + i);

	}
}
