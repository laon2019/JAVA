package sec03;

public class CharTypeUnicode {

	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';

		char ch3 = 54736;
		char ch4 = 54869;

		char ch5 = 0xD5D0;
		char ch6 = 0xD655;

		System.out.println(ch1 + ", " + ch2);
		System.out.println(ch3 + ", " + ch4);
		System.out.println((int) ch5 + ", " + (int) ch6);

		char a, b, c;
		a = 'A';
		b = 65;
		c = '\u0041';
		// d = "A";

		System.out.println(a + "\n" + b + "\n" + c);
	}

}
