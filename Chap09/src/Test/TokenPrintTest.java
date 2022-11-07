package Test;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		try {
			showTokens(s, ", ");
		} catch (NoSuchElementException e) {
			System.out.println("끝");
		}

	}

	private static void showTokens(String s, String string) {
		StringTokenizer st = new StringTokenizer(s, string);
		while (true) {
			System.out.println(st.nextToken());
		}
	}

}
