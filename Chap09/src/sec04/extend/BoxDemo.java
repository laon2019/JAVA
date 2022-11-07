package sec04.extend;

public class BoxDemo {

	public static void main(String[] args) {
//		Box<Apple> aBox = new Box<>();
		Box<Integer> aBox = new Box<>();
		aBox.set(560);
		System.out.println(aBox.get());

		Box<Double> cBox = new Box<>();
		cBox.set(123.4567);
		System.out.println(cBox.get());

	}

}
