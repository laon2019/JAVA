package sec01;

public class TwoParamAndReturn {

	public static void main(String[] args) {
		Calculate c;
		c = new Calculate() {

			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};
		c = (a, b) -> {
			return a + b;
		};
		c = (a, b) -> a + b;
		System.out.println(c.cal(4, 5));
	}
}
