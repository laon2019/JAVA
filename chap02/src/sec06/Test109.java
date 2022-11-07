package sec06;

public class Test109 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++)
			sum += i;
		System.out.printf("합(1~10) : %d\n", sum);
		for (int i = 10; i <= 100; i++)
			sum += i;
		System.out.printf("합(10~100) : %d\n", sum);
		for (int i = 100; i <= 1000; i++)
			sum += i;
		System.out.printf("합(100~1000) : %d\n", sum);
	}

}
