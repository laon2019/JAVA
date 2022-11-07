package Test1;

import java.util.Scanner;

public class EchoerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Echoer e = new Echoer() {
			@Override
			void echo() {
				String a, b, c;
				a = in.nextLine();
				System.out.println(a);
				b = in.nextLine();
				System.out.println(b);
				c = in.nextLine();
				System.out.println(c);

			}

		};
		e.start();
		e.echo();
		e.stop();

	}

}
