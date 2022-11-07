package sec06;

import java.util.Scanner;

public class Test105_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();

		switch (score / 10) {
		case 10:
			grade = "a";
			break;
		case 9:
			grade = "a";
			break;
		case 8:
			grade = "b";
			break;
		case 7:
			grade = "c";
			break;
		case 6:
			grade = "d";
			break;
		default:
			grade = "f";

		}
		System.out.println("당신의 학점은" + grade);
	}

}
