package sec06;

import java.util.Scanner;

public class test003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 : ");
		int a = in.nextInt();

		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;

		System.out.printf("%d", b + c + d);

	}
}