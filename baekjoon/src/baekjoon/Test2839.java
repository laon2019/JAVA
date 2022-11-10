package baekjoon;

import java.util.Scanner;

public class Test2839 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a = 0;
		if(x==4||x==7) {
			System.out.println(-1);
		} else if (x % 5 == 3) {
			a = x / 5 + 1;
			System.out.println(a);
		} else if (x % 5 == 2) {
			a = x / 5;
			System.out.println(a);
		}else if (x % 5 == 1) {
			a = x / 5;
			System.out.println(a);
		}else if (x % 5 == 0) {
			a = x / 5;
			System.out.println(a);
		}
	}
}
