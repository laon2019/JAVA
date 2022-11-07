package sec06;

public class ForDemo3 {

	public static void main(String[] args) {
		int num = 1;
		int count = 0;

		while (num < 10000) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				count++;
				System.out.printf("5의 배수이고 7의 배수인 정수 %d=> %4d\n", count, num);
				if (count > 4) {
					break;
				}
			}
			num++;
		}
		System.out.printf("while문의 반복횟수 => %d", num);

	}

}
