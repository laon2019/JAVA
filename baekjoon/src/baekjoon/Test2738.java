package baekjoon;

import java.util.Scanner;

public class Test2738 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] a = new int[N][M];
		int[][] b = new int[N][M];
		int[][] sum = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				b[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
