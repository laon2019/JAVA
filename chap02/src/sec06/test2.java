package sec06;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int a = in.nextInt();

		System.out.println(a % 2 == 0 ? "짝수" : "홀수");

	}

}
