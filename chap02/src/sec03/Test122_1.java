package sec03;

import java.util.Scanner;

public class Test122_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		if (a >= 19) {
			System.out.print("성년");
		} else {
			System.out.print("미성년");
		}

	}

}
