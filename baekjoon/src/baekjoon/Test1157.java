package baekjoon;

import java.util.Scanner;

public class Test1157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String T = in.next();
		String d = T.toUpperCase();
		int max = -1;
		int[] num = new int[26];
		for (int i = 0; i < d.length(); i++) {
			char ch = d.charAt(i);
			num[ch - 'A']++;
		}
		char ch = 0;
		for (int j = 0; j < d.length(); j++) {
			if (max < num[j]) {
				max = num[j];
				ch = (char) (j + 'A');
			} else if (num[j] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);

	}

}
