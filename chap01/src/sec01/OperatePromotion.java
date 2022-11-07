package sec01;

public class OperatePromotion {

	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		int result = num1 + num2;
		short result2 = (short) (num1 + num2);
		System.out.println(result);
		System.out.println(result2);
		//
		//
		int fifteen = 15;
		byte fifteen1 = 0b1111;
		short fifteen2 = 017;
		int fifteen3 = 0xF;
		long lightSpeed = 300000L;

		System.out.println("int형 변수 fifteen에 십진수 15를 할당 : " + fifteen);
		System.out.println("byte형 변수 fifteen1에 2진수 0b1111를 할당 : " + fifteen1);
		System.out.println("short형 변수 fifteen2에 8진수 017를 할당 : " + fifteen2);
		System.out.println("int형 변수 fifteen3에 16진수 0xF를 할당 : " + fifteen3);
		System.out.println("long lightSpeed = 300000L : " + lightSpeed);
		//
		//
		double half = 0.5;
		double half1 = 5E-1;
		float pi = 3.14159f;
		double pi1 = 3.14159;

		System.out.println(half);
	}

}
