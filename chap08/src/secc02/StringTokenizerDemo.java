package secc02;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "of the people, by the people, for the people";
		StringTokenizer1(s, ", ");
		s = "PM:08:45";
		StringTokenizer1(s, ", ");
		s = "12+36-5/2=44";
		StringTokenizer1(s, "+-/=");

	}

	public static void StringTokenizer1(String s, String d) {
		StringTokenizer st = new StringTokenizer(s, d);
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println("[" + st.nextToken() + "]");
		}
		System.out.println();

	}

}
