package baekjoon;

import java.util.Scanner;

public class Test2908 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		System.out.println(A > B ? A : B);

	}

}
