package sec06;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double area;

		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double w = in.nextDouble();

		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double h = in.nextDouble();
		area = w * h;

		System.out.printf("직사각형의 넓이는 %.1f입니다.", area);

	}

}
