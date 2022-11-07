package secc02;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a값 :");
		int a = in.nextInt();
		System.out.print("z값 :");
		int z = in.nextInt();
		Random r = new Random();
		int[] b = new int[10];
//		int j = 0;
//		for (int i = 0; i < 10; i++) {
//			j = r.nextInt(z + 1);
//			if (j >= a) {
//				System.out.print(j + ", ");
//			} else {
//				i--;
//			}
		for (int i = 0; i < 10; i++) {
			b[i] = r.nextInt(z - a + 1) + a;
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j])
					i--;
			}
		}
		for (int m = 0; m < 10; m++) {
			System.out.print(b[m] + " ");
		}

	}

}
