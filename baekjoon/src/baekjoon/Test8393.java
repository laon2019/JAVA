package baekjoon;

import java.util.Scanner;

public class Test8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int max = -1;
		int num = 0;
		for (int i = 1; i <= 9; i++) {
			a = in.nextInt();
			if (max < a) {
				max = a;
				num = i;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
}