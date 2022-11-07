package sec06;

import java.util.Scanner;

public class test004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int a = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		int b = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		int c = in.nextInt();
		if (a + b + c >= 140 && a >= 70 && b >= 30 && c >= 30) {
			System.out.println("졸업가능");
		} else if (a + b + c >= 140 && a >= 70 && (b + c) >= 80) {
			System.out.println("졸업가능");
		} else {
			System.out.println("졸업불가능");
		}
	}

}
