package sec02;

import java.util.Scanner;

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.println("나이 입력 : ");
		int age;
		try {
			age = readAge();
			System.out.println("입력된 나이는 : " + age);
		} catch (ReadAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int readAge() throws ReadAgeException {
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if (age < 0) {
			throw new ReadAgeException();
		}
		return age;
	}

}
