package sec04;

public class BoxGeneric {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		Box<Orange> bBox = new Box<>();

		aBox.setOb(new Apple());
		bBox.setOb(new Orange());

//		aBox.setOb("apple");

		Apple ap = aBox.getOb();
		Orange og = bBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}

}
