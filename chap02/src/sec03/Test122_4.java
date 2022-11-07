package sec03;

public class Test122_4 {

	public static void main(String[] args) {

		int n;
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d * %2d = %3d", i, j, j * i);
			}
			System.out.println();
		}

	}

}
