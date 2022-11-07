package sec01;

import java.util.Scanner;

public class Page209_5 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] hist = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");
		for (int i = 0; i < 10; i++) {
			nums[i] = in.nextInt();
		}
		for (int j = 0; j < 10; j++) {
			if (nums[j] >= 0 && nums[j] <= 9) {
				hist[0]++;
			} else if (nums[j] / 10 == 1) {
				hist[1]++;
			} else if (nums[j] / 10 == 2) {
				hist[2]++;
			} else if (nums[j] / 10 == 3) {
				hist[3]++;
			} else if (nums[j] / 10 == 4) {
				hist[4]++;
			} else if (nums[j] / 10 == 5) {
				hist[5]++;
			} else if (nums[j] / 10 == 6) {
				hist[6]++;
			} else if (nums[j] / 10 == 7) {
				hist[7]++;
			} else if (nums[j] / 10 == 8) {
				hist[8]++;
			} else if (nums[j] / 10 == 9) {
				hist[9]++;
			}
		}
		for (int k = 0; k < 10; k++) {
			System.out.print((k * 10) + "~" + (k * 10 + 9) + " : ");
			for (int l = 0; l < hist[k]; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
