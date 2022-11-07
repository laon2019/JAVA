package sec03;

import java.util.Scanner;

public class Test122_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();

		switch (x) {
		case 1:
			System.out.print("아주잘했습니다");
			break;
		case 2:
		case 3:
			System.out.print("잘했습니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.print("보통입니다.");
			break;
		default:
			System.out.print("노력하세요");
		}

	}

}
