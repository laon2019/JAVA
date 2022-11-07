package sec06;

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So simple String");
		Unboxer.peekBox(box);

		Box<Integer> ibox = new Box<>();
		ibox.set(1132);
		Unboxer.peekBox4(ibox);

		Box<Boolean> bBox = new Box<>();
		bBox.set(false);
		Unboxer.peekBox2(bBox);

		Box<Double> dBox = new Box<>();
		dBox.set(123.123);
		Unboxer.peekBox2(dBox);
		Unboxer.peekBox3(dBox);
		// Unboxer.peekBox4(dBox);
	}

}
