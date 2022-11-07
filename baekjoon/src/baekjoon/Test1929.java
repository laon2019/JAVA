package baekjoon;

import java.util.Scanner;

public class Test1929 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int count = 0;
		int[] array = new int[N - M];
		for (int i = 0; i <= N - M; i++) {
			array[i] = N;
			N++;
			if (array[i] % i == 0) {
				count++;
			}
			if (count == 1) {
				System.out.println(i + "/n");
			}
			count = 0;
		}
	}

}
