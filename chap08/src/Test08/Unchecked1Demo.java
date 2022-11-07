package Test08;

import java.util.StringTokenizer;

public class Unchecked1Demo {

	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "+");
		}
//		System.out.print(st.nextToken());

	}

}
