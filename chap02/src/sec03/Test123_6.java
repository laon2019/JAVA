package sec03;

import java.util.Scanner;

public class Test123_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("철수 : ");
		String x = in.next();

		System.out.print("영희 : ");
		String y = in.next();

		if (x.equals("r")) {
			if (y.equals("r")) {
				System.out.println("무승부");
			} else if (y.equals("s")) {
				System.out.println("철수, 승!");
			} else if (y.equals("p")) {
				System.out.println("영희, 승!");
			}
		}

		if (x.equals("s")) {
			if (y.equals("s")) {
				System.out.println("무승부");
			} else if (y.equals("p")) {
				System.out.println("철수, 승!");
			} else if (y.equals("r")) {
				System.out.println("영희, 승!");
			}
		}

		if (x.equals("p")) {
			if (y.equals("p")) {
				System.out.println("무승부");
			} else if (y.equals("r")) {
				System.out.println("철수, 승!");
			} else if (y.equals("s")) {
				System.out.println("영희, 승!");
			}
		}
	}

}
