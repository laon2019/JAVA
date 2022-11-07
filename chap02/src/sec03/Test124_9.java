package sec03;

public class Test124_9 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");

	}

	static void foo(String x, int y, int z) {
		System.out.printf("%s %d %d\n", x, y, z);
	}

	static void foo(String x, int y) {
		System.out.printf("%s %d\n", x, y);
	}

	static void foo(String x) {
		System.out.printf("%s\n", x);
	}
}
