package sec03;

import java.util.Scanner;

public class Test122_3 {

	public static void main(String[] args) {
		int j = 0, n;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = in.nextInt();
			if (n % 2 == 0)
				j += n;

		} while (n > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 : " + j);
	}

}
