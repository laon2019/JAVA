package test11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine()), b = Integer.parseInt(bf.readLine()),
				v = Integer.parseInt(bf.readLine());
		int c = 0;
		int sum = a - b;
		if (sum > 0) {
			c = v / sum;
			c -= a - 1;
			System.out.println(c);
		}
	}
}
