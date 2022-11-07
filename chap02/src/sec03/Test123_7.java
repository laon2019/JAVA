package sec03;

import java.util.Scanner;

public class Test123_7 {

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
	}

	public static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.print(s + ":");
		s = in.next();
		return s;
	}

	public static void whosWin(String x, String y) {
		if (x.equals(y)) {
			System.out.println("무승부");
		} else if ((x.equals("r") && y.equals("s")) || (x.equals("s") && y.equals("p"))
				|| (x.equals("p") && y.equals("r")))
			System.out.println("철수, 승!");
		else if ((x.equals("s") && y.equals("r")) || (x.equals("p") && y.equals("s"))
				|| (x.equals("r") && y.equals("p")))
			System.out.println("영희승!");
		else {
			System.out.println("오류");
		}
	}
}
