package sec01;

public class LamdaGeneric {

	public static void main(String[] args) {
		GeCalculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(8, 9));
		GeCalculate<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(3.14, 4.14));
	}
}
