package sec03;

public class BoxFault2 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		aBox.setOb("Apple");
		bBox.setOb("Orange");

		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) bBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}
}
