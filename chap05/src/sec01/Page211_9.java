package sec01;

import java.util.Scanner;

public class Page211_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = 0;
		int n = 0;
		double p;
		m = in.nextInt();
		n = in.nextInt();
		p = in.nextDouble();
		char map[][] = new char[m][n];
		char map1[][] = new char[m][n];
		int fuck[][] = { { -1, 0 }, { 1, 0 }, { -1, 1 }, { -1, -1 }, { 1, -1 }, { 1, 1 }, { 0, -1 }, { 0, +1 } };
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (Math.random() < p) {
					map[i][j] = '*';
				} else {
					map[i][j] = '-';
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == '*') {
					map1[i][j] = '*';
					continue;
				} else {
					int x = 0;
					for (int o = 0; o < 8; o++) {
						if (i + fuck[o][1] < 0 || j + fuck[o][0] < 0 || i + fuck[o][1] >= m || j + fuck[o][0] >= n) {
							continue;
						} else {
							if (map[i + fuck[o][1]][j + fuck[o][0]] == '*') {
								x++;
							}
						}
					}
					map1[i][j] = (char) ((char) x + '0');
				}

			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map1[i][j] + " ");
			}
			System.out.println();

		}
	}
}
