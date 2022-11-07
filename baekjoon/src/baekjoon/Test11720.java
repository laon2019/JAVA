package baekjoon;

import java.util.Scanner;

public class Test11720 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String b = in.next();
		int sum = 0;
		for (int i = 0; i < T; i++) {
			char ch = b.charAt(i);
			sum += ch - '0';
		}
		System.out.println(sum);
	}

}
