package sec02;

import java.util.Scanner;

public class ThrowDemo3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		square(in.nextLine());

	}

	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

}
