package sec03;

import java.util.Scanner;

public class Test125_10 {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num)) {
			System.out.printf("%d는 소수입니다.", num);
		} else {
			System.out.printf("%d는 소수가 아닙니다.", num);
		}

	}

	static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

}
