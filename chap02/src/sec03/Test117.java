package sec03;

import java.util.Scanner;

public class Test117 {

	public static void main(String[] args) {
		int result = 1;
		int n;
		Scanner inScanner = new Scanner(System.in);
		n = inScanner.nextInt();
		while (true) {
			if (n > 0) {
				result *= n;
				n--;
			} else {
				break;
			}
		}
		System.out.printf("%d", result);

	}

}
